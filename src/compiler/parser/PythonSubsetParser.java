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
		NEWLINE=1, WS=2, IMPORT=3, FROM=4, GLOBAL=5, DEF=6, IF=7, ELIF=8, ELSE=9, 
		FOR=10, IN=11, RETURN=12, TRUE=13, FALSE=14, CLASS=15, AT=16, EQ=17, EQEQ=18, 
		LT=19, GT=20, LTEQ=21, GTEQ=22, PLUS=23, MINUS=24, STAR=25, SLASH=26, 
		LPAREN=27, RPAREN=28, LBRACK=29, RBRACK=30, LBRACE=31, RBRACE=32, COLON=33, 
		DOT=34, COMMA=35, NUMBER=36, STRING=37, NAME=38, COMMENT=39, INDENT=40, 
		DEDENT=41;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_importStmt = 2, RULE_decorator = 3, 
		RULE_simpleStmt = 4, RULE_compoundStmt = 5, RULE_defStmt = 6, RULE_params = 7, 
		RULE_ifStmt = 8, RULE_forStmt = 9, RULE_suite = 10, RULE_test = 11, RULE_expr = 12, 
		RULE_atom = 13, RULE_listLiteral = 14, RULE_dictLiteral = 15, RULE_arglist = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "importStmt", "decorator", "simpleStmt", "compoundStmt", 
			"defStmt", "params", "ifStmt", "forStmt", "suite", "test", "expr", "atom", 
			"listLiteral", "dictLiteral", "arglist"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'import'", "'from'", "'global'", "'def'", "'if'", 
			"'elif'", "'else'", "'for'", "'in'", "'return'", "'True'", "'False'", 
			"'class'", "'@'", "'='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", 
			"'.'", "','", null, null, null, null, "'<INDENT>'", "'<DEDENT>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "IMPORT", "FROM", "GLOBAL", "DEF", "IF", "ELIF", 
			"ELSE", "FOR", "IN", "RETURN", "TRUE", "FALSE", "CLASS", "AT", "EQ", 
			"EQEQ", "LT", "GT", "LTEQ", "GTEQ", "PLUS", "MINUS", "STAR", "SLASH", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COLON", 
			"DOT", "COMMA", "NUMBER", "STRING", "NAME", "COMMENT", "INDENT", "DEDENT"
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonSubsetParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 483855000824L) != 0)) {
				{
				{
				setState(34);
				stmt();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
	public static class SimpleContext extends StmtContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public SimpleContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundContext extends StmtContext {
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public CompoundContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportRuleContext extends StmtContext {
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public ImportRuleContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterImportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitImportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitImportRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratedContext extends StmtContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public DecoratedContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterDecorated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitDecorated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitDecorated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case TRUE:
			case FALSE:
			case LPAREN:
			case LBRACK:
			case LBRACE:
			case NUMBER:
			case STRING:
			case NAME:
				_localctx = new SimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				simpleStmt();
				setState(43);
				match(NEWLINE);
				}
				break;
			case DEF:
			case IF:
			case FOR:
				_localctx = new CompoundContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				compoundStmt();
				}
				break;
			case IMPORT:
			case FROM:
				_localctx = new ImportRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				importStmt();
				}
				break;
			case AT:
				_localctx = new DecoratedContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				decorator();
				setState(48);
				stmt();
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
	public static class ImportStmtContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PythonSubsetParser.FROM, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonSubsetParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonSubsetParser.NAME, i);
		}
		public TerminalNode IMPORT() { return getToken(PythonSubsetParser.IMPORT, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public TerminalNode STAR() { return getToken(PythonSubsetParser.STAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStmt);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(FROM);
				setState(53);
				match(NAME);
				setState(54);
				match(IMPORT);
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(55);
					match(NAME);
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(56);
						match(COMMA);
						setState(57);
						match(NAME);
						}
						}
						setState(62);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(63);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66);
				match(NEWLINE);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(IMPORT);
				setState(68);
				match(NAME);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(69);
					match(COMMA);
					setState(70);
					match(NAME);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(NEWLINE);
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
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PythonSubsetParser.AT, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonSubsetParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonSubsetParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public List<TerminalNode> DOT() { return getTokens(PythonSubsetParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonSubsetParser.DOT, i);
		}
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
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
		enterRule(_localctx, 6, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(AT);
			setState(80);
			match(NAME);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(81);
				match(DOT);
				setState(82);
				match(NAME);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(88);
				match(LPAREN);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 483854934016L) != 0)) {
					{
					setState(89);
					arglist();
					}
				}

				setState(92);
				match(RPAREN);
				}
			}

			setState(95);
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
	public static class SimpleStmtContext extends ParserRuleContext {
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
	 
		public SimpleStmtContext() { }
		public void copyFrom(SimpleStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends SimpleStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAssignContext extends SimpleStmtContext {
		public TerminalNode GLOBAL() { return getToken(PythonSubsetParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonSubsetParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonSubsetParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public GlobalAssignContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterGlobalAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitGlobalAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends SimpleStmtContext {
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(PythonSubsetParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simpleStmt);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(NAME);
				setState(99);
				match(EQ);
				setState(100);
				expr(0);
				}
				break;
			case 3:
				_localctx = new GlobalAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(GLOBAL);
				setState(102);
				match(NAME);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(103);
					match(COMMA);
					setState(104);
					match(NAME);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class CompoundStmtContext extends ParserRuleContext {
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
	 
		public CompoundStmtContext() { }
		public void copyFrom(CompoundStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForRuleContext extends CompoundStmtContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ForRuleContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterForRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitForRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitForRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfRuleContext extends CompoundStmtContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfRuleContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterIfRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitIfRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitIfRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefRuleContext extends CompoundStmtContext {
		public DefStmtContext defStmt() {
			return getRuleContext(DefStmtContext.class,0);
		}
		public DefRuleContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterDefRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitDefRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitDefRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compoundStmt);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				ifStmt();
				}
				break;
			case FOR:
				_localctx = new ForRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				forStmt();
				}
				break;
			case DEF:
				_localctx = new DefRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				defStmt();
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
	public static class DefStmtContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonSubsetParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonSubsetParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public DefStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterDefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitDefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefStmtContext defStmt() throws RecognitionException {
		DefStmtContext _localctx = new DefStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(DEF);
			setState(118);
			match(NAME);
			setState(119);
			match(LPAREN);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(120);
				params();
				}
			}

			setState(123);
			match(RPAREN);
			setState(124);
			match(COLON);
			setState(125);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonSubsetParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonSubsetParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NAME);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				match(NAME);
				}
				}
				setState(134);
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonSubsetParser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
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
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IF);
			setState(136);
			test();
			setState(137);
			match(COLON);
			setState(138);
			suite();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(139);
				match(ELIF);
				setState(140);
				test();
				setState(141);
				match(COLON);
				setState(142);
				suite();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(149);
				match(ELSE);
				setState(150);
				match(COLON);
				setState(151);
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
	public static class ForStmtContext extends ParserRuleContext {
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
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(FOR);
			setState(155);
			match(NAME);
			setState(156);
			match(IN);
			setState(157);
			expr(0);
			setState(158);
			match(COLON);
			setState(159);
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
	public static class SuiteContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
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
		enterRule(_localctx, 20, RULE_suite);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case TRUE:
			case FALSE:
			case LPAREN:
			case LBRACK:
			case LBRACE:
			case NUMBER:
			case STRING:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				simpleStmt();
				setState(162);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(NEWLINE);
				setState(165);
				match(INDENT);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					stmt();
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 483855000824L) != 0) );
				setState(171);
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
	public static class TestContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
	public static class ComparisonContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(PythonSubsetParser.LT, 0); }
		public TerminalNode LTEQ() { return getToken(PythonSubsetParser.LTEQ, 0); }
		public TerminalNode GT() { return getToken(PythonSubsetParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(PythonSubsetParser.GTEQ, 0); }
		public TerminalNode EQEQ() { return getToken(PythonSubsetParser.EQEQ, 0); }
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
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PythonSubsetParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonSubsetParser.MINUS, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(PythonSubsetParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PythonSubsetParser.SLASH, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitMulDiv(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(178);
			atom(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(181);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends AtomContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public CallContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(PythonSubsetParser.NUMBER, 0); }
		public NumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLitContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(PythonSubsetParser.TRUE, 0); }
		public TrueLitContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterTrueLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitTrueLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitTrueLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public ParenContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(PythonSubsetParser.STRING, 0); }
		public StringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrAccessContext extends AtomContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonSubsetParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public AttrAccessContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAttrAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAttrAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAttrAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends AtomContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(PythonSubsetParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PythonSubsetParser.RBRACK, 0); }
		public SubscriptContext(AtomContext ctx) { copyFrom(ctx); }
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
	public static class FalseLitContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(PythonSubsetParser.FALSE, 0); }
		public FalseLitContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFalseLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFalseLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFalseLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends AtomContext {
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public NameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictContext extends AtomContext {
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public DictContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends AtomContext {
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public ListContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		return atom(0);
	}

	private AtomContext atom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AtomContext _localctx = new AtomContext(_ctx, _parentState);
		AtomContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_atom, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				match(NAME);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(STRING);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(FALSE);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(LPAREN);
				setState(201);
				expr(0);
				setState(202);
				match(RPAREN);
				}
				break;
			case LBRACK:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				listLiteral();
				}
				break;
			case LBRACE:
				{
				_localctx = new DictContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				dictLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new AttrAccessContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						match(DOT);
						setState(210);
						match(NAME);
						}
						break;
					case 2:
						{
						_localctx = new SubscriptContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(211);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(212);
						match(LBRACK);
						setState(213);
						expr(0);
						setState(214);
						match(RBRACK);
						}
						break;
					case 3:
						{
						_localctx = new CallContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(216);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(217);
						match(LPAREN);
						setState(219);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 483854934016L) != 0)) {
							{
							setState(218);
							arglist();
							}
						}

						setState(221);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class ListLiteralContext extends ParserRuleContext {
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
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LBRACK);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 483854934016L) != 0)) {
				{
				setState(228);
				expr(0);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(229);
					match(COMMA);
					setState(230);
					expr(0);
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(238);
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
	public static class DictLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonSubsetParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonSubsetParser.RBRACE, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dictLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(LBRACE);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 483854934016L) != 0)) {
				{
				setState(241);
				expr(0);
				setState(242);
				match(COLON);
				setState(243);
				expr(0);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(244);
					match(COMMA);
					setState(245);
					expr(0);
					setState(246);
					match(COLON);
					setState(247);
					expr(0);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(256);
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
	public static class ArglistContext extends ParserRuleContext {
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
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			expr(0);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(260);
				expr(0);
				}
				}
				setState(265);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 13:
			return atom_sempred((AtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean atom_sempred(AtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u010b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002;\b\u0002\n\u0002\f\u0002>\t\u0002\u0001\u0002"+
		"\u0003\u0002A\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002\u0001\u0002"+
		"\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003T\b\u0003\n\u0003\f\u0003W\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003[\b\u0003\u0001\u0003\u0003\u0003^\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004j\b\u0004\n\u0004\f\u0004m\t"+
		"\u0004\u0003\u0004o\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005t\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006z\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0083\b\u0007\n\u0007\f\u0007"+
		"\u0086\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u0091\b\b\n\b\f\b\u0094\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0099\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00a8\b\n\u000b"+
		"\n\f\n\u00a9\u0001\n\u0001\n\u0003\n\u00ae\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00be\b\f\n\f\f\f\u00c1\t\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00cf\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00dc\b\r\u0001"+
		"\r\u0005\r\u00df\b\r\n\r\f\r\u00e2\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00e8\b\u000e\n\u000e\f\u000e\u00eb\t\u000e\u0003"+
		"\u000e\u00ed\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00fa\b\u000f\n\u000f\f\u000f\u00fd\t\u000f\u0003\u000f"+
		"\u00ff\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0106\b\u0010\n\u0010\f\u0010\u0109\t\u0010\u0001\u0010\u0000"+
		"\u0002\u0018\u001a\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0003\u0001\u0000\u0019\u001a"+
		"\u0001\u0000\u0017\u0018\u0001\u0000\u0012\u0016\u0122\u0000%\u0001\u0000"+
		"\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000\u0000"+
		"\u0006O\u0001\u0000\u0000\u0000\bn\u0001\u0000\u0000\u0000\ns\u0001\u0000"+
		"\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000"+
		"\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u009a\u0001\u0000\u0000"+
		"\u0000\u0014\u00ad\u0001\u0000\u0000\u0000\u0016\u00af\u0001\u0000\u0000"+
		"\u0000\u0018\u00b1\u0001\u0000\u0000\u0000\u001a\u00ce\u0001\u0000\u0000"+
		"\u0000\u001c\u00e3\u0001\u0000\u0000\u0000\u001e\u00f0\u0001\u0000\u0000"+
		"\u0000 \u0102\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001"+
		"\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*+\u0003"+
		"\b\u0004\u0000+,\u0005\u0001\u0000\u0000,3\u0001\u0000\u0000\u0000-3\u0003"+
		"\n\u0005\u0000.3\u0003\u0004\u0002\u0000/0\u0003\u0006\u0003\u000001\u0003"+
		"\u0002\u0001\u000013\u0001\u0000\u0000\u00002*\u0001\u0000\u0000\u0000"+
		"2-\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u000045\u0005\u0004\u0000\u000056\u0005"+
		"&\u0000\u00006@\u0005\u0003\u0000\u00007<\u0005&\u0000\u000089\u0005#"+
		"\u0000\u00009;\u0005&\u0000\u0000:8\u0001\u0000\u0000\u0000;>\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=A\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?A\u0005\u0019\u0000\u0000"+
		"@7\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BN\u0005\u0001\u0000\u0000CD\u0005\u0003\u0000\u0000DI\u0005&\u0000"+
		"\u0000EF\u0005#\u0000\u0000FH\u0005&\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0005\u0001"+
		"\u0000\u0000M4\u0001\u0000\u0000\u0000MC\u0001\u0000\u0000\u0000N\u0005"+
		"\u0001\u0000\u0000\u0000OP\u0005\u0010\u0000\u0000PU\u0005&\u0000\u0000"+
		"QR\u0005\"\u0000\u0000RT\u0005&\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000V]\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XZ\u0005\u001b"+
		"\u0000\u0000Y[\u0003 \u0010\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0005\u001c\u0000\u0000]X\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0001\u0000\u0000`\u0007\u0001\u0000\u0000\u0000ao\u0003\u0018"+
		"\f\u0000bc\u0005&\u0000\u0000cd\u0005\u0011\u0000\u0000do\u0003\u0018"+
		"\f\u0000ef\u0005\u0005\u0000\u0000fk\u0005&\u0000\u0000gh\u0005#\u0000"+
		"\u0000hj\u0005&\u0000\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000na\u0001\u0000\u0000\u0000nb\u0001"+
		"\u0000\u0000\u0000ne\u0001\u0000\u0000\u0000o\t\u0001\u0000\u0000\u0000"+
		"pt\u0003\u0010\b\u0000qt\u0003\u0012\t\u0000rt\u0003\f\u0006\u0000sp\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"t\u000b\u0001\u0000\u0000\u0000uv\u0005\u0006\u0000\u0000vw\u0005&\u0000"+
		"\u0000wy\u0005\u001b\u0000\u0000xz\u0003\u000e\u0007\u0000yx\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005"+
		"\u001c\u0000\u0000|}\u0005!\u0000\u0000}~\u0003\u0014\n\u0000~\r\u0001"+
		"\u0000\u0000\u0000\u007f\u0084\u0005&\u0000\u0000\u0080\u0081\u0005#\u0000"+
		"\u0000\u0081\u0083\u0005&\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u000f\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000"+
		"\u0088\u0089\u0003\u0016\u000b\u0000\u0089\u008a\u0005!\u0000\u0000\u008a"+
		"\u0092\u0003\u0014\n\u0000\u008b\u008c\u0005\b\u0000\u0000\u008c\u008d"+
		"\u0003\u0016\u000b\u0000\u008d\u008e\u0005!\u0000\u0000\u008e\u008f\u0003"+
		"\u0014\n\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008b\u0001\u0000"+
		"\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0098\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005\t\u0000"+
		"\u0000\u0096\u0097\u0005!\u0000\u0000\u0097\u0099\u0003\u0014\n\u0000"+
		"\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u0011\u0001\u0000\u0000\u0000\u009a\u009b\u0005\n\u0000\u0000\u009b"+
		"\u009c\u0005&\u0000\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d\u009e"+
		"\u0003\u0018\f\u0000\u009e\u009f\u0005!\u0000\u0000\u009f\u00a0\u0003"+
		"\u0014\n\u0000\u00a0\u0013\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\b"+
		"\u0004\u0000\u00a2\u00a3\u0005\u0001\u0000\u0000\u00a3\u00ae\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\u0001\u0000\u0000\u00a5\u00a7\u0005(\u0000"+
		"\u0000\u00a6\u00a8\u0003\u0002\u0001\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005)\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a1\u0001\u0000\u0000\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000"+
		"\u00ae\u0015\u0001\u0000\u0000\u0000\u00af\u00b0\u0003\u0018\f\u0000\u00b0"+
		"\u0017\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006\f\uffff\uffff\u0000\u00b2"+
		"\u00b3\u0003\u001a\r\u0000\u00b3\u00bf\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\n\u0004\u0000\u0000\u00b5\u00b6\u0007\u0000\u0000\u0000\u00b6\u00be\u0003"+
		"\u0018\f\u0005\u00b7\u00b8\n\u0003\u0000\u0000\u00b8\u00b9\u0007\u0001"+
		"\u0000\u0000\u00b9\u00be\u0003\u0018\f\u0004\u00ba\u00bb\n\u0002\u0000"+
		"\u0000\u00bb\u00bc\u0007\u0002\u0000\u0000\u00bc\u00be\u0003\u0018\f\u0003"+
		"\u00bd\u00b4\u0001\u0000\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bd\u00ba\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c0\u0019\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0006\r\uffff\uffff\u0000\u00c3\u00cf\u0005&\u0000\u0000"+
		"\u00c4\u00cf\u0005$\u0000\u0000\u00c5\u00cf\u0005%\u0000\u0000\u00c6\u00cf"+
		"\u0005\r\u0000\u0000\u00c7\u00cf\u0005\u000e\u0000\u0000\u00c8\u00c9\u0005"+
		"\u001b\u0000\u0000\u00c9\u00ca\u0003\u0018\f\u0000\u00ca\u00cb\u0005\u001c"+
		"\u0000\u0000\u00cb\u00cf\u0001\u0000\u0000\u0000\u00cc\u00cf\u0003\u001c"+
		"\u000e\u0000\u00cd\u00cf\u0003\u001e\u000f\u0000\u00ce\u00c2\u0001\u0000"+
		"\u0000\u0000\u00ce\u00c4\u0001\u0000\u0000\u0000\u00ce\u00c5\u0001\u0000"+
		"\u0000\u0000\u00ce\u00c6\u0001\u0000\u0000\u0000\u00ce\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00e0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\n\u0005\u0000\u0000\u00d1\u00d2\u0005\"\u0000"+
		"\u0000\u00d2\u00df\u0005&\u0000\u0000\u00d3\u00d4\n\u0004\u0000\u0000"+
		"\u00d4\u00d5\u0005\u001d\u0000\u0000\u00d5\u00d6\u0003\u0018\f\u0000\u00d6"+
		"\u00d7\u0005\u001e\u0000\u0000\u00d7\u00df\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\n\u0003\u0000\u0000\u00d9\u00db\u0005\u001b\u0000\u0000\u00da\u00dc"+
		"\u0003 \u0010\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0005"+
		"\u001c\u0000\u0000\u00de\u00d0\u0001\u0000\u0000\u0000\u00de\u00d3\u0001"+
		"\u0000\u0000\u0000\u00de\u00d8\u0001\u0000\u0000\u0000\u00df\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u001b\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e3\u00ec\u0005\u001d\u0000\u0000\u00e4\u00e9\u0003"+
		"\u0018\f\u0000\u00e5\u00e6\u0005#\u0000\u0000\u00e6\u00e8\u0003\u0018"+
		"\f\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e4\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u001e\u0000"+
		"\u0000\u00ef\u001d\u0001\u0000\u0000\u0000\u00f0\u00fe\u0005\u001f\u0000"+
		"\u0000\u00f1\u00f2\u0003\u0018\f\u0000\u00f2\u00f3\u0005!\u0000\u0000"+
		"\u00f3\u00fb\u0003\u0018\f\u0000\u00f4\u00f5\u0005#\u0000\u0000\u00f5"+
		"\u00f6\u0003\u0018\f\u0000\u00f6\u00f7\u0005!\u0000\u0000\u00f7\u00f8"+
		"\u0003\u0018\f\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00f1\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005 \u0000\u0000\u0101\u001f\u0001\u0000"+
		"\u0000\u0000\u0102\u0107\u0003\u0018\f\u0000\u0103\u0104\u0005#\u0000"+
		"\u0000\u0104\u0106\u0003\u0018\f\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108!\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u001d%2<@IMUZ]knsy\u0084\u0092\u0098\u00a9"+
		"\u00ad\u00bd\u00bf\u00ce\u00db\u00de\u00e0\u00e9\u00ec\u00fb\u00fe\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}