package br.senai.sp.logica.exercicio05;

import br.senai.sp.info132.console.Programa;

public class Exercicio02 extends Programa {

	@Override
	public void inicio() {
		
		int valorInicial;
		int valorFinal;
		
		valorInicial = leInteiro("Informe o 1º nº");
		valorFinal = leInteiro("Informe o último nº");
		
		for (int i = valorInicial; i <= valorFinal; i++) {
			if (i % 2 != 0){
				escreva(i + " ");
			}
		}
	}

}
