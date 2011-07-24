//import com.example.identifiers.FinalTest;
//No compila el paquete debe se r la priemra instruccion
package com.example.firstchapter.classdeclarations;

//MOdificadores legales final, abstract, strictfp, public y default
// Si es publica tiene q coincidir con el nombre de archivo ej: ClassDeclarationTest.java 
public final class ClassDeclarationTest {

}

abstract strictfp class ClassDeclarationTestMoficadorDefecto {

}

abstract strictfp class MezclasModificadoresNoAcceso {

}

final strictfp class MezclasModificadoresNoAcceso1 {

}

// No compila porq es final o es abstract o ninguno de los dos
//abstract final strictfp class MezclasModificadoresNoAcceso2 {
//
//}

//NO compila porque solo puede haber una clase publica
//public class ClassDeclarationTest1 {
//
//}