package com.example.chapter3;

public class Strings {

	public static void main(String[] args) {
		String a = "somethig";
		String b = a;

		a = a + " add some words";
		
		System.out.println(new Strings().strangeFromStackOverflow());
		
		System.out.println(new Strings().strangeFromStackOverflow1());

		// b no cambia porque a apunta ahora a un nuevo objeto
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
