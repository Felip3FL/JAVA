package br.senai.sp.logica.exercicio03;

import br.senai.sp.info132.console.Programa;

public class Exercicio01 extends Programa {

	@Override
	public void inicio() {

		int valor1;
		int valor2;
		
		valor1 = leInteiro("Informe o valor 1");
		valor2 = leInteiro("Informe o valor 2");
		
		if (valor1 == valor2){
			escreva("Iguais");
		}
		else{
			escreva("Diferentes");	
		}

	}

}
