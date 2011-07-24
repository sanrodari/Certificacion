package com.example.firstchapter.accesmembers.anothermodifiers;

public abstract class AbstractClass {

	// No compila porque no se puede ocmbinar static con abstract
	// public static abstract void doSomething();

	// El modificador synchronized solo puede ser usado para metodos, solamente
	// para estos
	public synchronized void method() {
	}

	// No compila porque synchronized solo puede ser aplicado a metodos
//	private synchronized int attribute;
	
//	No es necesario  declarar cuerpo por la implementacion es nativa
	public native void someCodeNative();
	
//	No se puede combinar estos modificadores
//	public abstract native void someCodeNative1();
	
//	Las variables o campos no pueden ser declaradas como strictfp
//	strictfp protected int attribute;
	
}
