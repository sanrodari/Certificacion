package com.example.accesmembers.classmembersanotherpackage;

import com.example.accesmembers.AccesMembers;

public class AccesMembersFromAnotherPackage extends AccesMembers {

	// Cuando el miembro es protected puede acceder pero cuando tiene acceso por
	// defecto no puede acceder porque no se encuentra en el mismo paquete
	private void useAMethodFromAccesMembersByInheritance() {
		
//		Invocacion por herencia, está implicito el this.invocacionMetodo(...)
		aMethod();
	}

//	
	private void useAMethodFromAccesMembersByReferenceTheClass() {
		AccesMembers accesMembers = new AccesMembers();
		
//		Invocacion por referencia a la clase
		
		// No compila porque ni con protected ni por defecto porque se encuentra en
		// otro paquete y aqui es lo que cuenta 
//		accesMembers.aMethod();
//		System.out.println(accesMembers.anAtributte);
	}

}
