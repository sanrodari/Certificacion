package com.example.chapter5;

/**
 * Los tipos de datos aceptados por una sentencia switch son char, byte, short,
 * int y desde Java 6 enums
 * 
 * @author sanrodari
 * 
 */
public class SwitchStatement {

	public static void main(String[] args) {

		// Los casos tienen que se resueltos en tiempo de ejecucion mediante
		// asignaciones de literales

		// Ej:

		final char case1 = 'a';

		final char case2;
		case2 = 'b';

		switch ("a".charAt(0)) {
		case case1: {
			System.out.println("Dentro de llaves");
		}

			break;

		// NO compila porque no es una constante resuelta en tiempo de
		// ejecucion
		// mediante un literal
		// case case2:

		default:
			break;
		}

		// ---------Errores de compilacion por falta de precision en los tipos

		byte byteSwitch = 15;

		switch (byteSwitch) {
		case 15:

			break;

		// No compila porque no se puede castear un int a un byte, perdidad de
		// precision
		// case 128:

		default:
			break;
		}

		// --------------default se puede usar en cualquier orden del switch

		int something = 0;

		switch (something) {
		case 1:

			break;

		default:
			System.out.println("defecto");
			break;

		// Primero evalua los casos que no son el de default y despues si evalua
		// el default
		case 0:
			System.out.println("caso 0");
			break;
		}
	}

}
