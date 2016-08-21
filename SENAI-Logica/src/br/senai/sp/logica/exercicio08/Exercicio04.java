package br.senai.sp.logica.exercicio08;

import br.senai.sp.info132.console.Programa;

public class Exercicio04 extends Programa {

	@Override
	public void inicio() {

		int numero = leInteiro("Digite um nº");
		escrevaTabuada(numero);
		

	}

	private void escrevaTabuada(int numero){
		for (int i = 1; i <= 10; i++) {
			escrevaL(numero + " x " + i + " = ", i*numero);
		}
	}
	
}
