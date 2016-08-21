package br.senai.sp.logica.exercicio07.e01;

import br.senai.sp.info132.console.Programa;

//Leia dez valores inteiros quaisquer e
//mostre os que são maiores que a
//média dos valores coletados em ordem
//crescente.

public class PrincipalE01 extends Programa {

	@Override
	public void inicio() {
		
		Numeros vetorNumeros = new Numeros();

		for (int i = 0; i < vetorNumeros.getTamanhoVetor(); i++) {
			vetorNumeros.setValores(leInteiro("Digite o " + (i+1) + "º valor"));
		}
		
		//escrevaL("valor", vetorNumeros.getValores(5));		
		
		vetorNumeros.ordernaNumeros();
		
		for (int i = 0; i < vetorNumeros.getTamanhoVetor(); i++) {
			escrevaL(vetorNumeros.getValores(i));
		}
		
		//escrevaL("Média: ", vetorNumeros.getMedia());
		//escrevaL(vetorNumeros.getValoresMaiorMedia().length);
		
		escrevaL("\n\nValores maiores que a média em ordem crescente\n");
		
		for (int i = 0; i < vetorNumeros.getValoresMaiorMedia().length; i++) {
			escrevaL(vetorNumeros.getValoresMaiorMedia()[i]);
		}

	}

}
