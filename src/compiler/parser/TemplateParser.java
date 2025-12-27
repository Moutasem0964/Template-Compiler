// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/TemplateParser.g4 by ANTLR 4.13.2

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
public class TemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JINJA_BLOCK_START=1, JINJA_VAR_START=2, JINJA_COMMENT_START=3, HTML_OPEN=4, 
		HTML_CLOSE=5, HTML_SELF_CLOSE=6, DOCTYPE=7, HTML_TEXT=8, HTML_WS=9, JINJA_BLOCK_END=10, 
		JINJA_VAR_END=11, FOR=12, IN=13, IF=14, ELIF=15, ELSE=16, ENDIF=17, ENDFOR=18, 
		DOT=19, LPAREN=20, RPAREN=21, LBRACK=22, RBRACK=23, COMMA=24, EQUAL=25, 
		PIPE=26, JINJA_STRING=27, JINJA_NUMBER=28, JINJA_NAME=29, JINJA_WS=30, 
		TAG_CLOSE=31, TAG_SLASH_CLOSE=32, TAG_EQUALS=33, TAG_NAME=34, TAG_VALUE=35, 
		TAG_JINJA_VAR_START=36, TAG_WS=37, JINJA_COMMENT_END=38, JINJA_COMMENT_TEXT=39;
	public static final int
		RULE_template = 0, RULE_content = 1, RULE_html_element = 2, RULE_attribute = 3, 
		RULE_text_content = 4, RULE_jinja_variable = 5, RULE_jinja_for = 6, RULE_jinja_if = 7, 
		RULE_jinja_comment = 8, RULE_jinja_expr = 9, RULE_jinja_args = 10, RULE_jinja_arg = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "content", "html_element", "attribute", "text_content", "jinja_variable", 
			"jinja_for", "jinja_if", "jinja_comment", "jinja_expr", "jinja_args", 
			"jinja_arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{%'", null, "'{#'", null, null, null, null, null, null, "'%}'", 
			"'}}'", "'for'", "'in'", "'if'", "'elif'", "'else'", "'endif'", "'endfor'", 
			"'.'", "'('", "')'", "'['", "']'", "','", null, "'|'", null, null, null, 
			null, "'>'", null, null, null, null, null, null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JINJA_BLOCK_START", "JINJA_VAR_START", "JINJA_COMMENT_START", 
			"HTML_OPEN", "HTML_CLOSE", "HTML_SELF_CLOSE", "DOCTYPE", "HTML_TEXT", 
			"HTML_WS", "JINJA_BLOCK_END", "JINJA_VAR_END", "FOR", "IN", "IF", "ELIF", 
			"ELSE", "ENDIF", "ENDFOR", "DOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"COMMA", "EQUAL", "PIPE", "JINJA_STRING", "JINJA_NUMBER", "JINJA_NAME", 
			"JINJA_WS", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_EQUALS", "TAG_NAME", 
			"TAG_VALUE", "TAG_JINJA_VAR_START", "TAG_WS", "JINJA_COMMENT_END", "JINJA_COMMENT_TEXT"
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
	public String getGrammarFileName() { return "TemplateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TemplateParser.EOF, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 414L) != 0)) {
				{
				{
				setState(24);
				content();
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
	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVariableContentContext extends ContentContext {
		public Jinja_variableContext jinja_variable() {
			return getRuleContext(Jinja_variableContext.class,0);
		}
		public JinjaVariableContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaVariableContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaVariableContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaVariableContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ContentContext {
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public HtmlContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentContentContext extends ContentContext {
		public Jinja_commentContext jinja_comment() {
			return getRuleContext(Jinja_commentContext.class,0);
		}
		public JinjaCommentContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaCommentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaCommentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaCommentContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfContentContext extends ContentContext {
		public Jinja_ifContext jinja_if() {
			return getRuleContext(Jinja_ifContext.class,0);
		}
		public JinjaIfContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForContentContext extends ContentContext {
		public Jinja_forContext jinja_for() {
			return getRuleContext(Jinja_forContext.class,0);
		}
		public JinjaForContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContentContext extends ContentContext {
		public Text_contentContext text_content() {
			return getRuleContext(Text_contentContext.class,0);
		}
		public TextContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterTextContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitTextContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitTextContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeContentContext extends ContentContext {
		public TerminalNode DOCTYPE() { return getToken(TemplateParser.DOCTYPE, 0); }
		public DoctypeContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDoctypeContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDoctypeContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDoctypeContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new HtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				html_element();
				}
				break;
			case 2:
				_localctx = new TextContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				text_content();
				}
				break;
			case 3:
				_localctx = new JinjaVariableContentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				jinja_variable();
				}
				break;
			case 4:
				_localctx = new JinjaForContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				jinja_for();
				}
				break;
			case 5:
				_localctx = new JinjaIfContentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				jinja_if();
				}
				break;
			case 6:
				_localctx = new JinjaCommentContentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				jinja_comment();
				}
				break;
			case 7:
				_localctx = new DoctypeContentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(38);
				match(DOCTYPE);
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
	public static class Html_elementContext extends ParserRuleContext {
		public Html_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_element; }
	 
		public Html_elementContext() { }
		public void copyFrom(Html_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends Html_elementContext {
		public TerminalNode HTML_OPEN() { return getToken(TemplateParser.HTML_OPEN, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(TemplateParser.TAG_SLASH_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingElementContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends Html_elementContext {
		public TerminalNode HTML_OPEN() { return getToken(TemplateParser.HTML_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(TemplateParser.TAG_CLOSE, 0); }
		public TerminalNode HTML_CLOSE() { return getToken(TemplateParser.HTML_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public NormalElementContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_html_element);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(HTML_OPEN);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(42);
					attribute();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				match(TAG_CLOSE);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 414L) != 0)) {
					{
					{
					setState(49);
					content();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(HTML_CLOSE);
				}
				break;
			case 2:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(HTML_OPEN);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(57);
					attribute();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(TAG_SLASH_CLOSE);
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
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DynamicAttributeContext extends AttributeContext {
		public TerminalNode TAG_NAME() { return getToken(TemplateParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(TemplateParser.TAG_EQUALS, 0); }
		public TerminalNode TAG_JINJA_VAR_START() { return getToken(TemplateParser.TAG_JINJA_VAR_START, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode JINJA_VAR_END() { return getToken(TemplateParser.JINJA_VAR_END, 0); }
		public DynamicAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDynamicAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDynamicAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDynamicAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StaticAttributeContext extends AttributeContext {
		public TerminalNode TAG_NAME() { return getToken(TemplateParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(TemplateParser.TAG_EQUALS, 0); }
		public TerminalNode TAG_VALUE() { return getToken(TemplateParser.TAG_VALUE, 0); }
		public StaticAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterStaticAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitStaticAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitStaticAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StaticAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(TAG_NAME);
				setState(67);
				match(TAG_EQUALS);
				setState(68);
				match(TAG_VALUE);
				}
				break;
			case 2:
				_localctx = new DynamicAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(TAG_NAME);
				setState(70);
				match(TAG_EQUALS);
				setState(71);
				match(TAG_JINJA_VAR_START);
				setState(72);
				jinja_expr(0);
				setState(73);
				match(JINJA_VAR_END);
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
	public static class Text_contentContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(TemplateParser.HTML_TEXT, 0); }
		public Text_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterText_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitText_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitText_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_contentContext text_content() throws RecognitionException {
		Text_contentContext _localctx = new Text_contentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(HTML_TEXT);
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
	public static class Jinja_variableContext extends ParserRuleContext {
		public TerminalNode JINJA_VAR_START() { return getToken(TemplateParser.JINJA_VAR_START, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode JINJA_VAR_END() { return getToken(TemplateParser.JINJA_VAR_END, 0); }
		public List<TerminalNode> PIPE() { return getTokens(TemplateParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(TemplateParser.PIPE, i);
		}
		public List<TerminalNode> JINJA_NAME() { return getTokens(TemplateParser.JINJA_NAME); }
		public TerminalNode JINJA_NAME(int i) {
			return getToken(TemplateParser.JINJA_NAME, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(TemplateParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TemplateParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TemplateParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TemplateParser.RPAREN, i);
		}
		public List<Jinja_argsContext> jinja_args() {
			return getRuleContexts(Jinja_argsContext.class);
		}
		public Jinja_argsContext jinja_args(int i) {
			return getRuleContext(Jinja_argsContext.class,i);
		}
		public Jinja_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinja_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinja_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinja_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_variableContext jinja_variable() throws RecognitionException {
		Jinja_variableContext _localctx = new Jinja_variableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jinja_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(JINJA_VAR_START);
			setState(80);
			jinja_expr(0);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(81);
				match(PIPE);
				setState(82);
				match(JINJA_NAME);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(83);
					match(LPAREN);
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 940572672L) != 0)) {
						{
						setState(84);
						jinja_args();
						}
					}

					setState(87);
					match(RPAREN);
					}
				}

				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(JINJA_VAR_END);
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
	public static class Jinja_forContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_BLOCK_START() { return getTokens(TemplateParser.JINJA_BLOCK_START); }
		public TerminalNode JINJA_BLOCK_START(int i) {
			return getToken(TemplateParser.JINJA_BLOCK_START, i);
		}
		public TerminalNode FOR() { return getToken(TemplateParser.FOR, 0); }
		public TerminalNode JINJA_NAME() { return getToken(TemplateParser.JINJA_NAME, 0); }
		public TerminalNode IN() { return getToken(TemplateParser.IN, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(TemplateParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(TemplateParser.JINJA_BLOCK_END, i);
		}
		public TerminalNode ENDFOR() { return getToken(TemplateParser.ENDFOR, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public Jinja_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinja_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinja_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinja_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_forContext jinja_for() throws RecognitionException {
		Jinja_forContext _localctx = new Jinja_forContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jinja_for);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(JINJA_BLOCK_START);
			setState(98);
			match(FOR);
			setState(99);
			match(JINJA_NAME);
			setState(100);
			match(IN);
			setState(101);
			jinja_expr(0);
			setState(102);
			match(JINJA_BLOCK_END);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					content();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(109);
			match(JINJA_BLOCK_START);
			setState(110);
			match(ENDFOR);
			setState(111);
			match(JINJA_BLOCK_END);
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
	public static class Jinja_ifContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_BLOCK_START() { return getTokens(TemplateParser.JINJA_BLOCK_START); }
		public TerminalNode JINJA_BLOCK_START(int i) {
			return getToken(TemplateParser.JINJA_BLOCK_START, i);
		}
		public TerminalNode IF() { return getToken(TemplateParser.IF, 0); }
		public List<Jinja_exprContext> jinja_expr() {
			return getRuleContexts(Jinja_exprContext.class);
		}
		public Jinja_exprContext jinja_expr(int i) {
			return getRuleContext(Jinja_exprContext.class,i);
		}
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(TemplateParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(TemplateParser.JINJA_BLOCK_END, i);
		}
		public TerminalNode ENDIF() { return getToken(TemplateParser.ENDIF, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(TemplateParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(TemplateParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(TemplateParser.ELSE, 0); }
		public Jinja_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinja_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinja_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinja_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_ifContext jinja_if() throws RecognitionException {
		Jinja_ifContext _localctx = new Jinja_ifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jinja_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(JINJA_BLOCK_START);
			setState(114);
			match(IF);
			setState(115);
			jinja_expr(0);
			setState(116);
			match(JINJA_BLOCK_END);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					content();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(JINJA_BLOCK_START);
					setState(124);
					match(ELIF);
					setState(125);
					jinja_expr(0);
					setState(126);
					match(JINJA_BLOCK_END);
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(127);
							content();
							}
							} 
						}
						setState(132);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(138);
				match(JINJA_BLOCK_START);
				setState(139);
				match(ELSE);
				setState(140);
				match(JINJA_BLOCK_END);
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						content();
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			}
			setState(149);
			match(JINJA_BLOCK_START);
			setState(150);
			match(ENDIF);
			setState(151);
			match(JINJA_BLOCK_END);
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
	public static class Jinja_commentContext extends ParserRuleContext {
		public TerminalNode JINJA_COMMENT_START() { return getToken(TemplateParser.JINJA_COMMENT_START, 0); }
		public TerminalNode JINJA_COMMENT_END() { return getToken(TemplateParser.JINJA_COMMENT_END, 0); }
		public TerminalNode JINJA_COMMENT_TEXT() { return getToken(TemplateParser.JINJA_COMMENT_TEXT, 0); }
		public Jinja_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinja_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinja_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinja_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_commentContext jinja_comment() throws RecognitionException {
		Jinja_commentContext _localctx = new Jinja_commentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinja_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(JINJA_COMMENT_START);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_COMMENT_TEXT) {
				{
				setState(154);
				match(JINJA_COMMENT_TEXT);
				}
			}

			setState(157);
			match(JINJA_COMMENT_END);
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
	public static class Jinja_exprContext extends ParserRuleContext {
		public Jinja_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_expr; }
	 
		public Jinja_exprContext() { }
		public void copyFrom(Jinja_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFunctionCallContext extends Jinja_exprContext {
		public TerminalNode JINJA_NAME() { return getToken(TemplateParser.JINJA_NAME, 0); }
		public TerminalNode LPAREN() { return getToken(TemplateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TemplateParser.RPAREN, 0); }
		public Jinja_argsContext jinja_args() {
			return getRuleContext(Jinja_argsContext.class,0);
		}
		public JinjaFunctionCallContext(Jinja_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStringContext extends Jinja_exprContext {
		public TerminalNode JINJA_STRING() { return getToken(TemplateParser.JINJA_STRING, 0); }
		public JinjaStringContext(Jinja_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaParenExprContext extends Jinja_exprContext {
		public TerminalNode LPAREN() { return getToken(TemplateParser.LPAREN, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TemplateParser.RPAREN, 0); }
		public JinjaParenExprContext(Jinja_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSubscriptContext extends Jinja_exprContext {
		public List<Jinja_exprContext> jinja_expr() {
			return getRuleContexts(Jinja_exprContext.class);
		}
		public Jinja_exprContext jinja_expr(int i) {
			return getRuleContext(Jinja_exprContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(TemplateParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TemplateParser.RBRACK, 0); }
		public JinjaSubscriptContext(Jinja_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaAttributeAccessContext extends Jinja_exprContext {
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TemplateParser.DOT, 0); }
		public TerminalNode JINJA_NAME() { return getToken(TemplateParser.JINJA_NAME, 0); }
		public JinjaAttributeAccessContext(Jinja_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaAttributeAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaAttributeAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaAttributeAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNumberContext extends Jinja_exprContext {
		public TerminalNode JINJA_NUMBER() { return getToken(TemplateParser.JINJA_NUMBER, 0); }
		public JinjaNumberContext(Jinja_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNameContext extends Jinja_exprContext {
		public TerminalNode JINJA_NAME() { return getToken(TemplateParser.JINJA_NAME, 0); }
		public JinjaNameContext(Jinja_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_exprContext jinja_expr() throws RecognitionException {
		return jinja_expr(0);
	}

	private Jinja_exprContext jinja_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Jinja_exprContext _localctx = new Jinja_exprContext(_ctx, _parentState);
		Jinja_exprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_jinja_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new JinjaFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160);
				match(JINJA_NAME);
				setState(161);
				match(LPAREN);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 940572672L) != 0)) {
					{
					setState(162);
					jinja_args();
					}
				}

				setState(165);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new JinjaNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(JINJA_NAME);
				}
				break;
			case 3:
				{
				_localctx = new JinjaStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(JINJA_STRING);
				}
				break;
			case 4:
				{
				_localctx = new JinjaNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(JINJA_NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new JinjaParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(LPAREN);
				setState(170);
				jinja_expr(0);
				setState(171);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new JinjaAttributeAccessContext(new Jinja_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinja_expr);
						setState(175);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(176);
						match(DOT);
						setState(177);
						match(JINJA_NAME);
						}
						break;
					case 2:
						{
						_localctx = new JinjaSubscriptContext(new Jinja_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinja_expr);
						setState(178);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(179);
						match(LBRACK);
						setState(180);
						jinja_expr(0);
						setState(181);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class Jinja_argsContext extends ParserRuleContext {
		public List<Jinja_argContext> jinja_arg() {
			return getRuleContexts(Jinja_argContext.class);
		}
		public Jinja_argContext jinja_arg(int i) {
			return getRuleContext(Jinja_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TemplateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateParser.COMMA, i);
		}
		public Jinja_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinja_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinja_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinja_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_argsContext jinja_args() throws RecognitionException {
		Jinja_argsContext _localctx = new Jinja_argsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinja_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			jinja_arg();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(189);
				match(COMMA);
				setState(190);
				jinja_arg();
				}
				}
				setState(195);
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
	public static class Jinja_argContext extends ParserRuleContext {
		public Jinja_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_arg; }
	 
		public Jinja_argContext() { }
		public void copyFrom(Jinja_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaPositionalArgContext extends Jinja_argContext {
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public JinjaPositionalArgContext(Jinja_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaPositionalArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaPositionalArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaPositionalArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaKeywordArgContext extends Jinja_argContext {
		public TerminalNode JINJA_NAME() { return getToken(TemplateParser.JINJA_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(TemplateParser.EQUAL, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public JinjaKeywordArgContext(Jinja_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaKeywordArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaKeywordArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaKeywordArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_argContext jinja_arg() throws RecognitionException {
		Jinja_argContext _localctx = new Jinja_argContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinja_arg);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new JinjaKeywordArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(JINJA_NAME);
				setState(197);
				match(EQUAL);
				setState(198);
				jinja_expr(0);
				}
				break;
			case 2:
				_localctx = new JinjaPositionalArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				jinja_expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return jinja_expr_sempred((Jinja_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean jinja_expr_sempred(Jinja_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00023\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002;\b\u0002\n\u0002\f\u0002>\t\u0002\u0001\u0002"+
		"\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"L\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005V\b\u0005\u0001\u0005"+
		"\u0003\u0005Y\b\u0005\u0005\u0005[\b\u0005\n\u0005\f\u0005^\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006i\b\u0006\n\u0006\f\u0006l\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007w\b\u0007\n\u0007"+
		"\f\u0007z\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0081\b\u0007\n\u0007\f\u0007\u0084\t\u0007\u0005\u0007"+
		"\u0086\b\u0007\n\u0007\f\u0007\u0089\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u008f\b\u0007\n\u0007\f\u0007\u0092\t\u0007"+
		"\u0003\u0007\u0094\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00a4\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00ae\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b8\b\t\n\t\f\t\u00bb\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00c0\b\n\n\n\f\n\u00c3\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c9\b\u000b\u0001\u000b\u0000"+
		"\u0001\u0012\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0000\u00dd\u0000\u001b\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000"+
		"\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000"+
		"\bM\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000\fa\u0001\u0000"+
		"\u0000\u0000\u000eq\u0001\u0000\u0000\u0000\u0010\u0099\u0001\u0000\u0000"+
		"\u0000\u0012\u00ad\u0001\u0000\u0000\u0000\u0014\u00bc\u0001\u0000\u0000"+
		"\u0000\u0016\u00c8\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001"+
		"\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000"+
		"\u0000 (\u0003\u0004\u0002\u0000!(\u0003\b\u0004\u0000\"(\u0003\n\u0005"+
		"\u0000#(\u0003\f\u0006\u0000$(\u0003\u000e\u0007\u0000%(\u0003\u0010\b"+
		"\u0000&(\u0005\u0007\u0000\u0000\' \u0001\u0000\u0000\u0000\'!\u0001\u0000"+
		"\u0000\u0000\'\"\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000\'"+
		"$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000(\u0003\u0001\u0000\u0000\u0000)-\u0005\u0004\u0000\u0000*,\u0003"+
		"\u0006\u0003\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000004\u0005\u001f\u0000\u000013\u0003\u0002"+
		"\u0001\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u00007A\u0005\u0005\u0000\u00008<\u0005\u0004\u0000"+
		"\u00009;\u0003\u0006\u0003\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?A\u0005 \u0000\u0000@)\u0001"+
		"\u0000\u0000\u0000@8\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000"+
		"\u0000BC\u0005\"\u0000\u0000CD\u0005!\u0000\u0000DL\u0005#\u0000\u0000"+
		"EF\u0005\"\u0000\u0000FG\u0005!\u0000\u0000GH\u0005$\u0000\u0000HI\u0003"+
		"\u0012\t\u0000IJ\u0005\u000b\u0000\u0000JL\u0001\u0000\u0000\u0000KB\u0001"+
		"\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000L\u0007\u0001\u0000\u0000"+
		"\u0000MN\u0005\b\u0000\u0000N\t\u0001\u0000\u0000\u0000OP\u0005\u0002"+
		"\u0000\u0000P\\\u0003\u0012\t\u0000QR\u0005\u001a\u0000\u0000RX\u0005"+
		"\u001d\u0000\u0000SU\u0005\u0014\u0000\u0000TV\u0003\u0014\n\u0000UT\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WY\u0005\u0015\u0000\u0000XS\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y[\u0001\u0000\u0000\u0000ZQ\u0001\u0000\u0000\u0000[^\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\u000b\u0000\u0000"+
		"`\u000b\u0001\u0000\u0000\u0000ab\u0005\u0001\u0000\u0000bc\u0005\f\u0000"+
		"\u0000cd\u0005\u001d\u0000\u0000de\u0005\r\u0000\u0000ef\u0003\u0012\t"+
		"\u0000fj\u0005\n\u0000\u0000gi\u0003\u0002\u0001\u0000hg\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005"+
		"\u0001\u0000\u0000no\u0005\u0012\u0000\u0000op\u0005\n\u0000\u0000p\r"+
		"\u0001\u0000\u0000\u0000qr\u0005\u0001\u0000\u0000rs\u0005\u000e\u0000"+
		"\u0000st\u0003\u0012\t\u0000tx\u0005\n\u0000\u0000uw\u0003\u0002\u0001"+
		"\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0087\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{|\u0005\u0001\u0000\u0000|}\u0005\u000f\u0000"+
		"\u0000}~\u0003\u0012\t\u0000~\u0082\u0005\n\u0000\u0000\u007f\u0081\u0003"+
		"\u0002\u0001\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085{\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0093\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\u0001\u0000\u0000\u008b\u008c\u0005\u0010"+
		"\u0000\u0000\u008c\u0090\u0005\n\u0000\u0000\u008d\u008f\u0003\u0002\u0001"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0001\u0000"+
		"\u0000\u0096\u0097\u0005\u0011\u0000\u0000\u0097\u0098\u0005\n\u0000\u0000"+
		"\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u009b\u0005\u0003\u0000\u0000"+
		"\u009a\u009c\u0005\'\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005&\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0006\t\uffff\uffff\u0000\u00a0\u00a1\u0005\u001d\u0000\u0000\u00a1\u00a3"+
		"\u0005\u0014\u0000\u0000\u00a2\u00a4\u0003\u0014\n\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00ae\u0005\u0015\u0000\u0000\u00a6\u00ae\u0005"+
		"\u001d\u0000\u0000\u00a7\u00ae\u0005\u001b\u0000\u0000\u00a8\u00ae\u0005"+
		"\u001c\u0000\u0000\u00a9\u00aa\u0005\u0014\u0000\u0000\u00aa\u00ab\u0003"+
		"\u0012\t\u0000\u00ab\u00ac\u0005\u0015\u0000\u0000\u00ac\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ad\u009f\u0001\u0000\u0000\u0000\u00ad\u00a6\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ae\u00b9\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\n\u0007\u0000\u0000\u00b0\u00b1\u0005\u0013\u0000"+
		"\u0000\u00b1\u00b8\u0005\u001d\u0000\u0000\u00b2\u00b3\n\u0006\u0000\u0000"+
		"\u00b3\u00b4\u0005\u0016\u0000\u0000\u00b4\u00b5\u0003\u0012\t\u0000\u00b5"+
		"\u00b6\u0005\u0017\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7"+
		"\u00af\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u0013\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00c1\u0003\u0016\u000b\u0000\u00bd"+
		"\u00be\u0005\u0018\u0000\u0000\u00be\u00c0\u0003\u0016\u000b\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u0015\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005\u001d\u0000\u0000\u00c5\u00c6\u0005\u0019\u0000\u0000\u00c6"+
		"\u00c9\u0003\u0012\t\u0000\u00c7\u00c9\u0003\u0012\t\u0000\u00c8\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u001b\'-4<@KUX\\jx\u0082\u0087\u0090\u0093"+
		"\u009b\u00a3\u00ad\u00b7\u00b9\u00c1\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}