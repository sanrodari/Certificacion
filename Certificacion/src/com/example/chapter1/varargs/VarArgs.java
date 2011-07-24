package com.example.chapter1.varargs;

/**
 * Solo se puede usar un varagrs por metodo y debe ser el ultimo parametro
 * 
 * @author sanrodari
 * 
 */
public class VarArgs {

	// Legales
	static void doStuff(int... x) {
		System.out.println("Soy VarArgs");
	} // expects from 0 to many ints

	// as parameters
	static void doStuff2(char c, int... x) {
	} // expects first a char,

	// then 0 to many ints
	static void doStuff3(Object... animal) {
	} // 0 to many Animals

	// Ilegales
	// void doStuff4(int x...) { } // bad syntax
	// void doStuff5(int... x, char... y) { } // too many var-args
	// void doStuff6(String... s, byte b) { } // var-arg must be last

	// Este metodo tiene prelacion sobre doStuff(int...)
	static void doStuff(int x) {
		System.out.println("No soy VarArgs");
	}

	static void doStuff(int y, int... x) {
		// Este produce un error de ambiguedad cuando entre
		// doStuff(int...) y doStuff(int y, int...)
		// con argumentos como doStuff(1, 2, 3) para evitar esto el argumento
		// debe ser explicitamente un arreglo
		// Ej: doStuff(1, new int[] { 1, 2, 3 }) invoca doStuff(int y, int...)
		System.out.println("Este produce un error de ambiguedad");
	}

	public static void main(String[] args) {
		doStuff();
		doStuff(new int[] { 1 });
		doStuff(new int[] { 1, 2, 3 });

		// Error de ambiguedad
		// doStuff(1, 2, 3);

		// Corrige la ambiguedad e invoca doStuff(int y, int...)
		doStuff(1, new int[] { 1, 2, 3 });

		// Invocacion que da la prelacion sobre doStuff(int)
		doStuff(1);
		// Para evitar la ambiguedad el argumento explicitamente debe ser un
		// arreglo
		doStuff(new int[] { 1 });
	}

}
