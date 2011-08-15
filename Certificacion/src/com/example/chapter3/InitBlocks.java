package com.example.chapter3;

public class InitBlocks {
	
	private String string = newString();
	
	public InitBlocks() {
		System.out.println("Constructor propio");
	}
	
	{
		assert string.equals("cadena") : "Debe haber sido inicializada ya con este valor";
		System.out.println("Primer bloque de inicializacion de instancia");
	}
	
	static {
		System.out.println("Primer bloque de inicializacion estatico");
	}
	
	{
		System.out.println("Segundo bloque de inicializacion de instancia");
	}
	
	private String newString() {
		System.out.println("Inicializacion variables de instancia");
		return "cadena";
	}

	public static void main(String[] args) {
		new InitBlocks();
		
		System.out.println();
		System.out.println("-------Creacion de otro objeto");
		
		new InitBlocks();
	}
	
//	SALIDA:
	
//	Primer bloque de inicializacion estatico
//	Inicializacion variables de instancia
//	Primer bloque de inicializacion de instancia
//	Segundo bloque de inicializacion de instancia
//	Constructor propio
//
//	-------Creacion de otro objeto
//	Inicializacion variables de instancia
//	Primer bloque de inicializacion de instancia
//	Segundo bloque de inicializacion de instancia
//	Constructor propio

}
