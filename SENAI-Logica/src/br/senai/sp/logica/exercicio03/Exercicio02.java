package br.senai.sp.logica.exercicio03;

import br.senai.sp.info132.console.Programa;

public class Exercicio02 extends Programa {

	@Override
	public void inicio() {

		int valor1;
		
		valor1 = leInteiro("Valor 1");
		
		if (valor1 % 2 == 0){
			escreva("PAR");
		}else{
			escreva("IMPAR");
		}

	}

}
