package com.example.chapter5;

public class BreakAndContinue {

	public static void main(String[] args) {

		// NO compila porque no esta dentro de un ciclo
		// continue;

		int i = 0;
		switch (i = 2) {
		case 1:
			// NO compila porque no esta dentro de un ciclo
			// continue;
		}

		labeledBefore: System.out.println("Etiquetado");

		// NO compila porque no esta dentro de un ciclo o un switch
		// break labeled;

		labeledImmediatelyBefore: for (;;) {

			// NO compila
			// break labeledBefore;

			break labeledImmediatelyBefore;
		}

		repetitiveLabel: System.out.println("Repetido");

		repetitiveLabel: System.out.println("Repetido");

	}

}
