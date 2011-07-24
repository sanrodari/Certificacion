package com.example.chapter1.classdeclarations.interfaces.anotherpackage;

import com.example.chapter1.classdeclarations.interfaces.InterfacesTest;

public class AccesingConstantsFromInterfaces {

	public static void main(String[] args) {
		// Puede acceder a esta constante aunq en la interfaz no se haya
		// declarador explicitamente el publci static final
		System.out.println(InterfacesTest.CONSTANTE1);
	}

}

// No compila porq no es de acceso publico y por eso no se puede importar
//class AccesingConstantsFromInterfaces1 implements InterfacesAccesDefault{
//
//	public static void main(String[] args) {
//		System.out.println(InterfacesTest.CONSTANTE1);
//	}
//
//}
