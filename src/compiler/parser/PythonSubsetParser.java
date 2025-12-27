// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/PythonSubsetParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonSubsetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, IF=2, ELIF=3, ELSE=4, FOR=5, IN=6, RETURN=7, IMPORT=8, FROM=9, 
		AS=10, GLOBAL=11, TRUE=12, FALSE=13, NONE=14, PLUS=15, MINUS=16, STAR=17, 
		SLASH=18, PERCENT=19, DOUBLESTAR=20, DOUBLESLASH=21, EQUAL=22, PLUSEQUAL=23, 
		MINUSEQUAL=24, EQEQUAL=25, NOTEQUAL=26, LESS=27, GREATER=28, LESSEQUAL=29, 
		GREATEREQUAL=30, LPAREN=31, RPAREN=32, LBRACK=33, RBRACK=34, LBRACE=35, 
		RBRACE=36, COMMA=37, COLON=38, DOT=39, ARROW=40, STRING=41, NUMBER=42, 
		NAME=43, DECORATOR=44, NEWLINE=45, WS=46, COMMENT=47, INDENT=48, DEDENT=49;
	public static final int
		RULE_file_input = 0, RULE_stmt = 1, RULE_import_stmt = 2, RULE_from_import_stmt = 3, 
		RULE_function_def = 4, RULE_decorator = 5, RULE_parameters = 6, RULE_parameter = 7, 
		RULE_suite = 8, RULE_simple_stmt = 9, RULE_small_stmt = 10, RULE_if_stmt = 11, 
		RULE_for_stmt = 12, RULE_assign_stmt = 13, RULE_global_stmt = 14, RULE_return_stmt = 15, 
		RULE_expr_stmt = 16, RULE_expr = 17, RULE_arguments = 18, RULE_argument = 19, 
		RULE_list_literal = 20, RULE_dict_literal = 21, RULE_dict_pair = 22, RULE_list_comprehension = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_input", "stmt", "import_stmt", "from_import_stmt", "function_def", 
			"decorator", "parameters", "parameter", "suite", "simple_stmt", "small_stmt", 
			"if_stmt", "for_stmt", "assign_stmt", "global_stmt", "return_stmt", "expr_stmt", 
			"expr", "arguments", "argument", "list_literal", "dict_literal", "dict_pair", 
			"list_comprehension"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'if'", "'elif'", "'else'", "'for'", "'in'", "'return'", 
			"'import'", "'from'", "'as'", "'global'", "'True'", "'False'", "'None'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'//'", "'='", "'+='", "'-='", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "','", "':'", "'.'", "'->'", null, null, null, null, null, 
			null, null, "'<<<INDENT>>>'", "'<<<DEDENT>>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "IF", "ELIF", "ELSE", "FOR", "IN", "RETURN", "IMPORT", "FROM", 
			"AS", "GLOBAL", "TRUE", "FALSE", "NONE", "PLUS", "MINUS", "STAR", "SLASH", 
			"PERCENT", "DOUBLESTAR", "DOUBLESLASH", "EQUAL", "PLUSEQUAL", "MINUSEQUAL", 
			"EQEQUAL", "NOTEQUAL", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", 
			"COLON", "DOT", "ARROW", "STRING", "NUMBER", "NAME", "DECORATOR", "NEWLINE", 
			"WS", "COMMENT", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonSubsetParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonSubsetParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonSubsetParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonSubsetParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFile_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68214818175910L) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(48);
					match(NEWLINE);
					}
					break;
				case DEF:
				case IF:
				case FOR:
				case RETURN:
				case IMPORT:
				case FROM:
				case GLOBAL:
				case TRUE:
				case FALSE:
				case NONE:
				case MINUS:
				case LPAREN:
				case LBRACK:
				case LBRACE:
				case STRING:
				case NUMBER:
				case NAME:
				case DECORATOR:
					{
					setState(49);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromImportStatementContext extends StmtContext {
		public From_import_stmtContext from_import_stmt() {
			return getRuleContext(From_import_stmtContext.class,0);
		}
		public FromImportStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFromImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFromImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFromImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public IfStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementContext extends StmtContext {
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public GlobalStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StmtContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public ExpressionStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public ReturnStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends StmtContext {
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public FunctionDefinitionContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends StmtContext {
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public ImportStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends StmtContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public ForStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends StmtContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public AssignStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				import_stmt();
				}
				break;
			case 2:
				_localctx = new FromImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				from_import_stmt();
				}
				break;
			case 3:
				_localctx = new FunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				function_def();
				}
				break;
			case 4:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				if_stmt();
				}
				break;
			case 5:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				for_stmt();
				}
				break;
			case 6:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				assign_stmt();
				}
				break;
			case 7:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				expr_stmt();
				}
				break;
			case 8:
				_localctx = new GlobalStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				global_stmt();
				}
				break;
			case 9:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(65);
				return_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonSubsetParser.IMPORT, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonSubsetParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonSubsetParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public TerminalNode AS() { return getToken(PythonSubsetParser.AS, 0); }
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterImport_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitImport_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IMPORT);
			setState(69);
			match(NAME);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(70);
				match(AS);
				setState(71);
				match(NAME);
				}
			}

			setState(74);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_import_stmtContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PythonSubsetParser.FROM, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonSubsetParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonSubsetParser.NAME, i);
		}
		public TerminalNode IMPORT() { return getToken(PythonSubsetParser.IMPORT, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(PythonSubsetParser.AS, 0); }
		public From_import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFrom_import_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFrom_import_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFrom_import_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_import_stmtContext from_import_stmt() throws RecognitionException {
		From_import_stmtContext _localctx = new From_import_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_from_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(FROM);
			setState(77);
			match(NAME);
			setState(78);
			match(IMPORT);
			setState(79);
			match(NAME);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80);
				match(COMMA);
				setState(81);
				match(NAME);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(87);
				match(AS);
				setState(88);
				match(NAME);
				}
			}

			setState(91);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonSubsetParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonSubsetParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECORATOR) {
				{
				{
				setState(93);
				decorator();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(DEF);
			setState(100);
			match(NAME);
			setState(101);
			match(LPAREN);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(102);
				parameters();
				}
			}

			setState(105);
			match(RPAREN);
			setState(106);
			match(COLON);
			setState(107);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode DECORATOR() { return getToken(PythonSubsetParser.DECORATOR, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(DECORATOR);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(110);
				match(LPAREN);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15438260039680L) != 0)) {
					{
					setState(111);
					arguments();
					}
				}

				setState(114);
				match(RPAREN);
				}
			}

			setState(117);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			parameter();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(120);
				match(COMMA);
				setState(121);
				parameter();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(PythonSubsetParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NAME);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(128);
				match(EQUAL);
				setState(129);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonSubsetParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonSubsetParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_suite);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case GLOBAL:
			case TRUE:
			case FALSE:
			case NONE:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACE:
			case STRING:
			case NUMBER:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(NEWLINE);
				setState(134);
				match(INDENT);
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					stmt();
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33030446087078L) != 0) );
				setState(140);
				match(DEDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_stmtContext extends ParserRuleContext {
		public Small_stmtContext small_stmt() {
			return getRuleContext(Small_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			small_stmt();
			setState(145);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Small_stmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitSmall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_small_stmt);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				expr_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				return_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				assign_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				global_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonSubsetParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonSubsetParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonSubsetParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonSubsetParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonSubsetParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonSubsetParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			expr(0);
			setState(155);
			match(COLON);
			setState(156);
			suite();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(157);
				match(ELIF);
				setState(158);
				expr(0);
				setState(159);
				match(COLON);
				setState(160);
				suite();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(167);
				match(ELSE);
				setState(168);
				match(COLON);
				setState(169);
				suite();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonSubsetParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode IN() { return getToken(PythonSubsetParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonSubsetParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(FOR);
			setState(173);
			match(NAME);
			setState(174);
			match(IN);
			setState(175);
			expr(0);
			setState(176);
			match(COLON);
			setState(177);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(PythonSubsetParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(NAME);
			setState(180);
			match(EQUAL);
			setState(181);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Global_stmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(PythonSubsetParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonSubsetParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonSubsetParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterGlobal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitGlobal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitGlobal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(GLOBAL);
			setState(184);
			match(NAME);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				match(NAME);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonSubsetParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(RETURN);
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(193);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(PythonSubsetParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PythonSubsetParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(PythonSubsetParser.PERCENT, 0); }
		public TerminalNode DOUBLESLASH() { return getToken(PythonSubsetParser.DOUBLESLASH, 0); }
		public TerminalNode DOUBLESTAR() { return getToken(PythonSubsetParser.DOUBLESTAR, 0); }
		public MulDivOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterMulDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitMulDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListComprehensionExpressionContext extends ExprContext {
		public List_comprehensionContext list_comprehension() {
			return getRuleContext(List_comprehensionContext.class,0);
		}
		public ListComprehensionExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterListComprehensionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitListComprehensionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitListComprehensionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictExpressionContext extends ExprContext {
		public Dict_literalContext dict_literal() {
			return getRuleContext(Dict_literalContext.class,0);
		}
		public DictExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterDictExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitDictExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitDictExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameExpressionContext extends ExprContext {
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public NameExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExpressionContext extends ExprContext {
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public ListExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PythonSubsetParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonSubsetParser.MINUS, 0); }
		public AddSubOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAddSubOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAddSubOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(PythonSubsetParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneLiteralContext extends ExprContext {
		public TerminalNode NONE() { return getToken(PythonSubsetParser.NONE, 0); }
		public NoneLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterNoneLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitNoneLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitNoneLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(PythonSubsetParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PythonSubsetParser.RBRACK, 0); }
		public SubscriptContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonSubsetParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public AttributeAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAttributeAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAttributeAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAttributeAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(PythonSubsetParser.FALSE, 0); }
		public FalseLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ExprContext {
		public TerminalNode STRING() { return getToken(PythonSubsetParser.STRING, 0); }
		public StringLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(PythonSubsetParser.TRUE, 0); }
		public TrueLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQEQUAL() { return getToken(PythonSubsetParser.EQEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PythonSubsetParser.NOTEQUAL, 0); }
		public TerminalNode LESS() { return getToken(PythonSubsetParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(PythonSubsetParser.GREATER, 0); }
		public TerminalNode LESSEQUAL() { return getToken(PythonSubsetParser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(PythonSubsetParser.GREATEREQUAL, 0); }
		public ComparisonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public ParenExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(PythonSubsetParser.NUMBER, 0); }
		public NumberLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199);
				match(MINUS);
				setState(200);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new NameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(NAME);
				}
				break;
			case 3:
				{
				_localctx = new NumberLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new TrueLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new FalseLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(FALSE);
				}
				break;
			case 7:
				{
				_localctx = new NoneLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(NONE);
				}
				break;
			case 8:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				list_literal();
				}
				break;
			case 9:
				{
				_localctx = new DictExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				dict_literal();
				}
				break;
			case 10:
				{
				_localctx = new ListComprehensionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				list_comprehension();
				}
				break;
			case 11:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(LPAREN);
				setState(211);
				expr(0);
				setState(212);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(217);
						((MulDivOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) ) {
							((MulDivOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(220);
						((AddSubOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(223);
						((ComparisonContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) ) {
							((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new AttributeAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(226);
						match(DOT);
						setState(227);
						match(NAME);
						}
						break;
					case 5:
						{
						_localctx = new FunctionCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(229);
						match(LPAREN);
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15438260039680L) != 0)) {
							{
							setState(230);
							arguments();
							}
						}

						setState(233);
						match(RPAREN);
						}
						break;
					case 6:
						{
						_localctx = new SubscriptContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(235);
						match(LBRACK);
						setState(236);
						expr(0);
						setState(237);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			argument();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				argument();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(PythonSubsetParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argument);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(NAME);
				setState(253);
				match(EQUAL);
				setState(254);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_literalContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PythonSubsetParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PythonSubsetParser.RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterList_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitList_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitList_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(LBRACK);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15438260039680L) != 0)) {
				{
				setState(259);
				expr(0);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(260);
					match(COMMA);
					setState(261);
					expr(0);
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(269);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dict_literalContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonSubsetParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonSubsetParser.RBRACE, 0); }
		public List<Dict_pairContext> dict_pair() {
			return getRuleContexts(Dict_pairContext.class);
		}
		public Dict_pairContext dict_pair(int i) {
			return getRuleContext(Dict_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public Dict_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterDict_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitDict_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitDict_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dict_literalContext dict_literal() throws RecognitionException {
		Dict_literalContext _localctx = new Dict_literalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LBRACE);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==NAME) {
				{
				setState(272);
				dict_pair();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					dict_pair();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(282);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dict_pairContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonSubsetParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PythonSubsetParser.STRING, 0); }
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public Dict_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterDict_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitDict_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitDict_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dict_pairContext dict_pair() throws RecognitionException {
		Dict_pairContext _localctx = new Dict_pairContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dict_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(285);
			match(COLON);
			setState(286);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_comprehensionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PythonSubsetParser.LBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FOR() { return getToken(PythonSubsetParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode IN() { return getToken(PythonSubsetParser.IN, 0); }
		public TerminalNode RBRACK() { return getToken(PythonSubsetParser.RBRACK, 0); }
		public TerminalNode IF() { return getToken(PythonSubsetParser.IF, 0); }
		public List_comprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_comprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterList_comprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitList_comprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitList_comprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_comprehensionContext list_comprehension() throws RecognitionException {
		List_comprehensionContext _localctx = new List_comprehensionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_list_comprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(LBRACK);
			setState(289);
			expr(0);
			setState(290);
			match(FOR);
			setState(291);
			match(NAME);
			setState(292);
			match(IN);
			setState(293);
			expr(0);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(294);
				match(IF);
				setState(295);
				expr(0);
				}
			}

			setState(298);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u012d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0005\u0004_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"q\b\u0005\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006{\b\u0006\n\u0006\f\u0006~\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u0089\b\b\u000b\b\f\b\u008a\u0001\b"+
		"\u0001\b\u0003\b\u008f\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0098\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00a3\b\u000b\n\u000b\f\u000b\u00a6\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00ab\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00bc\b\u000e\n\u000e\f\u000e"+
		"\u00bf\t\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00c3\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00d7\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e8"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00f0\b\u0011\n\u0011\f\u0011\u00f3\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00f8\b\u0012\n\u0012\f\u0012\u00fb"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0101"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0107"+
		"\b\u0014\n\u0014\f\u0014\u010a\t\u0014\u0003\u0014\u010c\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0114\b\u0015\n\u0015\f\u0015\u0117\t\u0015\u0003\u0015\u0119\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0129\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0000\u0001\"\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0004"+
		"\u0001\u0000\u0011\u0015\u0001\u0000\u000f\u0010\u0001\u0000\u0019\u001e"+
		"\u0002\u0000))++\u0148\u00004\u0001\u0000\u0000\u0000\u0002B\u0001\u0000"+
		"\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000"+
		"\b`\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fw\u0001\u0000"+
		"\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u008e\u0001\u0000"+
		"\u0000\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u0097\u0001\u0000"+
		"\u0000\u0000\u0016\u0099\u0001\u0000\u0000\u0000\u0018\u00ac\u0001\u0000"+
		"\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c\u00b7\u0001\u0000"+
		"\u0000\u0000\u001e\u00c0\u0001\u0000\u0000\u0000 \u00c4\u0001\u0000\u0000"+
		"\u0000\"\u00d6\u0001\u0000\u0000\u0000$\u00f4\u0001\u0000\u0000\u0000"+
		"&\u0100\u0001\u0000\u0000\u0000(\u0102\u0001\u0000\u0000\u0000*\u010f"+
		"\u0001\u0000\u0000\u0000,\u011c\u0001\u0000\u0000\u0000.\u0120\u0001\u0000"+
		"\u0000\u000003\u0005-\u0000\u000013\u0003\u0002\u0001\u000020\u0001\u0000"+
		"\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000078\u0005\u0000\u0000\u00018\u0001\u0001\u0000"+
		"\u0000\u00009C\u0003\u0004\u0002\u0000:C\u0003\u0006\u0003\u0000;C\u0003"+
		"\b\u0004\u0000<C\u0003\u0016\u000b\u0000=C\u0003\u0018\f\u0000>C\u0003"+
		"\u001a\r\u0000?C\u0003 \u0010\u0000@C\u0003\u001c\u000e\u0000AC\u0003"+
		"\u001e\u000f\u0000B9\u0001\u0000\u0000\u0000B:\u0001\u0000\u0000\u0000"+
		"B;\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000"+
		"\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003\u0001\u0000\u0000\u0000"+
		"DE\u0005\b\u0000\u0000EH\u0005+\u0000\u0000FG\u0005\n\u0000\u0000GI\u0005"+
		"+\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0005-\u0000\u0000K\u0005\u0001\u0000\u0000\u0000"+
		"LM\u0005\t\u0000\u0000MN\u0005+\u0000\u0000NO\u0005\b\u0000\u0000OT\u0005"+
		"+\u0000\u0000PQ\u0005%\u0000\u0000QS\u0005+\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UY\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WX\u0005\n\u0000\u0000XZ\u0005+\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005-\u0000\u0000"+
		"\\\u0007\u0001\u0000\u0000\u0000]_\u0003\n\u0005\u0000^]\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0001\u0000\u0000de\u0005+\u0000\u0000eg\u0005\u001f\u0000\u0000fh\u0003"+
		"\f\u0006\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0005 \u0000\u0000jk\u0005&\u0000\u0000kl\u0003\u0010"+
		"\b\u0000l\t\u0001\u0000\u0000\u0000ms\u0005,\u0000\u0000np\u0005\u001f"+
		"\u0000\u0000oq\u0003$\u0012\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0005 \u0000\u0000sn\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005"+
		"-\u0000\u0000v\u000b\u0001\u0000\u0000\u0000w|\u0003\u000e\u0007\u0000"+
		"xy\u0005%\u0000\u0000y{\u0003\u000e\u0007\u0000zx\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\r\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0005+\u0000\u0000\u0080\u0081\u0005\u0016\u0000\u0000\u0081\u0083\u0003"+
		"\"\u0011\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u000f\u0001\u0000\u0000\u0000\u0084\u008f\u0003\u0012"+
		"\t\u0000\u0085\u0086\u0005-\u0000\u0000\u0086\u0088\u00050\u0000\u0000"+
		"\u0087\u0089\u0003\u0002\u0001\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u00051\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e"+
		"\u0084\u0001\u0000\u0000\u0000\u008e\u0085\u0001\u0000\u0000\u0000\u008f"+
		"\u0011\u0001\u0000\u0000\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u0092"+
		"\u0005-\u0000\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0098\u0003"+
		" \u0010\u0000\u0094\u0098\u0003\u001e\u000f\u0000\u0095\u0098\u0003\u001a"+
		"\r\u0000\u0096\u0098\u0003\u001c\u000e\u0000\u0097\u0093\u0001\u0000\u0000"+
		"\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0015\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\u0002\u0000\u0000\u009a\u009b\u0003\"\u0011\u0000"+
		"\u009b\u009c\u0005&\u0000\u0000\u009c\u00a4\u0003\u0010\b\u0000\u009d"+
		"\u009e\u0005\u0003\u0000\u0000\u009e\u009f\u0003\"\u0011\u0000\u009f\u00a0"+
		"\u0005&\u0000\u0000\u00a0\u00a1\u0003\u0010\b\u0000\u00a1\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a2\u009d\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00aa\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8\u00a9\u0005"+
		"&\u0000\u0000\u00a9\u00ab\u0003\u0010\b\u0000\u00aa\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u0017\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u0005\u0000\u0000\u00ad\u00ae\u0005+\u0000"+
		"\u0000\u00ae\u00af\u0005\u0006\u0000\u0000\u00af\u00b0\u0003\"\u0011\u0000"+
		"\u00b0\u00b1\u0005&\u0000\u0000\u00b1\u00b2\u0003\u0010\b\u0000\u00b2"+
		"\u0019\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005+\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0016\u0000\u0000\u00b5\u00b6\u0003\"\u0011\u0000\u00b6\u001b\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0005\u000b\u0000\u0000\u00b8\u00bd\u0005"+
		"+\u0000\u0000\u00b9\u00ba\u0005%\u0000\u0000\u00ba\u00bc\u0005+\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u001d\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c2\u0005\u0007\u0000\u0000\u00c1\u00c3\u0003\"\u0011\u0000"+
		"\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u001f\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\"\u0011\u0000\u00c5"+
		"!\u0001\u0000\u0000\u0000\u00c6\u00c7\u0006\u0011\uffff\uffff\u0000\u00c7"+
		"\u00c8\u0005\u0010\u0000\u0000\u00c8\u00d7\u0003\"\u0011\u000e\u00c9\u00d7"+
		"\u0005+\u0000\u0000\u00ca\u00d7\u0005*\u0000\u0000\u00cb\u00d7\u0005)"+
		"\u0000\u0000\u00cc\u00d7\u0005\f\u0000\u0000\u00cd\u00d7\u0005\r\u0000"+
		"\u0000\u00ce\u00d7\u0005\u000e\u0000\u0000\u00cf\u00d7\u0003(\u0014\u0000"+
		"\u00d0\u00d7\u0003*\u0015\u0000\u00d1\u00d7\u0003.\u0017\u0000\u00d2\u00d3"+
		"\u0005\u001f\u0000\u0000\u00d3\u00d4\u0003\"\u0011\u0000\u00d4\u00d5\u0005"+
		" \u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00c6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00c9\u0001\u0000\u0000\u0000\u00d6\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d6\u00cb\u0001\u0000\u0000\u0000\u00d6\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d6\u00cd\u0001\u0000\u0000\u0000\u00d6\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d6\u00cf\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d1\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d7\u00f1\u0001\u0000\u0000\u0000\u00d8\u00d9\n\r\u0000"+
		"\u0000\u00d9\u00da\u0007\u0000\u0000\u0000\u00da\u00f0\u0003\"\u0011\u000e"+
		"\u00db\u00dc\n\f\u0000\u0000\u00dc\u00dd\u0007\u0001\u0000\u0000\u00dd"+
		"\u00f0\u0003\"\u0011\r\u00de\u00df\n\u000b\u0000\u0000\u00df\u00e0\u0007"+
		"\u0002\u0000\u0000\u00e0\u00f0\u0003\"\u0011\f\u00e1\u00e2\n\u0011\u0000"+
		"\u0000\u00e2\u00e3\u0005\'\u0000\u0000\u00e3\u00f0\u0005+\u0000\u0000"+
		"\u00e4\u00e5\n\u0010\u0000\u0000\u00e5\u00e7\u0005\u001f\u0000\u0000\u00e6"+
		"\u00e8\u0003$\u0012\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00f0"+
		"\u0005 \u0000\u0000\u00ea\u00eb\n\u000f\u0000\u0000\u00eb\u00ec\u0005"+
		"!\u0000\u0000\u00ec\u00ed\u0003\"\u0011\u0000\u00ed\u00ee\u0005\"\u0000"+
		"\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00d8\u0001\u0000\u0000"+
		"\u0000\u00ef\u00db\u0001\u0000\u0000\u0000\u00ef\u00de\u0001\u0000\u0000"+
		"\u0000\u00ef\u00e1\u0001\u0000\u0000\u0000\u00ef\u00e4\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2#\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f9\u0003&\u0013\u0000\u00f5\u00f6\u0005%\u0000\u0000\u00f6\u00f8"+
		"\u0003&\u0013\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa%\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005+\u0000\u0000\u00fd\u00fe\u0005\u0016\u0000"+
		"\u0000\u00fe\u0101\u0003\"\u0011\u0000\u00ff\u0101\u0003\"\u0011\u0000"+
		"\u0100\u00fc\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\'\u0001\u0000\u0000\u0000\u0102\u010b\u0005!\u0000\u0000\u0103"+
		"\u0108\u0003\"\u0011\u0000\u0104\u0105\u0005%\u0000\u0000\u0105\u0107"+
		"\u0003\"\u0011\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u010a\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010b\u0103\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005"+
		"\"\u0000\u0000\u010e)\u0001\u0000\u0000\u0000\u010f\u0118\u0005#\u0000"+
		"\u0000\u0110\u0115\u0003,\u0016\u0000\u0111\u0112\u0005%\u0000\u0000\u0112"+
		"\u0114\u0003,\u0016\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0117"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u0118\u0110\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005$\u0000\u0000\u011b+\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0003"+
		"\u0000\u0000\u011d\u011e\u0005&\u0000\u0000\u011e\u011f\u0003\"\u0011"+
		"\u0000\u011f-\u0001\u0000\u0000\u0000\u0120\u0121\u0005!\u0000\u0000\u0121"+
		"\u0122\u0003\"\u0011\u0000\u0122\u0123\u0005\u0005\u0000\u0000\u0123\u0124"+
		"\u0005+\u0000\u0000\u0124\u0125\u0005\u0006\u0000\u0000\u0125\u0128\u0003"+
		"\"\u0011\u0000\u0126\u0127\u0005\u0002\u0000\u0000\u0127\u0129\u0003\""+
		"\u0011\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0005\"\u0000"+
		"\u0000\u012b/\u0001\u0000\u0000\u0000\u001e24BHTY`gps|\u0082\u008a\u008e"+
		"\u0097\u00a4\u00aa\u00bd\u00c2\u00d6\u00e7\u00ef\u00f1\u00f9\u0100\u0108"+
		"\u010b\u0115\u0118\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}