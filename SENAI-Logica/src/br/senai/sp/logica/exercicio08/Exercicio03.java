package br.senai.sp.logica.exercicio08;

import br.senai.sp.info132.console.Programa;

public class Exercicio03 extends Programa {

	@Override
	public void inicio() {

		int numeroConta = leInteiro("Digite o nº da conta");
		//int numeroConta = 25678;
		escrevaL("O dígito verificador para a conta " + numeroConta + " é ", getDigitoVerificado(numeroConta));
		
	}
	
	private int getDigitoVerificado(int numeroConta){
		
		int calculo = numeroAoContrario(numeroConta) + numeroConta;
		//escrevaL(calculo);
		calculo = multiplicacaoCadaDigito(calculo);
		//escrevaL(calculo);
		calculo = restoDivisao(calculo);
		//escrevaL(calculo);
		
		return calculo;
	}
	
	private int numeroAoContrario(int numeros){
		int aux=0;
		while (numeros > 0) {
			aux = aux * 10 + numeros % 10;
			numeros = numeros / 10;
		}

		return aux;
	}
	
	private int multiplicacaoCadaDigito(int numero){
		int aux = 0;
		for (int i = 1; i <= contNumeros(numero);i++){
			escrevaL("(" + getDigito(numero, i-1) + " x " + i + ")");
			aux = aux + (getDigito(numero, i-1) * i);
		}
		return aux;
	}
	
	private int contNumeros(int numeros){
		int aux=0;
		int qtdeNumeros = 0;
		while (numeros > 0) {
			aux = aux * 10 + numeros % 10;
			numeros = numeros / 10;
			qtdeNumeros++;
		}
		return qtdeNumeros ;
	}
	
	private int restoDivisao(int numero){
		return numero % 10;
	}
	
	private int getDigito(int numeros, int posicaoNumeroRequerido){
		int aux=numeros;
		int posicaoDigito = contNumeros(numeros)-1;
		while (aux > 0) {
			if (posicaoDigito == posicaoNumeroRequerido)
				return aux % 10;
			aux = aux / 10; 
			posicaoDigito --;
		}
		return 9;
	}
	
	
}
