// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/CSSParser.g4 by ANTLR 4.13.2

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
public class CSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AT_IMPORT=1, AT_MEDIA=2, AT_KEYFRAMES=3, HASH=4, CLASS=5, PSEUDO=6, IMPORTANT=7, 
		LBRACE=8, RBRACE=9, LPAREN=10, RPAREN=11, LBRACK=12, RBRACK=13, SEMICOLON=14, 
		COLON=15, COMMA=16, GT=17, PLUS=18, TILDE=19, STAR=20, STRING=21, NUMBER=22, 
		UNIT=23, COLOR_HEX=24, IDENT=25, URL=26, WS=27, COMMENT=28;
	public static final int
		RULE_stylesheet = 0, RULE_rule = 1, RULE_selector_group = 2, RULE_selector = 3, 
		RULE_combinator = 4, RULE_simple_selector = 5, RULE_selector_modifier = 6, 
		RULE_attribute_selector = 7, RULE_media_query = 8, RULE_declaration = 9, 
		RULE_value = 10, RULE_value_item = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "rule", "selector_group", "selector", "combinator", "simple_selector", 
			"selector_modifier", "attribute_selector", "media_query", "declaration", 
			"value", "value_item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@import'", "'@media'", "'@keyframes'", null, null, null, "'!important'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", "','", "'>'", 
			"'+'", "'~'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AT_IMPORT", "AT_MEDIA", "AT_KEYFRAMES", "HASH", "CLASS", "PSEUDO", 
			"IMPORTANT", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"SEMICOLON", "COLON", "COMMA", "GT", "PLUS", "TILDE", "STAR", "STRING", 
			"NUMBER", "UNIT", "COLOR_HEX", "IDENT", "URL", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "CSSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSSParser.EOF, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34607222L) != 0)) {
				{
				{
				setState(24);
				rule_();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
	public static class RuleContext extends ParserRuleContext {
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
	 
		public RuleContext() { }
		public void copyFrom(RuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleRuleContext extends RuleContext {
		public Selector_groupContext selector_group() {
			return getRuleContext(Selector_groupContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CSSParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CSSParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public StyleRuleContext(RuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterStyleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitStyleRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitStyleRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaRuleContext extends RuleContext {
		public TerminalNode AT_MEDIA() { return getToken(CSSParser.AT_MEDIA, 0); }
		public Media_queryContext media_query() {
			return getRuleContext(Media_queryContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CSSParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CSSParser.RBRACE, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public MediaRuleContext(RuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMediaRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMediaRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMediaRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportRuleContext extends RuleContext {
		public TerminalNode AT_IMPORT() { return getToken(CSSParser.AT_IMPORT, 0); }
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSSParser.SEMICOLON, 0); }
		public ImportRuleContext(RuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterImportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitImportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitImportRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case CLASS:
			case PSEUDO:
			case LBRACK:
			case STAR:
			case IDENT:
				_localctx = new StyleRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				selector_group();
				setState(33);
				match(LBRACE);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(34);
					declaration();
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				match(RBRACE);
				}
				break;
			case AT_IMPORT:
				_localctx = new ImportRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(AT_IMPORT);
				setState(43);
				match(STRING);
				setState(44);
				match(SEMICOLON);
				}
				break;
			case AT_MEDIA:
				_localctx = new MediaRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(AT_MEDIA);
				setState(46);
				media_query();
				setState(47);
				match(LBRACE);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34607222L) != 0)) {
					{
					{
					setState(48);
					rule_();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(RBRACE);
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
	public static class Selector_groupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public Selector_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterSelector_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitSelector_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitSelector_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_groupContext selector_group() throws RecognitionException {
		Selector_groupContext _localctx = new Selector_groupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selector_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			selector(0);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);
				setState(60);
				selector(0);
				}
				}
				setState(65);
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
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CombinedSelectorContext extends SelectorContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public CombinatorContext combinator() {
			return getRuleContext(CombinatorContext.class,0);
		}
		public Simple_selectorContext simple_selector() {
			return getRuleContext(Simple_selectorContext.class,0);
		}
		public CombinedSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterCombinedSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitCombinedSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitCombinedSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorRuleContext extends SelectorContext {
		public Simple_selectorContext simple_selector() {
			return getRuleContext(Simple_selectorContext.class,0);
		}
		public SimpleSelectorRuleContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterSimpleSelectorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitSimpleSelectorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitSimpleSelectorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		return selector(0);
	}

	private SelectorContext selector(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SelectorContext _localctx = new SelectorContext(_ctx, _parentState);
		SelectorContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_selector, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SimpleSelectorRuleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(67);
			simple_selector();
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CombinedSelectorContext(new SelectorContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_selector);
					setState(69);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(70);
					combinator();
					setState(71);
					simple_selector();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class CombinatorContext extends ParserRuleContext {
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	 
		public CombinatorContext() { }
		public void copyFrom(CombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildCombinatorContext extends CombinatorContext {
		public TerminalNode GT() { return getToken(CSSParser.GT, 0); }
		public ChildCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterChildCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitChildCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitChildCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescendantCombinatorContext extends CombinatorContext {
		public TerminalNode WS() { return getToken(CSSParser.WS, 0); }
		public DescendantCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterDescendantCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitDescendantCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitDescendantCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneralSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode TILDE() { return getToken(CSSParser.TILDE, 0); }
		public GeneralSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterGeneralSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitGeneralSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitGeneralSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdjacentSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public AdjacentSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterAdjacentSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitAdjacentSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitAdjacentSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_combinator);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case CLASS:
			case PSEUDO:
			case LBRACK:
			case STAR:
			case IDENT:
			case WS:
				_localctx = new DescendantCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(78);
					match(WS);
					}
				}

				}
				break;
			case GT:
				_localctx = new ChildCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(GT);
				}
				break;
			case PLUS:
				_localctx = new AdjacentSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(PLUS);
				}
				break;
			case TILDE:
				_localctx = new GeneralSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(TILDE);
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
	public static class Simple_selectorContext extends ParserRuleContext {
		public Simple_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_selector; }
	 
		public Simple_selectorContext() { }
		public void copyFrom(Simple_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UniversalSelectorContext extends Simple_selectorContext {
		public TerminalNode STAR() { return getToken(CSSParser.STAR, 0); }
		public UniversalSelectorContext(Simple_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterUniversalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitUniversalSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModifierOnlySelectorContext extends Simple_selectorContext {
		public List<Selector_modifierContext> selector_modifier() {
			return getRuleContexts(Selector_modifierContext.class);
		}
		public Selector_modifierContext selector_modifier(int i) {
			return getRuleContext(Selector_modifierContext.class,i);
		}
		public ModifierOnlySelectorContext(Simple_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterModifierOnlySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitModifierOnlySelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitModifierOnlySelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementSelectorContext extends Simple_selectorContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public List<Selector_modifierContext> selector_modifier() {
			return getRuleContexts(Selector_modifierContext.class);
		}
		public Selector_modifierContext selector_modifier(int i) {
			return getRuleContext(Selector_modifierContext.class,i);
		}
		public ElementSelectorContext(Simple_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_selectorContext simple_selector() throws RecognitionException {
		Simple_selectorContext _localctx = new Simple_selectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_selector);
		try {
			int _alt;
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new ElementSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(IDENT);
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(87);
						selector_modifier();
						}
						} 
					}
					setState(92);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case HASH:
			case CLASS:
			case PSEUDO:
			case LBRACK:
				_localctx = new ModifierOnlySelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(93);
						selector_modifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(96); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case STAR:
				_localctx = new UniversalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(STAR);
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
	public static class Selector_modifierContext extends ParserRuleContext {
		public Selector_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_modifier; }
	 
		public Selector_modifierContext() { }
		public void copyFrom(Selector_modifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassModifierContext extends Selector_modifierContext {
		public TerminalNode CLASS() { return getToken(CSSParser.CLASS, 0); }
		public ClassModifierContext(Selector_modifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdModifierContext extends Selector_modifierContext {
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public IdModifierContext(Selector_modifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterIdModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitIdModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitIdModifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoModifierContext extends Selector_modifierContext {
		public TerminalNode PSEUDO() { return getToken(CSSParser.PSEUDO, 0); }
		public PseudoModifierContext(Selector_modifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterPseudoModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitPseudoModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitPseudoModifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeModifierContext extends Selector_modifierContext {
		public TerminalNode LBRACK() { return getToken(CSSParser.LBRACK, 0); }
		public Attribute_selectorContext attribute_selector() {
			return getRuleContext(Attribute_selectorContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CSSParser.RBRACK, 0); }
		public AttributeModifierContext(Selector_modifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterAttributeModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitAttributeModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitAttributeModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_modifierContext selector_modifier() throws RecognitionException {
		Selector_modifierContext _localctx = new Selector_modifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector_modifier);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new ClassModifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(CLASS);
				}
				break;
			case HASH:
				_localctx = new IdModifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(HASH);
				}
				break;
			case PSEUDO:
				_localctx = new PseudoModifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(PSEUDO);
				}
				break;
			case LBRACK:
				_localctx = new AttributeModifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(LBRACK);
				setState(105);
				attribute_selector();
				setState(106);
				match(RBRACK);
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
	public static class Attribute_selectorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(CSSParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CSSParser.IDENT, i);
		}
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public Attribute_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterAttribute_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitAttribute_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitAttribute_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_selectorContext attribute_selector() throws RecognitionException {
		Attribute_selectorContext _localctx = new Attribute_selectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IDENT);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(111);
				match(COLON);
				setState(112);
				match(IDENT);
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
	public static class Media_queryContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(CSSParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CSSParser.IDENT, i);
		}
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public Media_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Media_queryContext media_query() throws RecognitionException {
		Media_queryContext _localctx = new Media_queryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_media_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENT);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(116);
				match(COLON);
				setState(117);
				match(IDENT);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationNoSemicolonContext extends DeclarationContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IMPORTANT() { return getToken(CSSParser.IMPORTANT, 0); }
		public PropertyDeclarationNoSemicolonContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterPropertyDeclarationNoSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitPropertyDeclarationNoSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitPropertyDeclarationNoSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends DeclarationContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSSParser.SEMICOLON, 0); }
		public TerminalNode IMPORTANT() { return getToken(CSSParser.IMPORTANT, 0); }
		public PropertyDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PropertyDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(IDENT);
				setState(121);
				match(COLON);
				setState(122);
				value();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPORTANT) {
					{
					setState(123);
					match(IMPORTANT);
					}
				}

				setState(126);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new PropertyDeclarationNoSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(IDENT);
				setState(129);
				match(COLON);
				setState(130);
				value();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPORTANT) {
					{
					setState(131);
					match(IMPORTANT);
					}
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
	public static class ValueContext extends ParserRuleContext {
		public List<Value_itemContext> value_item() {
			return getRuleContexts(Value_itemContext.class);
		}
		public Value_itemContext value_item(int i) {
			return getRuleContext(Value_itemContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(136);
					value_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Value_itemContext extends ParserRuleContext {
		public Value_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_item; }
	 
		public Value_itemContext() { }
		public void copyFrom(Value_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberValueContext extends Value_itemContext {
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(CSSParser.UNIT, 0); }
		public NumberValueContext(Value_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorValueContext extends Value_itemContext {
		public TerminalNode COLOR_HEX() { return getToken(CSSParser.COLOR_HEX, 0); }
		public ColorValueContext(Value_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitColorValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaValueContext extends Value_itemContext {
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public CommaValueContext(Value_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterCommaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitCommaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitCommaValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends Value_itemContext {
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public StringValueContext(Value_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentValueContext extends Value_itemContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public IdentValueContext(Value_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterIdentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitIdentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitIdentValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlValueContext extends Value_itemContext {
		public TerminalNode URL() { return getToken(CSSParser.URL, 0); }
		public UrlValueContext(Value_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterUrlValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitUrlValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitUrlValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_itemContext value_item() throws RecognitionException {
		Value_itemContext _localctx = new Value_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value_item);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(NUMBER);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(142);
					match(UNIT);
					}
				}

				}
				break;
			case COLOR_HEX:
				_localctx = new ColorValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(COLOR_HEX);
				}
				break;
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(STRING);
				}
				break;
			case IDENT:
				_localctx = new IdentValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(IDENT);
				}
				break;
			case URL:
				_localctx = new UrlValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(URL);
				}
				break;
			case COMMA:
				_localctx = new CommaValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(COMMA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return selector_sempred((SelectorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean selector_sempred(SelectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0099\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001$\b"+
		"\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u00012\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b\u0002"+
		"\n\u0002\f\u0002A\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003J\b\u0003\n\u0003\f\u0003"+
		"M\t\u0003\u0001\u0004\u0003\u0004P\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004U\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005Y\b\u0005"+
		"\n\u0005\f\u0005\\\t\u0005\u0001\u0005\u0004\u0005_\b\u0005\u000b\u0005"+
		"\f\u0005`\u0001\u0005\u0003\u0005d\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006m\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007r\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\bw\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t}\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0085"+
		"\b\t\u0003\t\u0087\b\t\u0001\n\u0004\n\u008a\b\n\u000b\n\f\n\u008b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0090\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0097\b\u000b\u0001\u000b\u0000"+
		"\u0001\u0006\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0000\u00aa\u0000\u001b\u0001\u0000\u0000\u0000\u00028\u0001\u0000"+
		"\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000"+
		"\bT\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fl\u0001\u0000"+
		"\u0000\u0000\u000en\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000"+
		"\u0012\u0086\u0001\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000"+
		"\u0016\u0096\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000"+
		" !\u0003\u0004\u0002\u0000!%\u0005\b\u0000\u0000\"$\u0003\u0012\t\u0000"+
		"#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000()\u0005\t\u0000\u0000)9\u0001\u0000\u0000\u0000*+\u0005\u0001"+
		"\u0000\u0000+,\u0005\u0015\u0000\u0000,9\u0005\u000e\u0000\u0000-.\u0005"+
		"\u0002\u0000\u0000./\u0003\u0010\b\u0000/3\u0005\b\u0000\u000002\u0003"+
		"\u0002\u0001\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000067\u0005\t\u0000\u000079\u0001\u0000\u0000"+
		"\u00008 \u0001\u0000\u0000\u00008*\u0001\u0000\u0000\u00008-\u0001\u0000"+
		"\u0000\u00009\u0003\u0001\u0000\u0000\u0000:?\u0003\u0006\u0003\u0000"+
		";<\u0005\u0010\u0000\u0000<>\u0003\u0006\u0003\u0000=;\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@\u0005\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BC\u0006\u0003\uffff\uffff\u0000CD\u0003\n\u0005\u0000DK\u0001\u0000\u0000"+
		"\u0000EF\n\u0002\u0000\u0000FG\u0003\b\u0004\u0000GH\u0003\n\u0005\u0000"+
		"HJ\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0007\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0005\u001b\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PU\u0001\u0000\u0000"+
		"\u0000QU\u0005\u0011\u0000\u0000RU\u0005\u0012\u0000\u0000SU\u0005\u0013"+
		"\u0000\u0000TO\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000"+
		"VZ\u0005\u0019\u0000\u0000WY\u0003\f\u0006\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[d\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0003\f"+
		"\u0006\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000"+
		"bd\u0005\u0014\u0000\u0000cV\u0001\u0000\u0000\u0000c^\u0001\u0000\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000d\u000b\u0001\u0000\u0000\u0000em\u0005"+
		"\u0005\u0000\u0000fm\u0005\u0004\u0000\u0000gm\u0005\u0006\u0000\u0000"+
		"hi\u0005\f\u0000\u0000ij\u0003\u000e\u0007\u0000jk\u0005\r\u0000\u0000"+
		"km\u0001\u0000\u0000\u0000le\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000"+
		"\u0000lg\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000m\r\u0001\u0000"+
		"\u0000\u0000nq\u0005\u0019\u0000\u0000op\u0005\u000f\u0000\u0000pr\u0005"+
		"\u0019\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"r\u000f\u0001\u0000\u0000\u0000sv\u0005\u0019\u0000\u0000tu\u0005\u000f"+
		"\u0000\u0000uw\u0005\u0019\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000w\u0011\u0001\u0000\u0000\u0000xy\u0005\u0019\u0000"+
		"\u0000yz\u0005\u000f\u0000\u0000z|\u0003\u0014\n\u0000{}\u0005\u0007\u0000"+
		"\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u000e\u0000\u0000\u007f\u0087\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0019\u0000\u0000\u0081\u0082\u0005\u000f\u0000"+
		"\u0000\u0082\u0084\u0003\u0014\n\u0000\u0083\u0085\u0005\u0007\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086x\u0001\u0000\u0000\u0000\u0086"+
		"\u0080\u0001\u0000\u0000\u0000\u0087\u0013\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0003\u0016\u000b\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u0015\u0001\u0000\u0000\u0000\u008d"+
		"\u008f\u0005\u0016\u0000\u0000\u008e\u0090\u0005\u0017\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0097\u0001\u0000\u0000\u0000\u0091\u0097\u0005\u0018\u0000\u0000\u0092"+
		"\u0097\u0005\u0015\u0000\u0000\u0093\u0097\u0005\u0019\u0000\u0000\u0094"+
		"\u0097\u0005\u001a\u0000\u0000\u0095\u0097\u0005\u0010\u0000\u0000\u0096"+
		"\u008d\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096"+
		"\u0092\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0017\u0001\u0000\u0000\u0000\u0014\u001b%38?KOTZ`clqv|\u0084\u0086\u008b"+
		"\u008f\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}