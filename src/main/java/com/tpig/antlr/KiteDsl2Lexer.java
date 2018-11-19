// Generated from /Users/jackwong/Documents/Program/ruoruo/dsl-demo/src/main/java/com/tpig/antlr/KiteDsl2.g4 by ANTLR 4.7
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
public class KiteDsl2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Identifier=3, Digits=4, SPACE=5, ARROW=6, COLON=7, LBRACE=8, 
		RBRACE=9, LPAREN=10, RPAREN=11, LBRACK=12, RBRACK=13, DOT=14, SEMI=15, 
		NEWLINE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "Identifier", "Digits", "JavaLetter", "JavaLetterOrDigit", 
		"Digit", "NonZeroDigit", "SPACE", "ARROW", "COLON", "LBRACE", "RBRACE", 
		"LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMI", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'/'", null, null, "' '", "'->'", "':'", "'{'", "'}'", 
		"'('", "')'", "'['", "']'", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Identifier", "Digits", "SPACE", "ARROW", "COLON", "LBRACE", 
		"RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMI", "NEWLINE"
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


	public KiteDsl2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KiteDsl2.g4"; }

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
		case 4:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 5:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\7\4\66\n\4\f\4\16\49\13\4\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\5\bT\n"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25p\n\25\3\25"+
		"\3\25\2\2\26\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\b\27\t\31\n\33"+
		"\13\35\f\37\r!\16#\17%\20\'\21)\22\3\2\b\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\3\2\63;\2v\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\61\3"+
		"\2\2\2\7\63\3\2\2\2\t:\3\2\2\2\13G\3\2\2\2\rO\3\2\2\2\17S\3\2\2\2\21U"+
		"\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2"+
		"\35b\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#h\3\2\2\2%j\3\2\2\2\'l\3\2\2\2)o\3"+
		"\2\2\2+,\7e\2\2,-\7n\2\2-.\7c\2\2./\7u\2\2/\60\7u\2\2\60\4\3\2\2\2\61"+
		"\62\7\61\2\2\62\6\3\2\2\2\63\67\5\13\6\2\64\66\5\r\7\2\65\64\3\2\2\2\66"+
		"9\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\b\3\2\2\29\67\3\2\2\2:>\5\17\b\2"+
		";=\5\17\b\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\n\3\2\2\2@>\3\2\2"+
		"\2AH\t\2\2\2BC\n\3\2\2CH\6\6\2\2DE\t\4\2\2EF\t\5\2\2FH\6\6\3\2GA\3\2\2"+
		"\2GB\3\2\2\2GD\3\2\2\2H\f\3\2\2\2IP\t\6\2\2JK\n\3\2\2KP\6\7\4\2LM\t\4"+
		"\2\2MN\t\5\2\2NP\6\7\5\2OI\3\2\2\2OJ\3\2\2\2OL\3\2\2\2P\16\3\2\2\2QT\7"+
		"\62\2\2RT\5\21\t\2SQ\3\2\2\2SR\3\2\2\2T\20\3\2\2\2UV\t\7\2\2V\22\3\2\2"+
		"\2WX\7\"\2\2X\24\3\2\2\2YZ\7/\2\2Z[\7@\2\2[\26\3\2\2\2\\]\7<\2\2]\30\3"+
		"\2\2\2^_\7}\2\2_\32\3\2\2\2`a\7\177\2\2a\34\3\2\2\2bc\7*\2\2c\36\3\2\2"+
		"\2de\7+\2\2e \3\2\2\2fg\7]\2\2g\"\3\2\2\2hi\7_\2\2i$\3\2\2\2jk\7\60\2"+
		"\2k&\3\2\2\2lm\7=\2\2m(\3\2\2\2np\7\17\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2"+
		"\2qr\7\f\2\2r*\3\2\2\2\t\2\67>GOSo\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}