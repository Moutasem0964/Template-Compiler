package compiler.ast.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.*;
import compiler.ast.nodes.css.*;
import compiler.ast.nodes.html.*;
import compiler.ast.nodes.jinja.*;
import compiler.ast.nodes.python.*;

public class PrintVisitor implements AstVisitor<Void> {

    public void printTree(AstNode root) {
        printNode(root, "", true);
    }

    private void printNode(AstNode node, String prefix, boolean isLast) {
        // Print connector and node
        String connector = isLast ? "└── " : "├── ";
        String className = node.getClass().getSimpleName();
        System.out.println(prefix + connector + className + " (line " + node.getLine() + ")");

        // Prepare prefix for children
        String childPrefix = prefix + (isLast ? "    " : "│   ");

        // Print children
        var children = node.getChildren();
        for (int i = 0; i < children.size(); i++) {
            boolean lastChild = (i == children.size() - 1);
            printNode(children.get(i), childPrefix, lastChild);
        }
    }

    // ===== All visit methods =====

    @Override
    public Void visitPythonFile(PythonFileNode node) { return null; }

    @Override
    public Void visitDef(DefNode node) { return null; }

    @Override
    public Void visitIf(IfNode node) { return null; }

    @Override
    public Void visitFor(ForNode node) { return null; }

    @Override
    public Void visitAssign(AssignNode node) { return null; }

    @Override
    public Void visitReturn(ReturnNode node) { return null; }

    @Override
    public Void visitGlobal(GlobalNode node) { return null; }

    @Override
    public Void visitImport(ImportNode node) { return null; }

    @Override
    public Void visitFromImport(FromImportNode node) { return null; }

    @Override
    public Void visitSuite(SuiteNode node) { return null; }

    @Override
    public Void visitDecorator(DecoratorNode node) { return null; }

    @Override
    public Void visitName(NameNode node) { return null; }

    @Override
    public Void visitNumber(NumberNode node) { return null; }

    @Override
    public Void visitString(StringNode node) { return null; }

    @Override
    public Void visitBinOp(BinOpNode node) { return null; }

    @Override
    public Void visitUnaryOp(UnaryOpNode node) { return null; }

    @Override
    public Void visitNot(NotNode node) { return null; }

    @Override
    public Void visitCall(CallNode node) { return null; }

    @Override
    public Void visitAttrAccess(AttrAccessNode node) { return null; }

    @Override
    public Void visitSubscript(SubscriptNode node) { return null; }

    @Override
    public Void visitList(ListNode node) { return null; }

    @Override
    public Void visitDict(DictNode node) { return null; }

    @Override
    public Void visitTuple(TupleNode node) { return null; }

    @Override
    public Void visitListComp(ListCompNode node) { return null; }

    @Override
    public Void visitGeneratorExpr(GeneratorExprNode node) { return null; }

    @Override
    public Void visitKeywordArg(KeywordArgNode node) { return null; }

    @Override
    public Void visitTemplate(TemplateNode node) { return null; }

    @Override
    public Void visitText(TextNode node) { return null; }

    @Override
    public Void visitHtmlElement(HtmlElementNode node) { return null; }

    @Override
    public Void visitJinjaExpr(JinjaExprNode node) { return null; }

    @Override
    public Void visitJinjaStmt(JinjaStmtNode node) { return null; }

    @Override
    public Void visitCssStylesheet(CssStylesheetNode node) { return null; }

    @Override
    public Void visitCssRule(CssRuleNode node) { return null; }

    @Override
    public Void visitCssDeclaration(CssDeclarationNode node) { return null; }
}