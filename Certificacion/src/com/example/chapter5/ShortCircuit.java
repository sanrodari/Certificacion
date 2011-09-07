package com.example.chapter5;

/**
 * Para demostrar que solamente se evalua la expresion de una parte a otra con
 * los operadores && y ||
 * 
 * @author sanrodari
 * 
 */
public class ShortCircuit {

	public static void main(String[] args) {
		int zero = 0;
		int one = 1;
		if (true || zero++ < one++) {
			// NO se evalua la parte derecha de la expresion por el short
			// circuit

			System.out.println(zero);
			System.out.println(one);
		}

		if (false && zero++ < one++) {
			/* Codigo muerto */
		}

		
		// NO se evalua la parte derecha de la expresion por el short
		// circuit
		System.out.println(zero);
		System.out.println(one);
	}

}
