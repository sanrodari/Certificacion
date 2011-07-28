package com.example.chapter2.staticmodifier;

/**
 * NO se puede sobrescribir un metodo estatico solo se puede "redefinir"
 * 
 * @author sanrodari
 * 
 */
public class RedefiningNotOverriding {

	static class Animal {
		static void doStuff() {
			System.out.print("a ");
		}
	}

	static class Dog extends Animal {
		static void doStuff() { // it's a redefinition,
			// not an override
			System.out.print("d ");
		}

		public static void main(String[] args) {
			Animal[] a = { new Animal(), new Dog(), new Animal() };
			for (int x = 0; x < a.length; x++)
				a[x].doStuff(); // invoke the static method

			// Imprime: "a a a "
			// En el elemenot a[1] no existe polimorfismo ya que el compilador
			// invoca el metodo del tipo de refencia (Animal) no del tipo real
			// de la instacia (Dog).
		}
	}

}
