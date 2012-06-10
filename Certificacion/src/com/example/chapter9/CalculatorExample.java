package com.example.chapter9;

public class CalculatorExample {
	
	static Calculator c = new CalculatorExample().new Calculator();
	
	class Calculator extends Thread{
		
		private int total;
		
		@Override
		public void run() {
			synchronized (this) {
				System.out.println("Empiezo");
				for (int i = 1; i <= 100; i++) {
					total += i;
				}
//				System.out.println("Notificando a todos");
				System.out.println("Total: " + total);
				notify();
			}
		}
	}
	
	class Reader extends Thread{
		
		@Override
		public void run() {
			synchronized (c) {
				try {
					System.out.println("Esperando");
					c.wait();
					System.out.println("Termino el reader");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new CalculatorExample().new Reader().start();
		new CalculatorExample().new Reader().start();
		new CalculatorExample().new Reader().start();
		c.start();
	}

}
