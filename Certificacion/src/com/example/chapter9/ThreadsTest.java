package com.example.chapter9;

public class ThreadsTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadsTest().new NewRunnable(), "Hilo1");
		Thread t2 = new Thread(new ThreadsTest().new NewRunnable(), "Hilo2");
		Thread t3 = new Thread(new ThreadsTest().new NewRunnable(), "Hilo3");

		try {
			t1.start();
			t1.join();
			
			t2.start();
			t2.join();
			
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private class NewRunnable implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				System.out.println(Thread.currentThread().getName()
						+ " En el: " + i);
				if (Thread.currentThread().getName().equals("Hilo1")) {
					Thread.yield();
				}
			}
			System.out.println("-------- Termine!!!");
		}
	}

}
