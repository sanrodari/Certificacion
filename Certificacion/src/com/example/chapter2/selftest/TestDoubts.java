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
