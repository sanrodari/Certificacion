package com.example.chapter1.accesmembers.classmembersanotherpackage;

public class Neighbor {

	public void tryToAccesToInheritedMember() {
		AccesMembersFromAnotherPackage amfap = new AccesMembersFromAnotherPackage();

		// No compila porq aunque lo haya heredado no lo hace visible a este
		// paquete. Sigue estando protegido para que se acceda desde el paquete
		// que lo declaro y sus subclases
		// amfap.aMethod();
	}

}
