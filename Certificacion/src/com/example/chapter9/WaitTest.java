package com.example.chapter9;

public class WaitTest {

	public static void main(String[] args) {
		String algo = "";
		if (algo instanceof String) {
			System.out.println("soy string");
		}

		objetillo(1);
	}

	static void objetillo(Integer l) {
		final int o = 2;
		switch (o) {
		case o:

			break;

		default:
			break;
		}

		for (System.out.println(), objetillo(4), new WaitTest(); -1 < 0; System.out
				.print("")) {

		}
	}

	public static void main1(String... args) {
		Thread thread1 = new Thread(

		new Runnable() {
			@Override
			public void run() {
				while (true) {
					synchronized (this) {
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Intervalo transcurrido");
						notify();
					}
					System.out
							.println("No entiendo porque no libera el lock del objeto this");
					String[] matrix[] = new String[][] {};
				}
			}
		});

		thread1.start();

		synchronized (thread1) {
			System.out.println("Esperando que complete");
			try {
				thread1.wait();
				System.out.println("He terminado");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	protected class Algo {
		synchronized void alg0() {
		}
	}

	protected class Algo1 extends Algo {
		void go() {
			alg0();
		}

		@Override
		void alg0() {
			System.out.println(ALGO.SI);
			// TODO Auto-generated method stub
			super.alg0();
			byte l = 9;
			byte $l = 1;
			byte $$ = (byte) (l + $l);
			String fd = "";
			String[][][] d = new String[5][2][];
			char c = '2';

		}
	}

};;;;;;;;;;;;

;;;;;;

enum ALGO {
	SI, NO,
};;;;;;;;;;