package compiler.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.python.*;
import compiler.parser.PythonSubsetParser.*;
import compiler.parser.PythonSubsetParserBaseVisitor;

public class PythonAstBuilder extends PythonSubsetParserBaseVisitor<AstNode> {

    @Override
    public AstNode visitFile_input(File_inputContext ctx) {
        AstNode root = new AstNode("PythonFile", 1) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        for (StmtContext stmt : ctx.stmt()) {
            AstNode stmtNode = visit(stmt);
            if (stmtNode != null) {
                root.addChild(stmtNode);
            }
        }

        return root;
    }

    // ===== Statements =====

    @Override
    public AstNode visitFunction_def(Function_defContext ctx) {
        int line = ctx.getStart().getLine();
        String funcName = ctx.NAME().getText();

        DefNode defNode = new DefNode(funcName, line);

        if (ctx.parameters() != null) {
            for (ParameterContext param : ctx.parameters().parameter()) {
                defNode.addParam(param.NAME().getText());
            }
        }

        AstNode body = visit(ctx.suite());
        if (body != null) {
            defNode.addChild(body);
        }

        return defNode;
    }

    @Override
    public AstNode visitAssign_stmt(Assign_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        AssignNode assignNode = new AssignNode(line);

        NameNode target = new NameNode(ctx.NAME().getText(), line);
        assignNode.addChild(target);

        AstNode value = visit(ctx.test());
        if (value != null) {
            assignNode.addChild(value);
        }

        return assignNode;
    }

    @Override
    public AstNode visitFor_stmt(For_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        String varName = ctx.NAME().getText();

        ForNode forNode = new ForNode(varName, line);

        AstNode iterable = visit(ctx.test());
        if (iterable != null) {
            forNode.addChild(iterable);
        }

        AstNode body = visit(ctx.suite());
        if (body != null) {
            forNode.addChild(body);
        }

        return forNode;
    }

    @Override
    public AstNode visitIf_stmt(If_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        IfNode ifNode = new IfNode(line);

        // Main if condition
        AstNode condition = visit(ctx.test(0));
        if (condition != null) {
            ifNode.addChild(condition);
        }

        // Main if body
        AstNode thenBlock = visit(ctx.suite(0));
        if (thenBlock != null) {
            ifNode.addChild(thenBlock);
        }

        // Elif blocks
        for (int i = 1; i < ctx.test().size(); i++) {
            AstNode elifCond = visit(ctx.test(i));
            if (elifCond != null) {
                ifNode.addChild(elifCond);
            }
            AstNode elifBody = visit(ctx.suite(i));
            if (elifBody != null) {
                ifNode.addChild(elifBody);
            }
        }

        // Else block
        if (ctx.ELSE() != null) {
            int elseIndex = ctx.suite().size() - 1;
            AstNode elseBlock = visit(ctx.suite(elseIndex));
            if (elseBlock != null) {
                ifNode.addChild(elseBlock);
            }
        }

        return ifNode;
    }

    @Override
    public AstNode visitReturn_stmt(Return_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode returnNode = new AstNode("Return", line) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        if (ctx.test() != null) {
            AstNode value = visit(ctx.test());
            if (value != null) {
                returnNode.addChild(value);
            }
        }

        return returnNode;
    }

    @Override
    public AstNode visitSuite(SuiteContext ctx) {
        if (ctx.simple_stmt() != null) {
            return visit(ctx.simple_stmt());
        } else {
            AstNode suite = new AstNode("Suite", ctx.getStart().getLine()) {
                @Override
                public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                    return null;
                }
            };

            for (StmtContext stmt : ctx.stmt()) {
                AstNode stmtNode = visit(stmt);
                if (stmtNode != null) {
                    suite.addChild(stmtNode);
                }
            }

            return suite;
        }
    }

    // ===== Expressions =====

    @Override
    public AstNode visitNameAtom(NameAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode(ctx.NAME().getText(), line);
    }

    @Override
    public AstNode visitNumberAtom(NumberAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new NumberNode(ctx.NUMBER().getText(), line);
    }

    @Override
    public AstNode visitStringAtom(StringAtomContext ctx) {
        int line = ctx.getStart().getLine();
        StringBuilder sb = new StringBuilder();
        for (var str : ctx.STRING()) {
            String text = str.getText();
            text = text.substring(1, text.length() - 1);
            sb.append(text);
        }
        return new StringNode(sb.toString(), line);
    }

    @Override
    public AstNode visitTrueAtom(TrueAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode("True", line);
    }

    @Override
    public AstNode visitFalseAtom(FalseAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode("False", line);
    }

    @Override
    public AstNode visitNoneAtom(NoneAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode("None", line);
    }

    @Override
    public AstNode visitCallTrailer(CallTrailerContext ctx) {
        // This is handled in atom_expr
        return visitChildren(ctx);
    }

    @Override
    public AstNode visitAtom_expr(Atom_exprContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode base = visit(ctx.atom());

        if (ctx.trailer() == null || ctx.trailer().isEmpty()) {
            return base;
        }

        // Process trailers left to right
        AstNode current = base;
        for (TrailerContext trailer : ctx.trailer()) {
            if (trailer instanceof CallTrailerContext) {
                CallNode callNode = new CallNode(line);
                callNode.addChild(current);

                CallTrailerContext call = (CallTrailerContext) trailer;
                if (call.arguments() != null) {
                    for (ArgumentContext arg : call.arguments().argument()) {
                        AstNode argNode = visit(arg);
                        if (argNode != null) {
                            callNode.addChild(argNode);
                        }
                    }
                }
                current = callNode;
            } else if (trailer instanceof AttrTrailerContext) {
                AttrAccessNode attrNode = new AttrAccessNode(line);
                attrNode.addChild(current);

                AttrTrailerContext attr = (AttrTrailerContext) trailer;
                attrNode.addChild(new NameNode(attr.NAME().getText(), line));
                current = attrNode;
            } else if (trailer instanceof IndexTrailerContext) {
                AstNode subscriptNode = new AstNode("Subscript", line) {
                    @Override
                    public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                        return null;
                    }
                };
                subscriptNode.addChild(current);

                IndexTrailerContext index = (IndexTrailerContext) trailer;
                AstNode indexExpr = visit(index.test());
                if (indexExpr != null) {
                    subscriptNode.addChild(indexExpr);
                }
                current = subscriptNode;
            }
        }

        return current;
    }

    @Override
    public AstNode visitComparison(ComparisonContext ctx) {
        if (ctx.comp_op() == null || ctx.comp_op().isEmpty()) {
            return visit(ctx.expr(0));
        }

        int line = ctx.getStart().getLine();
        BinOpNode binOpNode = new BinOpNode(ctx.comp_op(0).getText(), line);

        AstNode left = visit(ctx.expr(0));
        if (left != null) {
            binOpNode.addChild(left);
        }

        AstNode right = visit(ctx.expr(1));
        if (right != null) {
            binOpNode.addChild(right);
        }

        return binOpNode;
    }

    @Override
    public AstNode visitExpr(ExprContext ctx) {
        if (ctx.term().size() == 1) {
            return visit(ctx.term(0));
        }

        int line = ctx.getStart().getLine();
        String op = ctx.PLUS() != null ? "+" : "-";
        BinOpNode binOpNode = new BinOpNode(op, line);

        AstNode left = visit(ctx.term(0));
        if (left != null) {
            binOpNode.addChild(left);
        }

        AstNode right = visit(ctx.term(1));
        if (right != null) {
            binOpNode.addChild(right);
        }

        return binOpNode;
    }

    @Override
    public AstNode visitTerm(TermContext ctx) {
        if (ctx.factor().size() == 1) {
            return visit(ctx.factor(0));
        }

        int line = ctx.getStart().getLine();
        String op = "*";
        if (ctx.SLASH() != null) op = "/";
        else if (ctx.PERCENT() != null) op = "%";
        else if (ctx.DOUBLESLASH() != null) op = "//";

        BinOpNode binOpNode = new BinOpNode(op, line);

        AstNode left = visit(ctx.factor(0));
        if (left != null) {
            binOpNode.addChild(left);
        }

        AstNode right = visit(ctx.factor(1));
        if (right != null) {
            binOpNode.addChild(right);
        }

        return binOpNode;
    }

    @Override
    public AstNode visitListAtom(ListAtomContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode listNode = new AstNode("List", line) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        if (ctx.testlist() != null) {
            for (TestContext test : ctx.testlist().test()) {
                AstNode elem = visit(test);
                if (elem != null) {
                    listNode.addChild(elem);
                }
            }
        }

        return listNode;
    }

    @Override
    public AstNode visitDictAtom(DictAtomContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode dictNode = new AstNode("Dict", line) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        // Simplified - just collect children
        if (ctx.dictorsetmaker() != null) {
            for (TestContext test : ctx.dictorsetmaker().test()) {
                AstNode elem = visit(test);
                if (elem != null) {
                    dictNode.addChild(elem);
                }
            }
        }

        return dictNode;
    }

    @Override
    public AstNode visitParenAtom(ParenAtomContext ctx) {
        if (ctx.test() != null) {
            return visit(ctx.test());
        }
        return null;
    }

    @Override
    public AstNode visitPositionalArgument(PositionalArgumentContext ctx) {
        return visit(ctx.test());
    }

    @Override
    public AstNode visitKeywordArgument(KeywordArgumentContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode kwNode = new AstNode("KeywordArg", line) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };
        kwNode.addChild(new NameNode(ctx.NAME().getText(), line));
        AstNode value = visit(ctx.test());
        if (value != null) {
            kwNode.addChild(value);
        }
        return kwNode;
    }
}