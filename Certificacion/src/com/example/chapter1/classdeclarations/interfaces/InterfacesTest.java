package com.example.chapter1.classdeclarations.interfaces;

import java.io.Serializable;

// Puede extender varias interfaces
// El abstract es implicito, se puede usar strictfp
public strictfp abstract interface InterfacesTest extends Serializable, Comparable<InterfacesTest>{
	
	public static final int CONSTANTE = 9;
	
//	Implicitamente es igual a la de arriba public static final
	int CONSTANTE1 = 1;

	public abstract void resizable();
	
	// El compilador implicitamente pone los modificadores public y abstract a
	// los metodos que no lo tienen
	void resizable1();
	
//	NO compila porq es estatico
//	static void resizable2();
	
//	NO compila por q es abstracto
//	strictfp void resizable3();
	
//	NO compila por q es abstracto
//	native void resizable4();
	
//	No compila porq implicitamente es publico lo mismo para private
//	protected void resizable5()

}
