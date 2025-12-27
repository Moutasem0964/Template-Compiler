package compiler.symbol;

import compiler.ast.visitors.AstVisitor;
import compiler.ast.nodes.python.*;
import compiler.ast.core.AstNode;

public class SymbolTableVisitor implements AstVisitor<Void> {

    private Scope currentScope = new Scope(null); // global scope

    public Scope getGlobalScope() {
        return currentScope;
    }

    private void enterScope() {
        currentScope = new Scope(currentScope);
    }

    private void exitScope() {
        currentScope = currentScope.getParent();
    }

    // === Python Statements ===
    @Override
    public Void visitAssign(AssignNode node) {
        // assume first child is NameNode
        if (!node.getChildren().isEmpty() && node.getChildren().get(0) instanceof NameNode) {
            NameNode target = (NameNode) node.getChildren().get(0);
            currentScope.addSymbol(new Symbol(target.getName(), "variable"));
        }
        // visit value
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visitFor(ForNode node) {
        enterScope();
        currentScope.addSymbol(new Symbol(node.getVarName(), "loop_var"));
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        exitScope();
        return null;
    }

    @Override
    public Void visitDef(DefNode node) {
        currentScope.addSymbol(new Symbol(node.getName(), "function"));
        enterScope();
        for (String param : node.getParams()) {
            currentScope.addSymbol(new Symbol(param, "param"));
        }
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        exitScope();
        return null;
    }

    @Override
    public Void visitIf(IfNode node) {
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    // === Expressions & others: default visit ===
    private Void defaultVisit(AstNode node) {
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visitTemplate(compiler.ast.nodes.TemplateNode node) {
        return defaultVisit(node);
    }

    @Override
    public Void visitText(compiler.ast.nodes.TextNode node) {
        return null;
    }

    @Override
    public Void visitJinjaExpr(compiler.ast.nodes.jinja.JinjaExprNode node) {
        return defaultVisit(node);
    }

    @Override
    public Void visitJinjaStmt(compiler.ast.nodes.jinja.JinjaStmtNode node) {
        return defaultVisit(node);
    }

    @Override
    public Void visitHtmlElement(compiler.ast.nodes.html.HtmlElementNode node) {
        return defaultVisit(node);
    }

    @Override
    public Void visitCssStylesheet(compiler.ast.nodes.css.CssStylesheetNode node) {
        return defaultVisit(node);
    }

    @Override
    public Void visitCssRule(compiler.ast.nodes.css.CssRuleNode node) {
        return defaultVisit(node);
    }

    @Override
    public Void visitCssDeclaration(compiler.ast.nodes.css.CssDeclarationNode node) {
        return null;
    }

    @Override
    public Void visitName(NameNode node) {
        return null;
    }

    @Override
    public Void visitString(compiler.ast.nodes.python.StringNode node) {
        return null;
    }

    @Override
    public Void visitNumber(NumberNode node) {
        return null;
    }

    @Override
    public Void visitAttrAccess(AttrAccessNode node) {
        return defaultVisit(node);
    }

    @Override
    public Void visitCall(CallNode node) {
        return defaultVisit(node);
    }

    @Override
    public Void visitBinOp(BinOpNode node) {
        return defaultVisit(node);
    }
}
