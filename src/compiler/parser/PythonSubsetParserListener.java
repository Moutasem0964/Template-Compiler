// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/PythonSubsetParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonSubsetParser}.
 */
public interface PythonSubsetParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PythonSubsetParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PythonSubsetParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(PythonSubsetParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(PythonSubsetParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStatement(PythonSubsetParser.FromImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStatement(PythonSubsetParser.FromImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefinition}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PythonSubsetParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefinition}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PythonSubsetParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PythonSubsetParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PythonSubsetParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PythonSubsetParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PythonSubsetParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(PythonSubsetParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(PythonSubsetParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(PythonSubsetParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(PythonSubsetParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatement(PythonSubsetParser.GlobalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatement(PythonSubsetParser.GlobalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PythonSubsetParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PythonSubsetParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(PythonSubsetParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(PythonSubsetParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#from_import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFrom_import_stmt(PythonSubsetParser.From_import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#from_import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFrom_import_stmt(PythonSubsetParser.From_import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(PythonSubsetParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(PythonSubsetParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(PythonSubsetParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(PythonSubsetParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PythonSubsetParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PythonSubsetParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PythonSubsetParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PythonSubsetParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(PythonSubsetParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(PythonSubsetParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(PythonSubsetParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(PythonSubsetParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(PythonSubsetParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(PythonSubsetParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PythonSubsetParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PythonSubsetParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(PythonSubsetParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(PythonSubsetParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(PythonSubsetParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(PythonSubsetParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(PythonSubsetParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(PythonSubsetParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PythonSubsetParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PythonSubsetParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(PythonSubsetParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(PythonSubsetParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(PythonSubsetParser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(PythonSubsetParser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListComprehensionExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListComprehensionExpression(PythonSubsetParser.ListComprehensionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListComprehensionExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListComprehensionExpression(PythonSubsetParser.ListComprehensionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDictExpression(PythonSubsetParser.DictExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDictExpression(PythonSubsetParser.DictExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNameExpression(PythonSubsetParser.NameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNameExpression(PythonSubsetParser.NameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(PythonSubsetParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(PythonSubsetParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(PythonSubsetParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(PythonSubsetParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(PythonSubsetParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(PythonSubsetParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNoneLiteral(PythonSubsetParser.NoneLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNoneLiteral(PythonSubsetParser.NoneLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(PythonSubsetParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(PythonSubsetParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeAccess}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAccess(PythonSubsetParser.AttributeAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeAccess}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAccess(PythonSubsetParser.AttributeAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(PythonSubsetParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(PythonSubsetParser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(PythonSubsetParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(PythonSubsetParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(PythonSubsetParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(PythonSubsetParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonSubsetParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonSubsetParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(PythonSubsetParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(PythonSubsetParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PythonSubsetParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PythonSubsetParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(PythonSubsetParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(PythonSubsetParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(PythonSubsetParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(PythonSubsetParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PythonSubsetParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PythonSubsetParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterList_literal(PythonSubsetParser.List_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitList_literal(PythonSubsetParser.List_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void enterDict_literal(PythonSubsetParser.Dict_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void exitDict_literal(PythonSubsetParser.Dict_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#dict_pair}.
	 * @param ctx the parse tree
	 */
	void enterDict_pair(PythonSubsetParser.Dict_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#dict_pair}.
	 * @param ctx the parse tree
	 */
	void exitDict_pair(PythonSubsetParser.Dict_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#list_comprehension}.
	 * @param ctx the parse tree
	 */
	void enterList_comprehension(PythonSubsetParser.List_comprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#list_comprehension}.
	 * @param ctx the parse tree
	 */
	void exitList_comprehension(PythonSubsetParser.List_comprehensionContext ctx);
}