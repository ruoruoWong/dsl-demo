// Generated from /Users/jackwong/Documents/Program/ruoruo/dsl-demo/src/main/java/com/tpig/antlr/KiteDsl2.g4 by ANTLR 4.7
package com.tpig.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KiteDsl2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Identifier=3, Digits=4, SPACE=5, ARROW=6, COLON=7, LBRACE=8, 
		RBRACE=9, LPAREN=10, RPAREN=11, LBRACK=12, RBRACK=13, DOT=14, SEMI=15, 
		NEWLINE=16;
	public static final int
		RULE_expr = 0, RULE_objectBodyExpr = 1, RULE_singleFieldExpr = 2, RULE_objectFieldExpr = 3, 
		RULE_normalFieldExpr = 4, RULE_className = 5, RULE_fieldName = 6, RULE_packageName = 7, 
		RULE_path = 8, RULE_pathPiece = 9;
	public static final String[] ruleNames = {
		"expr", "objectBodyExpr", "singleFieldExpr", "objectFieldExpr", "normalFieldExpr", 
		"className", "fieldName", "packageName", "path", "pathPiece"
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

	@Override
	public String getGrammarFileName() { return "KiteDsl2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KiteDsl2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(KiteDsl2Parser.ARROW, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ObjectBodyExprContext objectBodyExpr() {
			return getRuleContext(ObjectBodyExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(KiteDsl2Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(KiteDsl2Parser.SPACE, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(21);
				match(SPACE);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			packageName(0);
			setState(28);
			match(DOT);
			setState(29);
			className();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(30);
				match(SPACE);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(ARROW);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(37);
				match(SPACE);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			path();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(44);
				match(SPACE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			objectBodyExpr();
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

	public static class ObjectBodyExprContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KiteDsl2Parser.LBRACE, 0); }
		public TerminalNode NEWLINE() { return getToken(KiteDsl2Parser.NEWLINE, 0); }
		public List<SingleFieldExprContext> singleFieldExpr() {
			return getRuleContexts(SingleFieldExprContext.class);
		}
		public SingleFieldExprContext singleFieldExpr(int i) {
			return getRuleContext(SingleFieldExprContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(KiteDsl2Parser.RBRACE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(KiteDsl2Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(KiteDsl2Parser.SPACE, i);
		}
		public ObjectBodyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBodyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterObjectBodyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitObjectBodyExpr(this);
		}
	}

	public final ObjectBodyExprContext objectBodyExpr() throws RecognitionException {
		ObjectBodyExprContext _localctx = new ObjectBodyExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_objectBodyExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LBRACE);
			setState(53);
			match(NEWLINE);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					match(SPACE);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(60);
			singleFieldExpr();
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					singleFieldExpr();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(67);
				match(SPACE);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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

	public static class SingleFieldExprContext extends ParserRuleContext {
		public NormalFieldExprContext normalFieldExpr() {
			return getRuleContext(NormalFieldExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KiteDsl2Parser.SEMI, 0); }
		public TerminalNode NEWLINE() { return getToken(KiteDsl2Parser.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(KiteDsl2Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(KiteDsl2Parser.SPACE, i);
		}
		public ObjectFieldExprContext objectFieldExpr() {
			return getRuleContext(ObjectFieldExprContext.class,0);
		}
		public SingleFieldExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFieldExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterSingleFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitSingleFieldExpr(this);
		}
	}

	public final SingleFieldExprContext singleFieldExpr() throws RecognitionException {
		SingleFieldExprContext _localctx = new SingleFieldExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleFieldExpr);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(75);
					match(SPACE);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				normalFieldExpr();
				setState(82);
				match(SEMI);
				setState(83);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(85);
					match(SPACE);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				objectFieldExpr();
				setState(92);
				match(SEMI);
				setState(93);
				match(NEWLINE);
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

	public static class ObjectFieldExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KiteDsl2Parser.LPAREN, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(KiteDsl2Parser.ARROW, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KiteDsl2Parser.RPAREN, 0); }
		public ObjectBodyExprContext objectBodyExpr() {
			return getRuleContext(ObjectBodyExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(KiteDsl2Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(KiteDsl2Parser.SPACE, i);
		}
		public ObjectFieldExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFieldExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterObjectFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitObjectFieldExpr(this);
		}
	}

	public final ObjectFieldExprContext objectFieldExpr() throws RecognitionException {
		ObjectFieldExprContext _localctx = new ObjectFieldExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_objectFieldExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LPAREN);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(98);
				match(SPACE);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			fieldName();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(105);
				match(SPACE);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(ARROW);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(112);
				match(SPACE);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			path();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(119);
				match(SPACE);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(RPAREN);
			setState(126);
			objectBodyExpr();
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

	public static class NormalFieldExprContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(KiteDsl2Parser.ARROW, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(KiteDsl2Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(KiteDsl2Parser.SPACE, i);
		}
		public TerminalNode LPAREN() { return getToken(KiteDsl2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KiteDsl2Parser.RPAREN, 0); }
		public NormalFieldExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFieldExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterNormalFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitNormalFieldExpr(this);
		}
	}

	public final NormalFieldExprContext normalFieldExpr() throws RecognitionException {
		NormalFieldExprContext _localctx = new NormalFieldExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_normalFieldExpr);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				fieldName();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(129);
					match(SPACE);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(ARROW);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(136);
					match(SPACE);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				path();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(LPAREN);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(145);
					match(SPACE);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				fieldName();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(152);
					match(SPACE);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(ARROW);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(159);
					match(SPACE);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				path();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(166);
					match(SPACE);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(RPAREN);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KiteDsl2Parser.Identifier, 0); }
		public TerminalNode LBRACK() { return getToken(KiteDsl2Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(KiteDsl2Parser.RBRACK, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_className);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(Identifier);
				setState(178);
				match(LBRACK);
				setState(179);
				match(RBRACK);
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KiteDsl2Parser.Identifier, 0); }
		public TerminalNode LBRACK() { return getToken(KiteDsl2Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(KiteDsl2Parser.RBRACK, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitFieldName(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldName);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(Identifier);
				setState(184);
				match(LBRACK);
				setState(185);
				match(RBRACK);
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KiteDsl2Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(189);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(191);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(192);
					match(DOT);
					setState(193);
					match(Identifier);
					}
					} 
				}
				setState(198);
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

	public static class PathContext extends ParserRuleContext {
		public List<PathPieceContext> pathPiece() {
			return getRuleContexts(PathPieceContext.class);
		}
		public PathPieceContext pathPiece(int i) {
			return getRuleContext(PathPieceContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			pathPiece();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==Identifier) {
				{
				{
				setState(200);
				pathPiece();
				}
				}
				setState(205);
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

	public static class PathPieceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KiteDsl2Parser.Identifier, 0); }
		public PathPieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPiece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).enterPathPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KiteDsl2Listener ) ((KiteDsl2Listener)listener).exitPathPiece(this);
		}
	}

	public final PathPieceContext pathPiece() throws RecognitionException {
		PathPieceContext _localctx = new PathPieceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pathPiece);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__1);
				setState(207);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(Identifier);
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
		case 7:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u00d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f"+
		"\2\16\2%\13\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\7\3A\n"+
		"\3\f\3\16\3D\13\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\3\4\7\4O\n\4\f\4"+
		"\16\4R\13\4\3\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\3\4\3"+
		"\4\5\4b\n\4\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\5\3\5\7\5m\n\5\f\5\16\5"+
		"p\13\5\3\5\3\5\7\5t\n\5\f\5\16\5w\13\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5"+
		"\3\5\3\5\3\5\3\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088\13\6\3\6\3\6\7\6\u008c"+
		"\n\6\f\6\16\6\u008f\13\6\3\6\3\6\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098"+
		"\13\6\3\6\3\6\7\6\u009c\n\6\f\6\16\6\u009f\13\6\3\6\3\6\7\6\u00a3\n\6"+
		"\f\6\16\6\u00a6\13\6\3\6\3\6\7\6\u00aa\n\6\f\6\16\6\u00ad\13\6\3\6\3\6"+
		"\5\6\u00b1\n\6\3\7\3\7\3\7\3\7\5\7\u00b7\n\7\3\b\3\b\3\b\3\b\5\b\u00bd"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c5\n\t\f\t\16\t\u00c8\13\t\3\n\3\n"+
		"\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\13\3\13\3\13\5\13\u00d4\n\13\3\13"+
		"\2\3\20\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u00e5\2\26\3\2\2\2\4\66\3\2\2"+
		"\2\6a\3\2\2\2\bc\3\2\2\2\n\u00b0\3\2\2\2\f\u00b6\3\2\2\2\16\u00bc\3\2"+
		"\2\2\20\u00be\3\2\2\2\22\u00c9\3\2\2\2\24\u00d3\3\2\2\2\26\32\7\3\2\2"+
		"\27\31\7\7\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\35\3\2\2\2\34\32\3\2\2\2\35\36\5\20\t\2\36\37\7\20\2\2\37#\5\f\7\2"+
		" \"\7\7\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2"+
		"\2&*\7\b\2\2\')\7\7\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2"+
		"\2\2,*\3\2\2\2-\61\5\22\n\2.\60\7\7\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3"+
		"\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\5\4\3\2\65\3\3"+
		"\2\2\2\66\67\7\n\2\2\67;\7\22\2\28:\7\7\2\298\3\2\2\2:=\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>B\5\6\4\2?A\5\6\4\2@?\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\7\7\2\2FE\3\2\2\2GJ\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\13\2\2L\5\3\2\2\2MO\7"+
		"\7\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5"+
		"\n\6\2TU\7\21\2\2UV\7\22\2\2Vb\3\2\2\2WY\7\7\2\2XW\3\2\2\2Y\\\3\2\2\2"+
		"ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\5\b\5\2^_\7\21\2\2_`\7\22"+
		"\2\2`b\3\2\2\2aP\3\2\2\2aZ\3\2\2\2b\7\3\2\2\2cg\7\f\2\2df\7\7\2\2ed\3"+
		"\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jn\5\16\b\2km"+
		"\7\7\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2q"+
		"u\7\b\2\2rt\7\7\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2"+
		"wu\3\2\2\2x|\5\22\n\2y{\7\7\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\5\4\3\2\u0081"+
		"\t\3\2\2\2\u0082\u0086\5\16\b\2\u0083\u0085\7\7\2\2\u0084\u0083\3\2\2"+
		"\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008d\7\b\2\2\u008a\u008c\7\7\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\5\22\n\2\u0091"+
		"\u00b1\3\2\2\2\u0092\u0096\7\f\2\2\u0093\u0095\7\7\2\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009d\5\16\b\2\u009a\u009c\7"+
		"\7\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a4\7\b"+
		"\2\2\u00a1\u00a3\7\7\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00ab\5\22\n\2\u00a8\u00aa\7\7\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\r\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u0082\3\2\2\2\u00b0\u0092\3\2\2\2\u00b1\13\3\2\2\2\u00b2\u00b7\7\5\2"+
		"\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00b7\7\17\2\2\u00b6"+
		"\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\r\3\2\2\2\u00b8\u00bd\7\5\2\2"+
		"\u00b9\u00ba\7\5\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bd\7\17\2\2\u00bc\u00b8"+
		"\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\17\3\2\2\2\u00be\u00bf\b\t\1\2\u00bf"+
		"\u00c0\7\5\2\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\f\3\2\2\u00c2\u00c3\7\20"+
		"\2\2\u00c3\u00c5\7\5\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\21\3\2\2\2\u00c8\u00c6\3\2\2"+
		"\2\u00c9\u00cd\5\24\13\2\u00ca\u00cc\5\24\13\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\23\3\2\2"+
		"\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00d4\7\5\2\2\u00d2\u00d4"+
		"\7\5\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\25\3\2\2\2\34\32"+
		"#*\61;BHPZagnu|\u0086\u008d\u0096\u009d\u00a4\u00ab\u00b0\u00b6\u00bc"+
		"\u00c6\u00cd\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}