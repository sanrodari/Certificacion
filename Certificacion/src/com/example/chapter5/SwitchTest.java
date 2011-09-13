package com.example.chapter5;

public class SwitchTest {

	public static void main(String[] args) {
		int variable = 0;
		variable++;

		// NO compila porque tiene que ser un literal en la inicializacion
		// final int constant = variable;

		// NO compila porque tiene que ser un literal en la inicializacion
		// final int constant;
		// constant = 0;

		// SI compila porque tiene que ser un literal en la inicializacion
		// El valor del caso tiene que ser calculado en tiempo de compilacion
		final int constant = 0;
		
		switch (0) {
		case constant:

			break;

		default:
			break;
		}
	}

}
