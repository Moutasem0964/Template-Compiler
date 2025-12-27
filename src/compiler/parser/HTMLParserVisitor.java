// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/HTMLParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code fullHtmlTag}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullHtmlTag(HTMLParser.FullHtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingHtmlTag}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingHtmlTag(HTMLParser.SelfClosingHtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlText}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(HTMLParser.HtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(HTMLParser.AttributesContext ctx);
}