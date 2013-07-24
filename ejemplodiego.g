lexer grammar Lab02;

@header{
	package laboratorios.lab02;
}

PLUS : '+' {System.out.println("suma");};
WS   : ('\t'|'\n'|'\r'|' ')+ { skip();};
