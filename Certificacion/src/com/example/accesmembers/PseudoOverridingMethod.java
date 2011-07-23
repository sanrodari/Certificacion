package com.example.accesmembers;

public class PseudoOverridingMethod {

	private void aMethod() {
		System.out.println("Im the father");
	}

	// Aunque la combinacion de modificadores sea legal no tiene ningun sentido
	// porque este metodo no puede ser sobreescrito. Por eso aqui, el final no sirve
	// de nada.
	private final void itCantBeOverriding() {

	}

	public static void main(String[] args) {
		PseudoOverridingMethodSubclass pomSubclass = new PseudoOverridingMethodSubclass();
		// Este invoca el metodo public declarado en
		// PseudoOverridingMethodSubclass
		pomSubclass.aMethod();
		// Imprime: Im the son

		PseudoOverridingMethod pomSuperclass = pomSubclass;
		// Este invoca el metodo privado declarado en PseudoOverridingMethod
		pomSuperclass.aMethod();
		// Im the father
	}

}
