package com.example.chapter2.constructors;

import javax.swing.JOptionPane;

public class AnotherFamily {

	static class Granpa {
		public Granpa(String withoutDefaultConstructor) {
			System.out.println("Yo soy el abuelo");
		}
	}

	static class Son extends Granpa {

		String attribute = "inicializacion despues de invocar el primer "
				+ "constructor: super(...) o this(...)";

		// NO compila porque trata de invocar super() que no esta definido en el
		// Granpa
		// public Son() {
		// System.out.println("Yo soy el hijo");
		// }

		/**
		 * Constructor sin argumentos que no es el constructor por defecto
		 */
		public Son() {
			super("Porque no tengo constructor por defecto");
		}

		public Son(String staticExample) {
			// NO compila porque no se pueden usar antes de que concluya esa
			// ejecucion
			// super(attribute);

			// Solo estaticos (variables de referencias, primitivos y metodos
			// estaticos)
			super("" + JOptionPane.CANCEL_OPTION);
		}
	}

	/**
	 * Se pueden escribir constructores en clases abstractas
	 */
	static abstract class GrandSon extends Son {
		public GrandSon() {
			System.out.println("Yo soy el nieto");
		}
	}

}
