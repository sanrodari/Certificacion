package com.example.chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab");

		Matcher matcher = p.matcher("abbaabba");

		while (matcher.find()) {
			System.out.println("RegexTest.main() " + matcher.start());
		}

		leftToRight();
	}

	/**
	 * No se devuelve en los indices de caracteres, siempre va de izq. a
	 * derecha. Se puede pensar en esto tambien como que consume los caracteres.
	 */
	static void leftToRight() {
		Pattern p = Pattern.compile("aba");

		Matcher matcher = p.matcher("abababa");

		while (matcher.find()) {
			System.out.println("RegexTest.leftToRight() " + matcher.start());
			System.out.println("RegexTest.leftToRight() " + matcher.end());
		}
	}

	/**
	 * Metacaracteres como \\d digito, \\s espacio en blanco, \\w letras,
	 * digitos y _
	 */
	static void metaCharacters() {
		System.out.println("RegexTest.metaCharacters()");

	}

}
