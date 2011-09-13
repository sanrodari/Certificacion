package com.example.chapter3;

public class Strings {

	public static void main(String[] args) {
		String a = "somethig";
		String b = a;

		a = a + " add some words";
		// b no cambia porque a apunta ahora a un nuevo objeto

		String p1 = "algo";
		String p2 = "algo";

		String p3 = "cantalassssssssssssssssssssssss";
		String p4 = new String("cantalassssssssssssssssssssssss");

		System.out.println(p1 == p2);

		System.out.println(p3 == p4);

		// Para declarar un caracter unicode solo se puede usar backslash u xxxx
		// donde la u tiene que ser siempre minuscula y donde la x son digitos
		// hexadecimales con cualquier capitalizacion

		String exampleUnicode1 = "\uFfFf";

		// NO compila porque empieza con U mayuscula
		// String exampleUnicode2 = "\Uffff";
		
		
		System.out.println(new Strings().strangeFromStackOverflow());
		
		System.out.println(new Strings().strangeFromStackOverflow1());

	}
	
	boolean strangeFromStackOverflow(){
		try{
			return true;
		}
		finally{
			return false;
		}
	}
	
	boolean strangeFromStackOverflow1(){
		try{
			assert false;
		}
		finally{
			return false;
		}
	}
	
	Object anotherStrangeThing() [] {
		return null;
	}
		
}
