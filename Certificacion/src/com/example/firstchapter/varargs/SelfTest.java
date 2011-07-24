package com.example.firstchapter.varargs;

public class SelfTest {

	public static void main(String[] args) {
		doStuff(1);
		doStuff(1, 2);
	}

	// insert code here

	private static void doStuff(int... varargs) {

	}

	// -------------Solamente puede estar definido uno porque o sino genera
	// problemas de Ambiguedad

	// private static void doStuff(int y, int... varargs) {
	//
	// }

}
