package com.example.chapter1.constructors;

/**
 * - No tienen retorno y debe declararse con la misma capitulacion de la clase.
 * - No pueden se marcados como estaticos. 
 * - No pueden ser sobrescritos por lo que final y abstract son modificadores ilegales.
 * - Solo son permitidos los modificadores de acceso 
 * - Se puede usar varargs
 * 
 * @author sanrodari
 * 
 */
public class ConstructorsBasis {

	// NO compila por que puede ser static
	// public static ConstructorsBasis() { }

	// NO compila por que puede ser final ni abstract
	// public final ConstructorsBasis() { }

	// NO compila por que puede ser final ni abstract
	// public abstract ConstructorsBasis() { }

	// illegal constructors
	// void ConstructorBasis() { } // it's a method, not a constructor
	// ConstructorBasis2() { } // not a method or a constructor
	// ConstructorBasis(short s); // looks like an abstract method
	// static ConstructorBasis(float f) { } // can't be static
	// final ConstructorBasis(long x) { } // can't be final
	// abstract ConstructorBasis(char c) { } // can't be abstract
	// ConstructorBasis(int... x, int t) { } // bad var-arg syntax

	// Este no tiene sentido, solo sirve para darle el acceso por defecto ya que
	// los constructores no se pueden sobreescribir
	protected ConstructorsBasis() {
		// TODO Auto-generated constructor stub
	}

}
