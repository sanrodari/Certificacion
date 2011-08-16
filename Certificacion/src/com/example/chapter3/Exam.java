package com.example.chapter3;

public class Exam {

	void receiving(short s) {

		// Solo funciona la asignacion para inicializaciones y expresines con
		// literales de otras forma no funciona
		short s1 = 10;
		short expression = 8 + 2 + 4;
	}

	public static void main(String[] args) {

		// No funciona por ejemplo pasandola como parametro
		// new Exam().receiving(10);

		// Correcion
		new Exam().receiving((short) 10);

		short operand = 9;
		// O asignarla en una expresion con variables
		// short expression = 8 + operand;

		// Correcion
		short expression = (short) (8 + operand);
	}

}
