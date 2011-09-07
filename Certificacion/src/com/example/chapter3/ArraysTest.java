package com.example.chapter3;

public class ArraysTest {

	public static void main(String[] args) {
		// NO compila
		// int[][] array = new int [][4];

		// Deben estar asignados los consecutivamente los primeros valores.
		// Por lo menos debe estar inicializandoce con uno.
		int[][][] array2 = new int[2][][];

		int[][][] array3 = new int[2][3][];

		// NO compila, es necesario una inicializacion anonima
		// receivingArray({1, 2, 3});

		// NO compila
		// int[][][] array4 = new int[][][3];

		receivingArray(new int[] { 1, 2, 3 });

		int[] array5 = { 1, 2, 3 };

		// NO compila porque esta forma solo se debe usar en la declaracion del
		// array
		// array5 = {4, 5, 6};

		// Es necesario usar una anonima despues de haber inicializado el array
		array5 = new int[] { 4, 5, 6 };

		// NO compila porque en la creacion anonima no se puede poner el tamano
		// del array
		// array5 = new int[3] { 4, 5, 6 };

		// ----------
		// Con primitivos no funciona pero con referencias a objetos
		// si.
		int number;
		char character = 'P';
		number = character;

		int[] numbers;

		char[] characters = { 'p', 'g', 't' };

		// No compila, debe ser exactamente del mismo tipo
		// numbers = characters;

		// Con refencias a objetos si funciona la "herencia de arreglos".
		
		Object[] objects;
		String[] strings = {};
		objects = strings;
	}

	static void receivingArray(int[] array) {
		System.out.println(array);
	}

}
