package com.example.chapter2.implementinginterfaces;

import java.io.Serializable;

/**
 * - Puede heredar de muchas interfaces
 * - Los metodos los tiene que implementar las clases concretas
 * - Se tienen que seguir las reglas de sobrescritura vistas anteriorment
 * - Las interfaces no pueden implementar ningun metodo
 * - Los metodos declarados en las Interfarces son implicitamente publicos y abstractos
 * - Las variables declaradas son implicitamente final, statit y public
 * - Cuando una clase hereda de otra y ademas implementa una interfaz primero se declara
 * 		de que hereda y despues se escrible la lista de interfaces que implementa.
 * 		Ej: class Classy extends Father implements Someable, Anotherable { ... }
 * @author sanrodari
 *
 */
public interface Interface extends Serializable, Comparable{
	
	/**
	 * Implicitamente abstracto y publico 
	 */
	void method();
	
	/**
	 * Plubico ademas de poder explicitarse lo abstracto
	 */
	abstract void method1();
	
	public abstract void method2();
//	-------Etc. de posibles combinaciones.
	
//	-------Ademas con las variables
	
	int CONSTANT = 0;
	
	public int CONSTANT1 = 1;
	
	public static int CONSTANT2 = 2;
	
	public static final int CONSTANT3 = 3;
	
	static final int CONSTANT4 = 4;
//	-------Etc. de posibles combinaciones.
	
}
