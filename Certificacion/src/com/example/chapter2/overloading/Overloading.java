package com.example.chapter2.overloading;

public class Overloading {

	void overloading(Overloading o) {
		System.out.println("Overloading");
	}

	void overloading(OverloadingSon o) {
		System.out.println("OverloadingSon");
	}

	public static void main(String[] args) {
		OverloadingSon os = new OverloadingSon();
		Overloading op = os;

		// Decide cual invocar por el tipo de la referencia y no por el tipo del
		// objeto en tiempo de ejecucion
		op.overloading(op);
		op.overloading(os);

		// Selecciona el del hijo
		op.overloading(null);
	}

}

class OverloadingSon extends Overloading {

}