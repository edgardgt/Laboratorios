lexer grammar Lab03;

@header{
	package laboratorios.lab03;
}

RESERV: ('int'|'boolean') {System.out.println("RESERVADA");};
ENTERO: ('-')?('0'..'9')+ {System.out.println("ENTERO");};
FLOTAN: (ENTERO('.'('0'..'9'))?) {System.out.println("ENTERO");};

IGNORAR : ('\t'|'\n'|'\r'|' ')+ { skip();};