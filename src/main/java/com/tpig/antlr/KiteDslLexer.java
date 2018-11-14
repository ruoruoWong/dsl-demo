// Generated from /Users/jackwong/Documents/Program/ruoruo/dsl-demo/src/main/java/com/tpig/antlr/KiteDsl.g4 by ANTLR 4.7
package com.tpig.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KiteDslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Identifier=4, Digits=5, COLON=6, LPAREN=7, RPAREN=8, 
		LBRACK=9, RBRACK=10, DOT=11, NEWLINE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "Identifier", "Digits", "JavaLetter", "JavaLetterOrDigit", 
		"Digit", "NonZeroDigit", "COLON", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"DOT", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'default'", "'format'", null, null, "':'", "'('", "')'", 
		"'['", "']'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Identifier", "Digits", "COLON", "LPAREN", "RPAREN", 
		"LBRACK", "RBRACK", "DOT", "NEWLINE"
	};
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


	public KiteDslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KiteDsl.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 6:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5"+
		"\67\n\5\f\5\16\5:\13\5\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\5\tU\n\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5"+
		"\21f\n\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\2\23\2\25"+
		"\b\27\t\31\n\33\13\35\f\37\r!\16\3\2\b\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\3\2\63;\2l\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7-\3\2\2\2\t\64\3\2\2\2\13;\3\2\2\2\rH\3"+
		"\2\2\2\17P\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31"+
		"\\\3\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37b\3\2\2\2!e\3\2\2\2#$\7.\2\2$\4\3"+
		"\2\2\2%&\7f\2\2&\'\7g\2\2\'(\7h\2\2()\7c\2\2)*\7w\2\2*+\7n\2\2+,\7v\2"+
		"\2,\6\3\2\2\2-.\7h\2\2./\7q\2\2/\60\7t\2\2\60\61\7o\2\2\61\62\7c\2\2\62"+
		"\63\7v\2\2\63\b\3\2\2\2\648\5\r\7\2\65\67\5\17\b\2\66\65\3\2\2\2\67:\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29\n\3\2\2\2:8\3\2\2\2;?\5\21\t\2<>\5\21\t"+
		"\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\f\3\2\2\2A?\3\2\2\2BI\t\2"+
		"\2\2CD\n\3\2\2DI\6\7\2\2EF\t\4\2\2FG\t\5\2\2GI\6\7\3\2HB\3\2\2\2HC\3\2"+
		"\2\2HE\3\2\2\2I\16\3\2\2\2JQ\t\6\2\2KL\n\3\2\2LQ\6\b\4\2MN\t\4\2\2NO\t"+
		"\5\2\2OQ\6\b\5\2PJ\3\2\2\2PK\3\2\2\2PM\3\2\2\2Q\20\3\2\2\2RU\7\62\2\2"+
		"SU\5\23\n\2TR\3\2\2\2TS\3\2\2\2U\22\3\2\2\2VW\t\7\2\2W\24\3\2\2\2XY\7"+
		"<\2\2Y\26\3\2\2\2Z[\7*\2\2[\30\3\2\2\2\\]\7+\2\2]\32\3\2\2\2^_\7]\2\2"+
		"_\34\3\2\2\2`a\7_\2\2a\36\3\2\2\2bc\7\60\2\2c \3\2\2\2df\7\17\2\2ed\3"+
		"\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\f\2\2h\"\3\2\2\2\t\28?HPTe\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}