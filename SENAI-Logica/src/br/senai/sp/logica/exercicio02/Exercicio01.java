package br.senai.sp.logica.exercicio02;

import br.senai.sp.info132.console.Programa;

public class Exercicio01 extends Programa {

	@Override
	public void inicio() {
		
		double largura;
		double comprimento;
		double profundidade;
		
		double calculo;
		
		//largura = 10;
		//comprimento = 25;
		//profundidade = 2;
		
		largura = leReal("Digite a Largura: ");
		comprimento = leReal("Digite a Comprimento: ");
		profundidade = leReal("Digite a Profundidade: ");		
		
		calculo = comprimento * largura * profundidade;
		calculo = calculo * 45.00;
		
		escrevaL("O preco final é de :",calculo);

	}

}
