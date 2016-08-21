package br.senai.sp.logica.exercicio05;

import br.senai.sp.info132.console.Programa;

public class Exercicio03 extends Programa {

	@Override
	public void inicio() {
		
		int media = 0;
		
		for (int i = 0; i < 5; i++) {
			media += leInteiro("Informe um nº");
		}
		
		escrevaL("Soma: ", media);
		
		media = media / 5;
		
		escrevaL("Media: ", media);
		
	}

}
