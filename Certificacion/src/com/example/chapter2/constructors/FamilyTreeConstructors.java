package com.example.chapter2.constructors;

/**
 * - Primero invoca el constructor padre y cuando retorna inicializa los atributos
 * 		y ahi si ejecuta su propio codigo de construccion.
 * - Si no se escribe un constructor el compilador genera uno sin argumentos 
 * 		automaticamente.
 * - Si se escribe un metodo con argumentos el compilador ya no proveera el 
 * 		constructor sin argumentos mencionado anteriormente.
 * - La primera sentencia de un constructor debe ser o un this(...) o super(...).
 * 		Si no se pone nada el compilador invoca el super() sin argumentos.
 * @author sanrodari
 *
 */
public class FamilyTreeConstructors {
	
	/**
	 * Es legal pero no se debe hacer
	 */
	void FamilyTreeConstructors(){}

	static class Syso{
		public Syso() {
			System.out.println("Yo soy un objeto syso");
		}
	}
	
	static class Granpa{
		
		Syso syso = new Syso();
		
		public Granpa() {
			
			if(syso != null){
				System.out.println("Ya se han asignado los valores declarados " +
						"para los atributos");
			}
			
			System.out.println("Yo soy el abuelo");
		}
		
		public Granpa(String d) {
			this();
		}
	}
	
	static class Son extends Granpa{
		public Son() {
			System.out.println("Yo soy el hijo");
		}
	}
	
	static class GrandSon extends Son{
		public GrandSon() {
			System.out.println("Yo soy el nieto");
		}
	}
	
	public static void main(String[] args) {
		new GrandSon();
	}
}
