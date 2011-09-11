package com.example.chapter6;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * @author sanrodari
 * 
 */
public class IOExamples {

	{
		System.out.println("primer bloque de inicializacion");
	}

	String string = initializaString();

	{
		System.out.println("segundo bloque de inicializacion");
	}

	String initializaString() {
		System.out.println("Inicializacion de atributos");
		return "";
	}

	public static void main(String[] args) {

		// Duda que me surgio
		// La invocacion de bloques de inicializacion de instacia y de
		// inicializacion de atributos de la clase se hace en el orden que esten
		// escritos
		new IOExamples();

		try {
			File file = new File("file.txt");
			boolean exists = file.exists();
			System.out.println(exists);

			file.createNewFile();

			System.out.println(file);
			System.out.println(file.exists());

		} catch (Exception e) {
			e.printStackTrace();
		}

		nakedIO();
		readingFilesWithBufferReader();

		// NO se porque no funciona, el System.console() trae una referencia
		// nula
		// cliProgram();
	}

	static void nakedIO() {
		try {
			FileWriter fileWriter = new FileWriter("fileWriter.txt");
			fileWriter.write("Naked IO sucks");
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void readingFilesWithBufferReader() {
		BufferedReader br = null;
		try {
			File file = new File("plan.txt");

			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			if (br != null) {
				br.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void cliProgram() {
		Console console = System.console();
		String readLine = console.readLine();

		PrintWriter writer = console.writer();

		writer.println("Echo = " + readLine);
	}

	static void doesntRelated() {
		short someShorty = 12;
		char character = 64;

		// NO compila asi tenga la misma cantidad de bits
		// character = someShorty;

		int integer = someShorty;
		integer = character;
	}

}
