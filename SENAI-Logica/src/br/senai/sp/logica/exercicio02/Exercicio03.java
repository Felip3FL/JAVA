package br.senai.sp.logica.exercicio02;

import br.senai.sp.info132.console.Programa;

public class Exercicio03 extends Programa {

	@Override
	public void inicio() {
		
		int valor;
		int qtdeNota;
		
		valor = leInteiro("Digite o valor:");
		//valor = 541;
		
		qtdeNota = (valor / 100);
		valor = valor - (qtdeNota * 100);
		escrevaL("Nota de 100: ",qtdeNota );
		
		qtdeNota = (valor / 50);
		valor = valor - (qtdeNota * 50);
		escrevaL("Nota de 50: ",qtdeNota );
		
		qtdeNota = (valor / 20);
		valor = valor - (qtdeNota * 20);
		escrevaL("Nota de 20: ",qtdeNota );
		
		qtdeNota = (valor / 10);
		valor = valor - (qtdeNota * 10);
		escrevaL("Nota de 10: ",qtdeNota );
		
		qtdeNota = (valor / 2);
		valor = valor - (qtdeNota * 2);
		escrevaL("Nota de 2: ",qtdeNota );
		
		qtdeNota = (valor / 1);
		valor = valor - (qtdeNota * 1);
		escrevaL("Nota de 1: ",qtdeNota );

	}

}
