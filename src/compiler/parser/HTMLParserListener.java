// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/HTMLParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code fullHtmlTag}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFullHtmlTag(HTMLParser.FullHtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullHtmlTag}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFullHtmlTag(HTMLParser.FullHtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingHtmlTag}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingHtmlTag(HTMLParser.SelfClosingHtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingHtmlTag}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingHtmlTag(HTMLParser.SelfClosingHtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlText}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(HTMLParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlText}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(HTMLParser.HtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(HTMLParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(HTMLParser.AttributesContext ctx);
}