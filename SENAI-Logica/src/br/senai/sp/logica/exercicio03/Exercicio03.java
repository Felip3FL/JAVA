package br.senai.sp.logica.exercicio03;

import br.senai.sp.info132.console.Programa;

public class Exercicio03 extends Programa {

	@Override
	public void inicio() {

		int valor1;
		int valor2;
		
		valor1 = leInteiro("Digite valor 1");
		valor2 = leInteiro("Digite valor 2");
		
		if (valor1 % valor2 == 0){
			escreva("É divisível");
		}else{
			escreva("Não é divisível");
		}

	}

}
