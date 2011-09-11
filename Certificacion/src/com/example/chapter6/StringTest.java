package com.example.chapter6;


public class StringTest {
	
	public static void main(String[] args) {
		String s = new String("string");
		s.concat("another");
		
		System.out.println(s);
		
		int[] array = {};
		
//		Para acceder a la longitud de un arreglo es con el atributo final .length
		System.out.println(array.length);

//		Para acceder a la longitud de un cadena es con el metodo .length()
		s.length();
		
		trims();
	}
	
	static void trims(){
		System.out.print(" \n  algo que se trims \n  ".trim());
	}

}
