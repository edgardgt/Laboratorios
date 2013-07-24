// Generated from Lab02.g by ANTLR 4.1

  package laboratorios.lab02;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lab02Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, DIGITO=3, WS=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "'-'", "DIGITO", "WS"
	};
	public static final int
		RULE_numero = 0, RULE_posint = 1;
	public static final String[] ruleNames = {
		"numero", "posint"
	};

	@Override
	public String getGrammarFileName() { return "Lab02.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Lab02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NumeroContext extends ParserRuleContext {
		public List<PosintContext> posint() {
			return getRuleContexts(PosintContext.class);
		}
		public PosintContext posint(int i) {
			return getRuleContext(PosintContext.class,i);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lab02Listener ) ((Lab02Listener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lab02Listener ) ((Lab02Listener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(4); match(2);
				}
			}

			setState(12);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(7); posint();
				}
				break;

			case 2:
				{
				setState(8); posint();
				setState(9); match(1);
				setState(10); posint();
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

	public static class PosintContext extends ParserRuleContext {
		public PosintContext posint() {
			return getRuleContext(PosintContext.class,0);
		}
		public TerminalNode DIGITO() { return getToken(Lab02Parser.DIGITO, 0); }
		public PosintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lab02Listener ) ((Lab02Listener)listener).enterPosint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lab02Listener ) ((Lab02Listener)listener).exitPosint(this);
		}
	}

	public final PosintContext posint() throws RecognitionException {
		PosintContext _localctx = new PosintContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_posint);
		try {
			setState(17);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14); match(DIGITO);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15); match(DIGITO);
				setState(16); posint();
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\6\26\4\2\t\2\4\3"+
		"\t\3\3\2\5\2\b\n\2\3\2\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\5\3\24\n"+
		"\3\3\3\2\4\2\4\2\2\26\2\7\3\2\2\2\4\23\3\2\2\2\6\b\7\4\2\2\7\6\3\2\2\2"+
		"\7\b\3\2\2\2\b\16\3\2\2\2\t\17\5\4\3\2\n\13\5\4\3\2\13\f\7\3\2\2\f\r\5"+
		"\4\3\2\r\17\3\2\2\2\16\t\3\2\2\2\16\n\3\2\2\2\17\3\3\2\2\2\20\24\7\5\2"+
		"\2\21\22\7\5\2\2\22\24\5\4\3\2\23\20\3\2\2\2\23\21\3\2\2\2\24\5\3\2\2"+
		"\2\5\7\16\23";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}