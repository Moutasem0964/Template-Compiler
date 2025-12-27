// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/TemplateParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateParser}.
 */
public interface TemplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(TemplateParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(TemplateParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(TemplateParser.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(TemplateParser.TextContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVariableContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVariableContent(TemplateParser.JinjaVariableContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVariableContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVariableContent(TemplateParser.JinjaVariableContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForContent(TemplateParser.JinjaForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForContent(TemplateParser.JinjaForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfContent(TemplateParser.JinjaIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfContent(TemplateParser.JinjaIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCommentContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCommentContent(TemplateParser.JinjaCommentContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCommentContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCommentContent(TemplateParser.JinjaCommentContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoctypeContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeContent(TemplateParser.DoctypeContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoctypeContent}
	 * labeled alternative in {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeContent(TemplateParser.DoctypeContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalElement}
	 * labeled alternative in {@link TemplateParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(TemplateParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalElement}
	 * labeled alternative in {@link TemplateParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(TemplateParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingElement}
	 * labeled alternative in {@link TemplateParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(TemplateParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingElement}
	 * labeled alternative in {@link TemplateParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(TemplateParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaticAttribute}
	 * labeled alternative in {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterStaticAttribute(TemplateParser.StaticAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaticAttribute}
	 * labeled alternative in {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitStaticAttribute(TemplateParser.StaticAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DynamicAttribute}
	 * labeled alternative in {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterDynamicAttribute(TemplateParser.DynamicAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DynamicAttribute}
	 * labeled alternative in {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitDynamicAttribute(TemplateParser.DynamicAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#text_content}.
	 * @param ctx the parse tree
	 */
	void enterText_content(TemplateParser.Text_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#text_content}.
	 * @param ctx the parse tree
	 */
	void exitText_content(TemplateParser.Text_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinja_variable}.
	 * @param ctx the parse tree
	 */
	void enterJinja_variable(TemplateParser.Jinja_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinja_variable}.
	 * @param ctx the parse tree
	 */
	void exitJinja_variable(TemplateParser.Jinja_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinja_for}.
	 * @param ctx the parse tree
	 */
	void enterJinja_for(TemplateParser.Jinja_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinja_for}.
	 * @param ctx the parse tree
	 */
	void exitJinja_for(TemplateParser.Jinja_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinja_if}.
	 * @param ctx the parse tree
	 */
	void enterJinja_if(TemplateParser.Jinja_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinja_if}.
	 * @param ctx the parse tree
	 */
	void exitJinja_if(TemplateParser.Jinja_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinja_comment}.
	 * @param ctx the parse tree
	 */
	void enterJinja_comment(TemplateParser.Jinja_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinja_comment}.
	 * @param ctx the parse tree
	 */
	void exitJinja_comment(TemplateParser.Jinja_commentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaFunctionCall}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFunctionCall(TemplateParser.JinjaFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaFunctionCall}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFunctionCall(TemplateParser.JinjaFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaString}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaString(TemplateParser.JinjaStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaString}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaString(TemplateParser.JinjaStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaParenExpr}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaParenExpr(TemplateParser.JinjaParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaParenExpr}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaParenExpr(TemplateParser.JinjaParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaSubscript}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSubscript(TemplateParser.JinjaSubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaSubscript}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSubscript(TemplateParser.JinjaSubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaAttributeAccess}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaAttributeAccess(TemplateParser.JinjaAttributeAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaAttributeAccess}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaAttributeAccess(TemplateParser.JinjaAttributeAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaNumber}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaNumber(TemplateParser.JinjaNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaNumber}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaNumber(TemplateParser.JinjaNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaName}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaName(TemplateParser.JinjaNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaName}
	 * labeled alternative in {@link TemplateParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaName(TemplateParser.JinjaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinja_args}.
	 * @param ctx the parse tree
	 */
	void enterJinja_args(TemplateParser.Jinja_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinja_args}.
	 * @param ctx the parse tree
	 */
	void exitJinja_args(TemplateParser.Jinja_argsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaKeywordArg}
	 * labeled alternative in {@link TemplateParser#jinja_arg}.
	 * @param ctx the parse tree
	 */
	void enterJinjaKeywordArg(TemplateParser.JinjaKeywordArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaKeywordArg}
	 * labeled alternative in {@link TemplateParser#jinja_arg}.
	 * @param ctx the parse tree
	 */
	void exitJinjaKeywordArg(TemplateParser.JinjaKeywordArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaPositionalArg}
	 * labeled alternative in {@link TemplateParser#jinja_arg}.
	 * @param ctx the parse tree
	 */
	void enterJinjaPositionalArg(TemplateParser.JinjaPositionalArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaPositionalArg}
	 * labeled alternative in {@link TemplateParser#jinja_arg}.
	 * @param ctx the parse tree
	 */
	void exitJinjaPositionalArg(TemplateParser.JinjaPositionalArgContext ctx);
}