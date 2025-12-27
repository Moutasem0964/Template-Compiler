package compiler.main;

import compiler.ast.core.AstNode;
import compiler.ast.visitors.PrintVisitor;
import compiler.parser.TemplateLexer;
import compiler.parser.TemplateParser;
import compiler.visitors.TemplateAstBuilder;
import compiler.symbol.Scope;
import compiler.symbol.SymbolTableVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class TestMain {

    public static void main(String[] args) {
        // === 1️⃣ Example template content ===
        String templateCode = """
                <html>
                    <body>
                        <h1>{{ title }}</h1>
                        {% for item in items %}
                            <p>{{ item }}</p>
                        {% endfor %}
                        {% set x = 10 %}
                        {% def greet(name): %}
                            Hello, {{ name }}
                        {% enddef %}
                    </body>
                </html>
                <style>
                    h1 { color: blue; }
                    p { font-size: 14px; }
                </style>
                """;

        try {
            // === 2️⃣ Lexing + Parsing ===
            CharStream input = CharStreams.fromString(templateCode);
            TemplateLexer lexer = new TemplateLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TemplateParser parser = new TemplateParser(tokens);
            ParseTree tree = parser.template();

            // === 3️⃣ Build AST ===
            TemplateAstBuilder astBuilder = new TemplateAstBuilder();
            AstNode astRoot = astBuilder.visit(tree);

            // === 4️⃣ Print AST ===
            System.out.println("=== AST Tree ===");
            PrintVisitor printer = new PrintVisitor();
            printer.printTree(astRoot);

            // === 5️⃣ Build Symbol Table ===
            SymbolTableVisitor symbolVisitor = new SymbolTableVisitor();
            astRoot.accept(symbolVisitor);
            Scope globalScope = symbolVisitor.getGlobalScope();

            // === 6️⃣ Print Symbol Table ===
            System.out.println("\n=== Symbol Table (Global Scope) ===");
            printScope(globalScope, 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Recursive function to print symbols in a readable way
    private static void printScope(Scope scope, int level) {
        if (scope == null) return;
        String indent = "  ".repeat(level);
        scope.getSymbols().forEach((name, symbol) -> {
            System.out.println(indent + name + " : " + symbol.getType());
        });
        if (scope.getParent() != null) {
            System.out.println(indent + "(Parent Scope)");
            printScope(scope.getParent(), level + 1);
        }
    }
}
