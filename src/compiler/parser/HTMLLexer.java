// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/HTMLLexer.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_START=1, TAG_END=2, TAG_SLASH_CLOSE=3, SLASH=4, EQUALS=5, TAG_NAME=6, 
		ATTR_VALUE=7, HTML_TEXT=8, HTML_WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAG_START", "TAG_END", "TAG_SLASH_CLOSE", "SLASH", "EQUALS", "TAG_NAME", 
			"ATTR_VALUE", "HTML_TEXT", "HTML_WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_START", "TAG_END", "TAG_SLASH_CLOSE", "SLASH", "EQUALS", "TAG_NAME", 
			"ATTR_VALUE", "HTML_TEXT", "HTML_WS"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\tG\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005!\b\u0005\n\u0005"+
		"\f\u0005$\t\u0005\u0001\u0006\u0001\u0006\u0005\u0006(\b\u0006\n\u0006"+
		"\f\u0006+\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u00060\b\u0006"+
		"\n\u0006\f\u00063\t\u0006\u0001\u0006\u0003\u00066\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007=\b\u0007"+
		"\u000b\u0007\f\u0007>\u0001\b\u0004\bB\b\b\u000b\b\f\bC\u0001\b\u0001"+
		"\b\u0000\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000\b\u0002\u0000AZaz\u0004"+
		"\u0000--0:AZaz\u0003\u0000\n\n\r\r\"\"\u0003\u0000\n\n\r\r\'\'\u0002\u0000"+
		"<<{{\u0003\u0000##%%{{\u0003\u0000//AZaz\u0003\u0000\t\n\r\r  N\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000\u0003\u0015"+
		"\u0001\u0000\u0000\u0000\u0005\u0017\u0001\u0000\u0000\u0000\u0007\u001a"+
		"\u0001\u0000\u0000\u0000\t\u001c\u0001\u0000\u0000\u0000\u000b\u001e\u0001"+
		"\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f<\u0001\u0000\u0000"+
		"\u0000\u0011A\u0001\u0000\u0000\u0000\u0013\u0014\u0005<\u0000\u0000\u0014"+
		"\u0002\u0001\u0000\u0000\u0000\u0015\u0016\u0005>\u0000\u0000\u0016\u0004"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005/\u0000\u0000\u0018\u0019\u0005"+
		">\u0000\u0000\u0019\u0006\u0001\u0000\u0000\u0000\u001a\u001b\u0005/\u0000"+
		"\u0000\u001b\b\u0001\u0000\u0000\u0000\u001c\u001d\u0005=\u0000\u0000"+
		"\u001d\n\u0001\u0000\u0000\u0000\u001e\"\u0007\u0000\u0000\u0000\u001f"+
		"!\u0007\u0001\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\f"+
		"\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%)\u0005\"\u0000\u0000"+
		"&(\b\u0002\u0000\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,6\u0005\"\u0000\u0000-1\u0005\'"+
		"\u0000\u0000.0\b\u0003\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000046\u0005\'\u0000\u00005%\u0001"+
		"\u0000\u0000\u00005-\u0001\u0000\u0000\u00006\u000e\u0001\u0000\u0000"+
		"\u00007=\b\u0004\u0000\u000089\u0005{\u0000\u00009=\b\u0005\u0000\u0000"+
		":;\u0005<\u0000\u0000;=\b\u0006\u0000\u0000<7\u0001\u0000\u0000\u0000"+
		"<8\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0010\u0001"+
		"\u0000\u0000\u0000@B\u0007\u0007\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EF\u0006\b\u0000\u0000F\u0012\u0001\u0000"+
		"\u0000\u0000\b\u0000\")15<>C\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}