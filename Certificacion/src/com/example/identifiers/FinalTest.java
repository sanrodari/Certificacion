package com.example.identifiers;


public class FinalTest {

	/**
	 * Tiene que definirse maximo en todos los constructores
	 */
	private final int constante;

	private int mutableAtributo;

	// Se ejecuta antes del constructor
	{
		System.out.println("codigo dinamica - aka de object");
	}

	public FinalTest() {
		constante = 9;
	}

	static {
		System.out.println("codigo estatico");
	}

	public FinalTest(final String otro) {

		final String perro;
		int mutable = 9;

		System.out.println("");
		constante = 5;

		perro = "perro";

		class InnerClass1 implements Comparable<Object> {

			@Override
			public int compareTo(Object o) {
				// No compila no se bien porque, creo q es porq es una variable
				// local mutable
				// System.out.println(mutable);
				
				// Si funciona porq es una local final
				System.out.println(otro);

				System.out.println(constante);
				System.out.println(mutableAtributo);
				return 0;
			}

		}

		// InnerClass anonima
		Comparable<Object> cocodrilo = new Comparable<Object>() {
			@Override
			public int compareTo(Object o) {
				// No compila no se bien porque, creo q es porq es una variable
				// local mutable
				// mutable = 8;

				// Si compila para finals creo q es porq es una variable
				// local final
				System.out.println(perro);

				// Estas si funcionan porq son constantes
				System.out.println(constante);
				System.out.println(mutableAtributo);
				return 0;
			}
		};
	}

	// InnerClass
	class InnerClass implements Comparable<Object> {
		@Override
		public int compareTo(Object o) {
			// se puede usar finals y mutables creo porq son atributos
			System.out.println(constante);
			System.out.println(mutableAtributo);
			return 0;
		}

	}

	// Este metodo no se puede redefinir en las subclases
	@Override
	public final String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			FinalTest finalTest = new FinalTest();
			finalTest.toString();
		}
	}

}
