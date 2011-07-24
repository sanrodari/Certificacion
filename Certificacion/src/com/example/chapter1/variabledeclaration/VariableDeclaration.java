package com.example.chapter1.variabledeclaration;

/**
 * - Las variable se pueden declarar como de tipos primitivos o como referencia
 * - Ocho tipos de primitivos: boolean, byte, char, short, int, long, float, double
 * - Integer types de menor a myor: byte, short, int, long.
 * - Todos los tipos numericos se definen con signo. Usan el bit mas significativo
 * 		para representar el signo.
 * - El primitivo char almacena un caracter Unicode sin signo. 16 bit. Posibles
 * 		valores 2^16.
 * - Variables locales siempre estan en la pila.
 * - Variables locales deben ser inicializadas antes de ser usadas.
 *  
 * @author sanrodari
 *
 */
public class VariableDeclaration {

	int x, y = 1, z;
	
	String s1, s2 ="in between", s3;
	
//	-------------Variables referencia
	// Can use any of the four access levels (which means they can be marked
	// with any of the three access modifiers)
	// Can be marked final
	// Can be marked transient
	// Cannot be marked abstract
	// Cannot be marked synchronized
	// Cannot be marked strictfp
	// Cannot be marked native
	// Cannot be marked static, because then they'd become class variables.

	final VariableDeclaration vd;
	
	public VariableDeclaration() {
		System.out.println("primera sentence");
		vd = this;

		// Cambia el estado del objeto
		vd.s1 = "otra cadena";

		// Pero no se le puede asignar otra referencia
		// vd = new VariableDeclaration();
	}
}
