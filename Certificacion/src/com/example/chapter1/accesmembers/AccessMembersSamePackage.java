package com.example.chapter1.accesmembers;

public class AccessMembersSamePackage extends AccesMembers {

	// Si compila con default porq se encuentra en el mismo paquete.
	// Y en el caso de protected porque hereda el metodo y ademas se encuentra
	// en el mismo paquete.
	private void useAMethodFromAccesMembersByInheritance() {
		
//		Invocacion por herencia, está implicito el this.invocacionMetodo(...)
		aMethod();
	}

	// Si compila con default porq se encuentra en el mismo paquete.
	// Y en el caso de protected también por la misma razón, porque se encuentra
	// en el mismo paquete.
	private void useAMethodFromAccesMembersByReferenceTheClass() {
		
//		Invocacion por referencia a la clase
		AccesMembers accesMembers = new AccesMembers();
		accesMembers.aMethod();
		System.out.println(accesMembers.anAtributte);
	}

}
