//import com.example.identifiers.FinalTest;
//No compila el paquete debe se r la priemra instruccion
package com.example.chapter1.classdeclarations;

//MOdificadores legales final, abstract, strictfp, public y default
// Si es publica tiene q coincidir con el nombre de archivo ej: ClassDeclarationTest.java 
public final class ClassDeclarationTest {

	// Puede ser publica porque esta enclosed
	public class AnotherClass {
	}

	// Puede ser publica porque esta enclosed
	// Puede ser static porque esta enclosed y no dentro de un metodo
	static public class StaticAnotherClass {
	}

	void someMethod() {
		// NO compila puede ser static porque aunque esta enclosed se encuentra
		// dentro
		// de un metodo
		// static public class StaticAnotherClassInMethod {}
	}
}

// NO compila porque solo una clase publica por archivo fuente
// public AnotherClazz{}

abstract strictfp class ClassDeclarationTestMoficadorDefecto {

}

abstract strictfp class MezclasModificadoresNoAcceso {

}

final strictfp class MezclasModificadoresNoAcceso1 {

}

// No compila porq es final o es abstract o ninguno de los dos
// abstract final strictfp class MezclasModificadoresNoAcceso2 {
//
// }

// NO compila porque solo puede haber una clase publica
// public class ClassDeclarationTest1 {
//
// }