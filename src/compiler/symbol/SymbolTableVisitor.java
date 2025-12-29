package compiler.symbol;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.*;
import compiler.ast.nodes.css.*;
import compiler.ast.nodes.html.HtmlElementNode;
import compiler.ast.nodes.jinja.*;
import compiler.ast.nodes.python.*;
import compiler.ast.visitors.AstVisitor;

public class SymbolTableVisitor implements AstVisitor<Void> {

    private Scope currentScope;
    private Scope globalScope;

    public SymbolTableVisitor() {
        globalScope = new Scope("global", null);
        currentScope = globalScope;
    }

    public Scope getGlobalScope() {
        return globalScope;
    }

    public void printSymbolTable() {
        printScope(globalScope, 0);
    }

    private void printScope(Scope scope, int indent) {
        String indentStr = "  ".repeat(indent);
        System.out.println(indentStr + "Scope: " + scope.getName());

        if (!scope.getSymbols().isEmpty()) {
            System.out.println(indentStr + "Symbols:");
            for (Symbol symbol : scope.getSymbols().values()) {
                System.out.println(indentStr + "  " + symbol.getName() +
                        ": " + symbol.getType() +
                        " (line " + symbol.getLine() + ")");
            }
        }

        // Print child scopes
        for (Scope child : scope.getChildren()) {
            System.out.println();
            printScope(child, indent + 1);
        }
    }

    // ========== PYTHON STATEMENTS ==========

    @Override
    public Void visitDef(DefNode node) {
        // Define function in current scope
        Symbol funcSymbol = new Symbol(node.getName(), "function", node.getLine());
        currentScope.define(funcSymbol);

        // Create new scope for function
        Scope funcScope = new Scope(node.getName(), currentScope);
        currentScope.addChild(funcScope);
        Scope previousScope = currentScope;
        currentScope = funcScope;

        // Define parameters in function scope
        for (String param : node.getParams()) {
            Symbol paramSymbol = new Symbol(param, "parameter", node.getLine());
            currentScope.define(paramSymbol);
        }

        // Visit function body
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }

        // Return to previous scope
        currentScope = previousScope;
        return null;
    }

    @Override
    public Void visitAssign(AssignNode node) {
        // First child is the target (NameNode), second is the value
        if (!node.getChildren().isEmpty()) {
            AstNode target = node.getChildren().get(0);
            if (target instanceof NameNode) {
                String varName = ((NameNode) target).getName();
                Symbol varSymbol = new Symbol(varName, "variable", node.getLine());
                currentScope.define(varSymbol);
            }

            // Visit value expression to collect any names
            if (node.getChildren().size() > 1) {
                node.getChildren().get(1).accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visitFor(ForNode node) {
        // Define loop variable in current scope
        Symbol loopVar = new Symbol(node.getVarName(), "loop_variable", node.getLine());
        currentScope.define(loopVar);

        // Visit children (iterable and body)
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }

        return null;
    }

    @Override
    public Void visitIf(IfNode node) {
        // Visit all children (condition, then, elif, else blocks)
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    // ========== PYTHON EXPRESSIONS ==========

    @Override
    public Void visitName(NameNode node) {
        // Check if this name is defined
        Symbol symbol = currentScope.resolve(node.getName());
        if (symbol == null) {
            // This is a reference to an undefined variable
            // You might want to report this as an error
        }
        return null;
    }

    @Override
    public Void visitCall(CallNode node) {
        // Visit all children (function and arguments)
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visitAttrAccess(AttrAccessNode node) {
        // Visit children
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visitBinOp(BinOpNode node) {
        // Visit children (left and right operands)
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visitString(StringNode node) {
        // Literals don't affect symbol table
        return null;
    }

    @Override
    public Void visitNumber(NumberNode node) {
        // Literals don't affect symbol table
        return null;
    }

    // ========== TEMPLATE NODES (usually not included in symbol table) ==========

    @Override
    public Void visitTemplate(TemplateNode node) {
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visitText(TextNode node) {
        return null;
    }

    @Override
    public Void visitHtmlElement(HtmlElementNode node) {
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visitJinjaExpr(JinjaExprNode node) {
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visitJinjaStmt(JinjaStmtNode node) {
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    // ========== CSS NODES (not included in symbol table) ==========

    @Override
    public Void visitCssStylesheet(CssStylesheetNode node) {
        return null;
    }

    @Override
    public Void visitCssRule(CssRuleNode node) {
        return null;
    }

    @Override
    public Void visitCssDeclaration(CssDeclarationNode node) {
        return null;
    }
}