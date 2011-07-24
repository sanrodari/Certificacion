package com.example.chapter1.classdeclarations.interfaces;

//Redunda el implements Runnable porque Thread ya implementa esta interfaz
// pero aun asi no hay errores de compilacion
public class DoubleInterface extends Thread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

}

class Electronic implements Device {
	public void doIt() {
	}
}

abstract class Phone1 extends Electronic {
}

abstract class Phone2 extends Electronic {
	public void doIt(int x) {
	}
}

// Un caso de interfaz redundante que como se cloncuyo anteriormente si compila
class Phone3 extends Electronic implements Device {
	public void doStuff() {
		// Este compila de las dos formas
		// 1. class Phone3 extends Electronic
		// 2. class Phone3 extends Electronic implements Device
		Device d = new Electronic();
	}
}

interface Device {
	public void doIt();
}
