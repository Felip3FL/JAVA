package br.senai.sp.logica.exercicio08;

import br.senai.sp.info132.console.Programa;

public class Exercicio02 extends Programa {

	@Override
	public void inicio() {

		int numero = leInteiro("Informe um nº ");
		
		escrevaL("O inverso do nº " + numero + " é ", numeroAoContrario(numero));

	}

	private int numeroAoContrario(int numeros){
		int aux=0;
		while (numeros > 0) {
			aux = aux * 10 + numeros % 10;
			numeros = numeros / 10;
		}

		return aux;
	}
	
}
