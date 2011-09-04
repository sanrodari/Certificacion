package com.example.chapter2.legalreturntypes;

public class YouHaveToChangeTheParameters {

	void tryingToOverload() {

	}

	YouHaveToChangeTheParameters tryingToOverride() {
		return new YouHaveToChangeTheParameters();
	}

}

class YouHaveToChangeTheParametersSon extends YouHaveToChangeTheParameters {

	// NO compila porque se tiene que cambiar la lista de parametros para que
	// sea una sobrecarga. O sobrescribir con un tipo de retorno apropiado.
	// String tryingToOverload(){}

	// Sobrescribe porque el tipo de retorno es un subtipo del declarado en el
	// metodo sobrescrito
	@Override
	YouHaveToChangeTheParametersSon tryingToOverride() {
		return new YouHaveToChangeTheParametersSon();
	}
}
