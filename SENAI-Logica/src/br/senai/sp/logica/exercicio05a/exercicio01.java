package br.senai.sp.logica.exercicio05a;

import br.senai.sp.info132.console.Programa;

public class exercicio01 extends Programa {

	@Override
	public void inicio() {
		
		double valorProduto = 0;
		double media = 0;
		int i = 0;
		
		do {
			media += valorProduto;
			i++;
			valorProduto = leReal("Digite o valor do Produto");
		}while (valorProduto != 0);
		escrevaL("Media: ", media / i);
	}

}
