package com.example.chapter5;

/**
 * Ayuda para depurar codigo en desarrollo, para verificar que las suposiciones
 * logicas que se hacen sean comprobadas.
 * 
 * Se pueden desactivar la comprobacion de los assert en el JVM y seria como si
 * no estuvieran escritas.
 */
public class AssertTest {
	
	public static void main(String[] args) {
		assert false;
		
		System.out.println("Jejeje");
	}

}
