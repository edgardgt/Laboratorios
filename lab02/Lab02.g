lexer grammar Lab02;

@header{
	package laboratorios.lab02;
}

PLUS : '+' {System.out.println("plus");};
MINUS : '-' {System.out.println("minus");};
MULT : '*' {System.out.println("mult");};
DIVI : '/' {System.out.println("divi");};
IGNORAR : ('\t'|'\n'|'\r'|' ')+ { skip();};
LETRA : ('a'..'z'|'A'..'Z' )+ {System.out.println("Error, letras ingresadas");}; 
ENTERO : ('-')?('0'..'9')+ {System.out.println("entero");};
REAL : ('-')?('0'..'9')+('.'('0'..'9')+)? {System.out.println("real");};

