package br.senai.sp.logica.exercicio08;

import br.senai.sp.info132.console.Programa;

public class Exercicio05 extends Programa {

	@Override
	public void inicio() {

		int numero = leInteiro("Informe um nº para o calculo do fatorial");
		escrevaL("O valor calculado com a função fatorial para " + numero + " é " + fatorial(numero));
	
	}

	private int fatorial(int numero){
		
		return calculoFatorial(numero, numero-1);
	}
	
	private int calculoFatorial(int valor, int numeroAtual){
		if (numeroAtual > 0) {
			valor = valor * numeroAtual;
			valor = calculoFatorial(valor,numeroAtual-1);
		}
		
		return valor;

	}
	
	
}
