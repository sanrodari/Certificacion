package com.example.chapter1.classdeclarations.interfaces;

// Puede implementar varias interfaces a la vez y accede a las del paquete declaradas con acceso por defecto
public class ImplementsInterface implements InterfacesTest,
		InterfacesAccesDefault {

	@Override
	public void resizable() {
		System.out.println(CONSTANTE);
		System.out.println(InterfacesTest.CONSTANTE);
	}

	@Override
	public void resizable1() {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(InterfacesTest o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
