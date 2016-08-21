package br.senai.sp.logica.exercicio03;

import br.senai.sp.info132.console.Programa;

public class Exercicio06 extends Programa {

	@Override
	public void inicio() {

		int idade;
		
		idade = leInteiro("Digite sua idade");
		
		if (idade <= 10){
			escrevaL("Infantil");
		}else if(idade <= 15){
			escrevaL("Infanto");
		}else if(idade <= 18){
			escrevaL("Juvenil");
		}else{
			escrevaL("Adulto");
		}

	}

}
