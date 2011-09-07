package com.example.chapter5;

public class WhileTest {

	public static void main(String[] args) {

		boolean something = false;

		// Es posible la asignacion aca pero no la declaracion
		while (something = true) {
			System.out.println();
		}

		// NO compila
		// while (boolean anotherBoolean = true) { }

		while (something = true
				| (something = 7 == 4)
				& (something = "cuanta chambonada se te ocurra"
						.equals("que groseria"))) {
			System.out.println();
		}
	}
}
