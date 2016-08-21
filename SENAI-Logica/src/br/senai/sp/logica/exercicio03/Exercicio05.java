package br.senai.sp.logica.exercicio03;

import br.senai.sp.info132.console.Programa;

public class Exercicio05 extends Programa {

	@Override
	public void inicio() {

		int valor1;
		int valor2;
		
		valor1 = leInteiro("Digite o valor 1");
		valor2 = leInteiro("Digite o valor 2");
		
		if (valor1 > valor2){
			escrevaL("Valor Maior:",valor1);
			escrevaL("Valor Menor:",valor2);
		}else{
			escrevaL("Valor Maior:",valor2);
			escrevaL("Valor Menor:",valor1);			
		}
			

	}

}
