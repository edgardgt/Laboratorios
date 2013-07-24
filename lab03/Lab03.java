// Generated from Lab03.g by ANTLR 4.1

	package laboratorios.lab03;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lab03 extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RESERV=1, ENTERO=2, FLOTAN=3, IGNORAR=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"RESERV", "ENTERO", "FLOTAN", "IGNORAR"
	};
	public static final String[] ruleNames = {
		"RESERV", "ENTERO", "FLOTAN", "IGNORAR"
	};


	public Lab03(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lab03.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: RESERV_action((RuleContext)_localctx, actionIndex); break;

		case 1: ENTERO_action((RuleContext)_localctx, actionIndex); break;

		case 2: FLOTAN_action((RuleContext)_localctx, actionIndex); break;

		case 3: IGNORAR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void RESERV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("RESERVADA"); break;
		}
	}
	private void ENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("ENTERO"); break;
		}
	}
	private void FLOTAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("ENTERO"); break;
		}
	}
	private void IGNORAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\6\61\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\26"+
		"\n\2\3\2\3\2\3\3\5\3\33\n\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3\4\3\4"+
		"\3\4\5\4\'\n\4\3\4\3\4\3\5\6\5,\n\5\r\5\16\5-\3\5\3\5\2\6\3\3\2\5\4\3"+
		"\7\5\4\t\6\5\3\2\3\5\2\13\f\17\17\"\"\65\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\3\25\3\2\2\2\5\32\3\2\2\2\7#\3\2\2\2\t+\3\2\2\2\13"+
		"\f\7k\2\2\f\r\7p\2\2\r\26\7v\2\2\16\17\7d\2\2\17\20\7q\2\2\20\21\7q\2"+
		"\2\21\22\7n\2\2\22\23\7g\2\2\23\24\7c\2\2\24\26\7p\2\2\25\13\3\2\2\2\25"+
		"\16\3\2\2\2\26\27\3\2\2\2\27\30\b\2\2\2\30\4\3\2\2\2\31\33\7/\2\2\32\31"+
		"\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\36\4\62;\2\35\34\3\2\2\2\36\37"+
		"\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\b\3\3\2\"\6\3\2\2\2#&"+
		"\5\5\3\2$%\7\60\2\2%\'\4\62;\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b\4\4"+
		"\2)\b\3\2\2\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2"+
		"\2\2/\60\b\5\5\2\60\n\3\2\2\2\b\2\25\32\37&-";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}