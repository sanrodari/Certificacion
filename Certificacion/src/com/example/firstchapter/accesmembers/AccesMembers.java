package com.example.firstchapter.accesmembers;

/**
 * Para demostrar los posibles accesos a miembros dependiendo de los
 * modificadores de acceso
 * 
 * @author sanrodari
 * 
 */
public class AccesMembers {

	protected int anAtributte;

	protected void aMethod() {
		System.out.println("A method with default acces");
	}

	/**
	 * Solo es aplicable el modificador final
	 */
	public void localVariablesModifiers() {
		// No compila, ni ningun otro modificador de acceso
		// private int something = 0;

		// Solo se puede usar este modificador, claro que este no es de acceso
		final int something1 = 0;
	}

}
