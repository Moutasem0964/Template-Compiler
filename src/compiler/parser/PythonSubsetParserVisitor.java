// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/PythonSubsetParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonSubsetParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(PythonSubsetParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(PythonSubsetParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStatement(PythonSubsetParser.FromImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefinition}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(PythonSubsetParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PythonSubsetParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PythonSubsetParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(PythonSubsetParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(PythonSubsetParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStatement(PythonSubsetParser.GlobalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PythonSubsetParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(PythonSubsetParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#from_import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_import_stmt(PythonSubsetParser.From_import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(PythonSubsetParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(PythonSubsetParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PythonSubsetParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PythonSubsetParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(PythonSubsetParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(PythonSubsetParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PythonSubsetParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(PythonSubsetParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(PythonSubsetParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(PythonSubsetParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PythonSubsetParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PythonSubsetParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(PythonSubsetParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExpression(PythonSubsetParser.DictExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameExpression(PythonSubsetParser.NameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(PythonSubsetParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(PythonSubsetParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(PythonSubsetParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLiteral(PythonSubsetParser.NoneLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(PythonSubsetParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeAccess}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeAccess(PythonSubsetParser.AttributeAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(PythonSubsetParser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(PythonSubsetParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(PythonSubsetParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PythonSubsetParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(PythonSubsetParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PythonSubsetParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(PythonSubsetParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(PythonSubsetParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PythonSubsetParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#list_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_literal(PythonSubsetParser.List_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#dict_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_literal(PythonSubsetParser.Dict_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#dict_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_pair(PythonSubsetParser.Dict_pairContext ctx);
}