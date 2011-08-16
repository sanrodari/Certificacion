package com.example.chapter3;


/**
 * Widening no ocurre entre objetos Wrappers.
 * 
 * @author sanrodari
 * 
 */
public class TestDoubts {
	
	enum Suits{
		SPADES(9), DIAMONDS(10) {
			@Override
			public int getValue(int bid) {
				return 15;
			}
		};
		
		private int points;
		
		public int getValue(int bid){
			return points * bid;
		}
		
		Suits(int points) {
			this.points = points;
		}
	}

	static class A {
	}

	static class B extends A {
	}

	static class ComingThru {
		static String s = "-";

		public static void main(String[] args) {
			A[] aa = new A[2];
			B[] ba = new B[2];

			// Invoca el de sifter(Object) por widening
			// Primero invoca widening y despues autoboxing o varagrs

			// Widening beats autoboxing and varargs para que sea compatible
			// hacia atras

			sifter(aa);
			sifter(ba);
			sifter(7);
			System.out.println(s);

			// Y Autoboxing vence a varagrs
			byte one = 1;
			byte two = 2;
			whoWins(one, two);

			// NO compila porque no es capaz de hacer widening y despues boxing
			byte three = 3;
			// wideningAndBoxing(three);

			// Si puede primero hacer boxing y despues widening
			// Boxing a Integer y despues Widening a Object
			boxingThenWidening(3);
			
			System.out.println(Suits.DIAMONDS);
			
			System.out.println(Suits.values());
		}

		static void sifter(A[]... a2) {
			s += "1";
		}

		static void sifter(B[]... b1) {
			s += "2";
		}

		static void sifter(B[] b1) {
			s += "3";
		}

		static void sifter(Object o) {
			s += "4";
		}

		static void whoWins(byte... bytes) {
			System.out.println("varargs");
		}

		static void whoWins(Byte byte1, Byte byte2) {
			System.out.println("autoboxing");
		}

		static void wideningAndBoxing(Integer box) {
			System.out.println(box);
		}

		static void boxingThenWidening(Object wide) {
			System.out.println(wide);
		}
	}
}
