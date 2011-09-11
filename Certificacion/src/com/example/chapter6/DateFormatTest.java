package com.example.chapter6;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,
				Locale.ITALIAN);

		System.out.println(df.format(new Date()));
		
		try {
//			Se le debe manejar o lanzar la excepcion 
			System.out.println("Parsing " + df.parse(df.format(new Date())));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calendar calendar = Calendar.getInstance();

		// RECORDAR que el mes es basado en 0 por eso diciembre es el mes 11
		calendar.set(2011, 11, 12);

		System.out.println(calendar);
		System.out.println(calendar.getTime());

		Locale localeEspanolColombia = new Locale("es", "CO");
		df = DateFormat
				.getDateInstance(DateFormat.FULL, localeEspanolColombia);
		
		System.out.println(localeEspanolColombia.getDisplayCountry());
		System.out.println(localeEspanolColombia.getDisplayLanguage(Locale.ENGLISH));
		System.out.println(localeEspanolColombia.getLanguage());

		System.out.println(df.format(calendar.getTime()));
		
		df = DateFormat
				.getDateInstance(DateFormat.FULL, new Locale("ja"));
		
		System.out.println(df.format(calendar.getTime()));
	}

}
