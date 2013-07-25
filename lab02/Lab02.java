// Generated from Lab02.g by ANTLR 4.1

	package laboratorios.lab02;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lab02 extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIVI=4, IGNORAR=5, LETRA=6, ENTERO=7, REAL=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "'-'", "'*'", "'/'", "IGNORAR", "LETRA", "ENTERO", "REAL"
	};
	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULT", "DIVI", "IGNORAR", "LETRA", "ENTERO", "REAL"
	};


	public Lab02(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lab02.g"; }

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
		case 0: PLUS_action((RuleContext)_localctx, actionIndex); break;

		case 1: MINUS_action((RuleContext)_localctx, actionIndex); break;

		case 2: MULT_action((RuleContext)_localctx, actionIndex); break;

		case 3: DIVI_action((RuleContext)_localctx, actionIndex); break;

		case 4: IGNORAR_action((RuleContext)_localctx, actionIndex); break;

		case 5: LETRA_action((RuleContext)_localctx, actionIndex); break;

		case 6: ENTERO_action((RuleContext)_localctx, actionIndex); break;

		case 7: REAL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void REAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.println("real"); break;
		}
	}
	private void ENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("entero"); break;
		}
	}
	private void PLUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("plus"); break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("mult"); break;
		}
	}
	private void MINUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("minus"); break;
		}
	}
	private void LETRA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("Error, letras ingresadas"); break;
		}
	}
	private void DIVI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("divi"); break;
		}
	}
	private void IGNORAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\nI\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\6\6!\n\6\r\6\16\6\"\3\6\3\6\3\7\6"+
		"\7(\n\7\r\7\16\7)\3\7\3\7\3\b\5\b/\n\b\3\b\6\b\62\n\b\r\b\16\b\63\3\b"+
		"\3\b\3\t\5\t9\n\t\3\t\6\t<\n\t\r\t\16\t=\3\t\3\t\6\tB\n\t\r\t\16\tC\5"+
		"\tF\n\t\3\t\3\t\2\n\3\3\2\5\4\3\7\5\4\t\6\5\13\7\6\r\b\7\17\t\b\21\n\t"+
		"\3\2\4\5\2\13\f\17\17\"\"\4\2C\\c|P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23"+
		"\3\2\2\2\5\26\3\2\2\2\7\31\3\2\2\2\t\34\3\2\2\2\13 \3\2\2\2\r\'\3\2\2"+
		"\2\17.\3\2\2\2\218\3\2\2\2\23\24\7-\2\2\24\25\b\2\2\2\25\4\3\2\2\2\26"+
		"\27\7/\2\2\27\30\b\3\3\2\30\6\3\2\2\2\31\32\7,\2\2\32\33\b\4\4\2\33\b"+
		"\3\2\2\2\34\35\7\61\2\2\35\36\b\5\5\2\36\n\3\2\2\2\37!\t\2\2\2 \37\3\2"+
		"\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\b\6\6\2%\f\3\2\2\2&"+
		"(\t\3\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b\7\7"+
		"\2,\16\3\2\2\2-/\7/\2\2.-\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60\62\4\62;\2"+
		"\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\b\b\b\2\66\20\3\2\2\2\679\7/\2\28\67\3\2\2\289\3\2\2\29;\3\2\2"+
		"\2:<\4\62;\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>E\3\2\2\2?A\7\60"+
		"\2\2@B\4\62;\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E?\3\2"+
		"\2\2EF\3\2\2\2FG\3\2\2\2GH\b\t\t\2H\22\3\2\2\2\13\2\").\638=CE";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}