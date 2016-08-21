package br.senai.sp.logica.exercicio02;

import br.senai.sp.info132.console.Programa;

public class Exercicio02 extends Programa {

	@Override
	public void inicio() {

		int valor;
		int gerado;
		
		valor = leInteiro("Digite um número inteiro:");
		//valor = 123;
		
		gerado = valor % 10;
		//escrevaL("b1: ",gerado);
		gerado = gerado * 10;
		//escrevaL("b2: ",gerado);
		valor = valor / 10;
		//escrevaL("valor: ",valor);
		
		gerado = gerado + (valor % 10);
		//escrevaL("b2: ",gerado);
		gerado = gerado * 10;
		//escrevaL("b2: ",gerado);
		valor = valor / 10;
		//escrevaL("valor: ",valor);
		
		gerado = gerado + (valor % 10);
		//escrevaL("b2: ",gerado);
		//gerado = gerado * 10;
		//escrevaL("b2: ",gerado);
		//valor = valor / 10;
		//escrevaL("valor: ",valor);		
		
		escrevaL("Valor: ",gerado);

	}

}
