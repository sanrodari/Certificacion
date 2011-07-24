package com.example.chapter1.accesmembers;

public class PseudoOverridingMethodSubclass extends PseudoOverridingMethod{

	// @Override Con esta anotacion no compila porque no esta sobrescribiendo
	// ningun metodo
	public void aMethod() {
		System.out.println("Im the son");
	}
}
