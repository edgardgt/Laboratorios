lexer grammar Lab03;

@header{
	package laboratorios.lab03;
}


RESERV: ('int'|'boolean') {System.out.println("RESERVADA");};

// Numeros ENTEROS POSITIVOS, ENTEROS, Y FLOTANTES
DIGITO: ('0'..'9')  {System.out.println("DIGITO");};
ENTPOS: DIGITO+{System.out.println("ENTPOS");};
ENTERO: ('-')? ENTPOS {System.out.println("ENTERO");};
FLOTAN: ENTERO ('.' ENTPOS)? {System.out.println("FLOTANTE");};
IGNORAR: ('\t'|'\n'|'\r'|' ')+ { skip();};

// Numeros HEXADECIMALES
NUMHEX: '0x' (('A'..'F')|ENTPOS)+ {System.out.println("NUMERO HEXADECIMAL");};

// Literales CARACTER
CARACTER: ('A'..'Z')|('a'..'z')  {System.out.println("CARACTER");};
