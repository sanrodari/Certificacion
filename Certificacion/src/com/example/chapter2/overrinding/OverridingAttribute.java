package com.example.chapter2.overrinding;

/**
 * Demo de sobrescritura de atributo.
 * 
 * No existe la sobrescritura de atributos, solo de metodos existe.
 * 
 * @author sanrodari
 * 
 */
public class OverridingAttribute {

	protected String attribute = "padre";

	private String method1() {
		return "padre";
	}

	/**
	 * Lo unico que se puede sobrescribir aqui
	 */
	protected String method() {
		return "padre";
	}

	static class OverridingAttributeSon extends OverridingAttribute {
		protected String attribute = "hijo";

		private String method1() {
			return "hijo";
		}
		
		protected String method() {
			return "hijo";
		}

	}

	public static void main(String[] args) {
		// -----Referencia de hijo, mismo objeto
		OverridingAttributeSon oas = new OverridingAttributeSon();
		// NO hay polimorfismo de atributos
		System.out.println(oas.attribute);

		// NO hay polimorfismo de metodos porque no se sobrescribe
		System.out.println(oas.method1());
		
		// SI hay polimorfismo de metodos
		System.out.println(oas.method());

		// -----Referencia de padre, mismo objeto
		OverridingAttribute oap = oas;
		// NO hay polimorfismo de atributos
		System.out.println(oap.attribute);

		// NO hay polimorfismo de metodos porque no se sobrescribe
		System.out.println(oap.method1());
		
		// SI hay polimorfismo de metodos
		System.out.println(oap.method());
	}

}

class Padre {
	public void algo() {
	}
}

class Hijo extends Padre {
	// No compila porq el modificador de acceso es mas restrictivo que el del
	// metodo que sobrescribe.
	// protected void algo() {
	// }
}