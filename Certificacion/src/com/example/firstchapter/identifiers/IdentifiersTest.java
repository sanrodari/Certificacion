package com.example.firstchapter.identifiers;

public class IdentifiersTest {

	// NO compila porque el super() debe ser la primera instruccion
	// public IdentifiersTest() {
	// System.out.println("d");
	// super();
	// }

	public static void main(String[] args) {
		// Object o:m = null; no compila
		// Object o#m = null; no compila
		double o = 0.0;

		boolean postcondicion = true;
		// Se cumple con la condicion
		assert postcondicion : "No se cumple la pos";

		// Se reservan para q no se usen
		// goto const

		System.out.println("");
	}

}
