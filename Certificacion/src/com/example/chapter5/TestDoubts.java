package com.example.chapter5;

import javax.swing.JOptionPane;

/**
 * Dudas del examen
 * 
 * @author sanrodari
 * 
 */
public class TestDoubts {

	public static void main(String[] args) {
		try {
			new TestDoubts().go();
		} catch (Error e) {
			System.out.println(e);
			System.out.println("ouch");
		}
		// SI se puede seguir trabajando en este caso aunque no es recomendado
		// recuperse despues de un StackOverflowError
		System.out.println("puedo seguir trabajando");

		JOptionPane.showMessageDialog(null, "Puedo seguir dandole");
	}

	void go() {
		go();
	}

	void assertTest() {
		int i;
		assert false : i = 0;
	}
}

class TestDoubstSon extends TestDoubts {

	// NO compila porque no puede lanzar excepciones mayores de las que lanza
	// el metodo que se va a sobrescribir
	// @Override
	// void go() throws Exception{ }

	// SI compila porque las runtime exception no son consideradas por el
	// compilador
	@Override
	void go() throws ArithmeticException {
	}

}
