package com.example.statictest;

/**
 * --------Things you can mark as static: 
 * -- Methods Variables
 * -- A class nested within another class, but not within
 * 		a method (more on this in Chapter 8).
 * -- Initialization blocks.
 * 
 *
 * --------Things you can't mark as static: 
 * -- Constructors (makes no sense; a constructor is used 
 * 		only to create instances) 
 * -- Classes (unless they are nested) 
 * -- Interfaces 
 * -- Method local inner classes (we'll explore this in Chapter 8) 
 * -- Inner class methods and instance variables 
 * -- Local variables
 * 
 * @author sanrodari
 * 
 */
public class Static {

	//Initialization blocks.
	static{
		
	}
	
	void someMethod() {
		// No se puede declarar como estatico si se declara dentro de un metodo
		// static class StaticNestedInsideMethod{}
	}

//	Compila porque la Nested Class es estatica
//	por lo tanto sus metodos y atributos pueden ser estaticos
	static class StaticNestedOutsideMethod {
		static int attribute;
		static void method() {
		}
	}
	
//	No compila porque la Nested Class no es estatica
//	por lo tanto sus metodos y atributos no pueden ser estaticos
//	class NestedOutsideMethod {
//		static int attribute;
//		static void method() {
//		}
//	}

}
