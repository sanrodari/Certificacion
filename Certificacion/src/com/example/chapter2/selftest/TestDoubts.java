package com.example.chapter2.selftest;

public class TestDoubts {

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
			
//			Y Autoboxing vence a varagrs
			sifter(aa);
			sifter(ba);
			sifter(7);
			System.out.println(s);
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
	}
}
