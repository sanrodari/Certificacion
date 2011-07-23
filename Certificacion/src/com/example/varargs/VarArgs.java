package com.example.varargs;

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

	public static void main(String[] args) {
		doStuff();
		doStuff(new int[] { 1 });
		doStuff(new int[] { 1, 2, 3 });
		doStuff(1, 2, 3);

		// Invocacion que da la prelacion sobre doStuff(int)
		doStuff(1);
		// Para evitar la ambiguedad el argumento explicitamente debe ser un
		// arreglo
		doStuff(new int[] { 1 });
	}

}
