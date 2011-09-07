package com.example.chapter5;

/**
 * La inicializacion y el incremento pueden tener varias instrucciones
 * 
 * @author sanrodari
 * 
 */
public class ForTest {

	public static void main(String[] args) {

		// La inicializacion y el incremento pueden tener varias instrucciones
		for (double i = 0, x = 9; i < args.length; i++, x--) {
		}

		// NO compila porque la inicializacion solo puede tener variables de un
		// tipo
		// for (double i = 0, x = 9, double d = 9.0; i < args.length; i++, x--)
		// {}

		// Un for puede no ejecutar ni una iteracion
		boolean comeIn = false;
		for (int i = -1; i > 0; i++) {
			System.out.println("Entre");
			comeIn = true;
		}

		System.out.println(comeIn ? "Entre" : "No entre");

		// Ninguna de las tres partes es requerida. Es un ejemplo de ciclo
		// infinito
		for (;;) {
			System.out.println("For sin ninguna de las 3 partes");
			break;
		}

		// En el mal llamado operacion de incremento se pude poner cualquier
		// instruccion arbitraria
		for (int i = 0; i < 10; System.out.println("iterando a " + i), i++){}
		
		// Tambien el cuerpo es opcional, se puede poner un punto y coma ';'
		for (int i = 0; i < 10; System.out.println("iterando a " + i), i++);

	}

}
