package br.senai.sp.logica.exercicio05;

import br.senai.sp.info132.console.Programa;

public class Exercicio04 extends Programa {

	@Override
	public void inicio() {
	
		int quantNumeros;
		int maiorNumero = 0;
		int numero;
		
		quantNumeros = leInteiro("Informe a quantidade");
		
		for (int i = 0; i < quantNumeros; i++) {
			numero = leInteiro("Informe um nº");
			if (numero > maiorNumero){
				maiorNumero = numero;
			}
		}

		escrevaL("O maior: ",maiorNumero );
		
	}

}
