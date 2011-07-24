package com.example.chapter1.enums;

import javax.swing.JOptionPane;

public enum Enums {

	// Probando GitHub por origin

	// Probando GitHub por GitHub
	;

	static class TestEnum {
		static Animals a;
		public static void main(String[] args) {
			System.out.println(a.DOG.sound + " " + a.FISH.sound);
		}
	}

	
}

enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;

	Animals(String s) {
		sound = s;
	}
}
