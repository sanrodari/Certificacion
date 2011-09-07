package com.example.chapter5;

import java.util.ArrayList;

public class GenericsHack {

	public static void main(String[] args) {
		ArrayList<Integer> enteros = new ArrayList<Integer>();

		agregarCadenas(enteros);

		System.out.println(enteros.get(0));
		System.out.println(enteros.get(1));

		/* Trata de castear pero no puede */
		Integer integer = enteros.get(0);
	}

	private static void agregarCadenas(ArrayList enteros) {
		enteros.add("Un hack");
		enteros.add("Dos hacks");
	}

}
