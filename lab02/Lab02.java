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
		DIGITO=1, ENTERO=2, FLOTANTE=3, SUMA=4, RESTA=5, PRODUCTO=6, DIVISION=7, 
		BLANCO=8, LETRA=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DIGITO", "ENTERO", "FLOTANTE", "'+'", "'-'", "'*'", "'/'", "BLANCO", 
		"LETRA"
	};
	public static final String[] ruleNames = {
		"DIGITO", "ENTERO", "FLOTANTE", "SUMA", "RESTA", "PRODUCTO", "DIVISION", 
		"BLANCO", "LETRA"
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
		case 0: DIGITO_action((RuleContext)_localctx, actionIndex); break;

		case 1: ENTERO_action((RuleContext)_localctx, actionIndex); break;

		case 2: FLOTANTE_action((RuleContext)_localctx, actionIndex); break;

		case 3: SUMA_action((RuleContext)_localctx, actionIndex); break;

		case 4: RESTA_action((RuleContext)_localctx, actionIndex); break;

		case 5: PRODUCTO_action((RuleContext)_localctx, actionIndex); break;

		case 6: DIVISION_action((RuleContext)_localctx, actionIndex); break;

		case 7: BLANCO_action((RuleContext)_localctx, actionIndex); break;

		case 8: LETRA_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void DIVISION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("division"); break;
		}
	}
	private void PRODUCTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("producto"); break;
		}
	}
	private void RESTA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("resta"); break;
		}
	}
	private void ENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("entero"); break;
		}
	}
	private void SUMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("suma"); break;
		}
	}
	private void FLOTANTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("flotante"); break;
		}
	}
	private void DIGITO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("entero"); break;
		}
	}
	private void LETRA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.println("Error, input contiene letras"); break;
		}
	}
	private void BLANCO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\13N\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\3\5\3\32\n\3\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3\3\4\5\4$\n\4\3"+
		"\4\6\4\'\n\4\r\4\16\4(\3\4\3\4\6\4-\n\4\r\4\16\4.\5\4\61\n\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\6\tB\n\t\r\t\16\tC"+
		"\3\t\3\t\3\n\6\nI\n\n\r\n\16\nJ\3\n\3\n\2\13\3\3\2\5\4\3\7\5\4\t\6\5\13"+
		"\7\6\r\b\7\17\t\b\21\n\t\23\13\n\3\2\4\5\2\13\f\17\17\"\"\4\2C\\c|U\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\31\3\2\2\2\7"+
		"#\3\2\2\2\t\64\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17=\3\2\2\2\21A\3\2\2"+
		"\2\23H\3\2\2\2\25\26\4\62;\2\26\27\b\2\2\2\27\4\3\2\2\2\30\32\7/\2\2\31"+
		"\30\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\35\4\62;\2\34\33\3\2\2\2\35"+
		"\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\b\3\3\2!\6\3\2\2"+
		"\2\"$\7/\2\2#\"\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\'\4\62;\2&%\3\2\2\2\'(\3"+
		"\2\2\2(&\3\2\2\2()\3\2\2\2)\60\3\2\2\2*,\7\60\2\2+-\4\62;\2,+\3\2\2\2"+
		"-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60*\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\3\2\2\2\62\63\b\4\4\2\63\b\3\2\2\2\64\65\7-\2\2\65\66\b\5\5\2\66\n"+
		"\3\2\2\2\678\7/\2\289\b\6\6\29\f\3\2\2\2:;\7,\2\2;<\b\7\7\2<\16\3\2\2"+
		"\2=>\7\61\2\2>?\b\b\b\2?\20\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3"+
		"\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\t\t\2F\22\3\2\2\2GI\t\3\2\2HG\3\2\2\2I"+
		"J\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\b\n\n\2M\24\3\2\2\2\13\2\31"+
		"\36#(.\60CJ";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}