package compiler.ast.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.*;
import compiler.ast.nodes.css.*;
import compiler.ast.nodes.html.*;
import compiler.ast.nodes.jinja.*;
import compiler.ast.nodes.python.*;

public class PrintVisitor implements AstVisitor<Void> {

    private String prefix = "";
    private boolean isLast = true;

    public void printTree(AstNode root) {
        root.accept(this);
    }

    private void printCurrentNode(AstNode node) {
        String connector = isLast ? "└── " : "├── ";
        String className = node.getClass().getSimpleName();
        System.out.println(prefix + connector + className + " (line " + node.getLine() + ")");
    }

    private void visitChildren(AstNode node) {
        var children = node.getChildren();
        for (int i = 0; i < children.size(); i++) {
            boolean lastChild = (i == children.size() - 1);
            String oldPrefix = prefix;
            boolean oldIsLast = isLast;

            isLast = lastChild;
            prefix += oldIsLast ? "    " : "│   ";

            children.get(i).accept(this);

            prefix = oldPrefix;
            isLast = oldIsLast;
        }
    }

    @Override
    public Void visitPythonFile(PythonFileNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitDef(DefNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitIf(IfNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitFor(ForNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitAssign(AssignNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitReturn(ReturnNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitGlobal(GlobalNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitImport(ImportNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitFromImport(FromImportNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitSuite(SuiteNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitDecorator(DecoratorNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    // Python Expressions
    @Override
    public Void visitName(NameNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitNumber(NumberNode node) {
        printCurrentNode(node);
        return null;
    }

    @Override
    public Void visitString(StringNode node) {
        printCurrentNode(node);
        return null;
    }

    @Override
    public Void visitBinOp(BinOpNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitUnaryOp(UnaryOpNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitNot(NotNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitCall(CallNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitAttrAccess(AttrAccessNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitSubscript(SubscriptNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitList(ListNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitDict(DictNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitTuple(TupleNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitListComp(ListCompNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitGeneratorExpr(GeneratorExprNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitKeywordArg(KeywordArgNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    // Template/HTML/CSS Nodes
    @Override
    public Void visitTemplate(TemplateNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitText(TextNode node) {
        printCurrentNode(node);
        return null;
    }

    @Override
    public Void visitHtmlElement(HtmlElementNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitJinjaExpr(JinjaExprNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitJinjaStmt(JinjaStmtNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitCssStylesheet(CssStylesheetNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitCssRule(CssRuleNode node) {
        printCurrentNode(node);
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitCssDeclaration(CssDeclarationNode node) {
        printCurrentNode(node);
        return null;
    }
}
