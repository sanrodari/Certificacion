package com.example.chapter5;

import java.sql.Connection;
import java.sql.SQLException;

public class ExceptionsTest {

	public static void main(String[] args) {

		System.out.println("Antes");
		test();
		System.out.println("Despues");

	}

	private static void test() {
		// SI se habilita este fragmento de codigo entonces no se ejecuta el
		// finally
		// if(true){
		// return;
		// }
		try {
			System.out.println("Bloque de retorno");
			return;
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("Bloque finally");
		}
	}

	/**
	 * Tambien se le debe dar algun manejos a las excepciones chequeadas de los
	 * bloques catch y finally
	 */
	static void testExceptions() {
		Connection conn = null;
		try {
			conn = (Connection) new Object();
			conn.createStatement();
		} catch (Exception e) {
			try {
				conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// Recontra close
				}
			}
		}
	}

	static void testWithoutX() {

		// Tres posibles combinaciones para que compilen.
		// 1. Sin finally
		// 2. Sin catch
		// 3. Todos los bloques.
		try {
		} catch (Exception e) {
		}

		try {
		} finally {
		}
	}

	static class FatherException extends Exception {
	}

	static class SonException extends FatherException {
	}

	static class AnotherSonException extends FatherException {
	}

	// El throws significa que puede tirar la excepcion, pero no tiene que
	// tirarla obligatoriamente
	static void throwsFatherException() throws FatherException {
	}

	static void throwsSonException() throws SonException {
		throw new SonException();
	}

	static void throwsAnotherSonException() throws AnotherSonException {
		throw new AnotherSonException();
	}

	static void testHierarchy() throws FatherException {

		try {
			throwsSonException();
			throwsAnotherSonException();
		} catch (SonException son) {
		} catch (AnotherSonException anotherSon) {
		}
		// SI compila pero advierte que este codigo es muerto por las
		// excepciones mas especificas ya fueron capturadas
		catch (FatherException father) {
		}

		try {
			throwsSonException();
			throwsAnotherSonException();

		} catch (FatherException father) {
		} finally {
			throw new FatherException();
			// NO compila porque el codigo es inalcanzable, es como si fuera un
			// return
			// System.out.println("");
		}
		// NO compila porque ya ha sido manejada por la clase padre
		// catch (SonException son) {
		// }
	}
}
