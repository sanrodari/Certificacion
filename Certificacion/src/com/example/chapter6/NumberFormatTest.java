package com.example.chapter6;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		Locale espanishColombia = new Locale("es", "CO");
		NumberFormat nf = NumberFormat.getCurrencyInstance(espanishColombia);
		System.out.println(nf.format(18000300.55));
		
		System.out.printf(espanishColombia, "Esa platica se perdio: %f", 18300.55);
	}
}
