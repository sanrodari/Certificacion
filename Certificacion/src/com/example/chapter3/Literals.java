package com.example.chapter3;

public class Literals {
	
//	Para variables de instancia aka Atributos los valores por defecto son:
	
	// Object reference null
	// byte, short, int, long 0
	// float, double 0.0
	// boolean false
	// char '\u0000'
	
	public static void main(String[] args) {
		long l = 128L;
		System.out.println(Long.toBinaryString(l));
		byte b = (byte) l;
		System.out.println(Byte.toString(b));
	}

	public static void main1(String[] args) {
		int octal = 015;
		// NO compila
		// int octal1 = 085;

		// NO es case sensitive
		int hexa = 0x15DdFf;
		int deci = 15;

		long octalL = 015L;
		// NO compila
		// long octal1L = 085L;

		// NO es case sensitive
		long hexaL = 0x15DdFfL;
		long deciL = 15L;

		float floatNumber = 45.236F;
		// NO compila porque hay perdida de precision
		// float floatNumber1 = 45.236;

		// Unicode chars unsign and 16 bits long

		char c0 = 'c';
		char c1 = '\u4f4F';
		char c2 = 15;
		char c3 = (char) -1;
		// NO compila porq hay perdida de precision
		// char c4 = -1;

		char c5 = '\n';

		// Esto pasaba tambien en el de chars, para hacer una asignacion directa
		// no hay problema, pero para cuando existe una expresion se toma el
		// mayor o el por defecto que es int.
		byte a = 3; // No problem, 3 fits in a byte
		byte b = 8; // No problem, 8 fits in a byte
		// NO compila porque es una expresion y queda con el tipo por defecto: int
//		byte c = b + c; 
	}

}