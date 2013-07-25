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
		RESERV=1, DIGITO=2, ENTPOS=3, ENTERO=4, FLOTAN=5, IGNORAR=6, NUMHEX=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"RESERV", "DIGITO", "ENTPOS", "ENTERO", "FLOTAN", "IGNORAR", "NUMHEX"
	};
	public static final String[] ruleNames = {
		"RESERV", "DIGITO", "ENTPOS", "ENTERO", "FLOTAN", "IGNORAR", "NUMHEX"
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

		case 1: DIGITO_action((RuleContext)_localctx, actionIndex); break;

		case 2: ENTPOS_action((RuleContext)_localctx, actionIndex); break;

		case 3: ENTERO_action((RuleContext)_localctx, actionIndex); break;

		case 4: FLOTAN_action((RuleContext)_localctx, actionIndex); break;

		case 5: IGNORAR_action((RuleContext)_localctx, actionIndex); break;

		case 6: NUMHEX_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void RESERV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("RESERVADA"); break;
		}
	}
	private void ENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("ENTERO"); break;
		}
	}
	private void FLOTAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("FLOTANTE"); break;
		}
	}
	private void DIGITO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("DIGITO"); break;
		}
	}
	private void NUMHEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("NUMERO HEXADECIMAL"); break;
		}
	}
	private void ENTPOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("ENTPOS"); break;
		}
	}
	private void IGNORAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\tH\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2\34\n\2\3\2\3\2\3\3\3\3\3\3\3\4\6\4$\n\4\r\4\16\4"+
		"%\3\4\3\4\3\5\5\5+\n\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\63\n\6\3\6\3\6\3\7"+
		"\6\78\n\7\r\7\16\79\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\bC\n\b\r\b\16\bD\3\b"+
		"\3\b\2\t\3\3\2\5\4\3\7\5\4\t\6\5\13\7\6\r\b\7\17\t\b\3\2\3\5\2\13\f\17"+
		"\17\"\"N\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\3\33\3\2\2\2\5\37\3\2\2\2\7#\3\2\2\2\t*\3\2"+
		"\2\2\13/\3\2\2\2\r\67\3\2\2\2\17=\3\2\2\2\21\22\7k\2\2\22\23\7p\2\2\23"+
		"\34\7v\2\2\24\25\7d\2\2\25\26\7q\2\2\26\27\7q\2\2\27\30\7n\2\2\30\31\7"+
		"g\2\2\31\32\7c\2\2\32\34\7p\2\2\33\21\3\2\2\2\33\24\3\2\2\2\34\35\3\2"+
		"\2\2\35\36\b\2\2\2\36\4\3\2\2\2\37 \4\62;\2 !\b\3\3\2!\6\3\2\2\2\"$\5"+
		"\5\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\b\4\4\2"+
		"(\b\3\2\2\2)+\7/\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\5\7\4\2-.\b\5\5\2"+
		".\n\3\2\2\2/\62\5\t\5\2\60\61\7\60\2\2\61\63\5\7\4\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\64\3\2\2\2\64\65\b\6\6\2\65\f\3\2\2\2\668\t\2\2\2\67\66"+
		"\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\7\7\2<\16\3\2\2"+
		"\2=>\7\62\2\2>?\7z\2\2?B\3\2\2\2@C\4CD\2AC\5\7\4\2B@\3\2\2\2BA\3\2\2\2"+
		"CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\b\b\b\2G\20\3\2\2\2\n\2\33"+
		"%*\629BD";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}