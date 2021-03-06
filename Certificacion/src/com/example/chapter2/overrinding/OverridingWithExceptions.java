package com.example.chapter2.overrinding;

public class OverridingWithExceptions {
	
	static class Animal {
		public Object eat() throws Exception {
			// throws an Exception
			return null;
		}
		public Object eatAll(String all) throws Exception {
			// throws an Exception
			return null;
		}
	}

	static class Dog2 extends Animal {
		@Override
//		El retorno puede ser un subtipo del retorno del que se sobrescribe
		public String eat() { /* no Exceptions */
			System.out.println("Llamo despues al super");
			try {
				super.eat();
				super.eatAll("all tamales");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		public static void main(String[] args) {
			Animal a = new Dog2();
			Dog2 d = new Dog2();
			d.eat(); // ok
//			a.eat(); // compiler error -
			// unreported exception
		}
	}
}
