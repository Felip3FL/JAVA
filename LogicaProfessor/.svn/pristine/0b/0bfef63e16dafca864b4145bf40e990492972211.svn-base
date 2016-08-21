package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex05_01a extends Programa {
	public void inicio() {
		double total = 0;
		int qtd = 0;

		for(double preco = leReal("Informe o preço do Produto");
			preco > 0;
			qtd++, preco = leReal("Informe o preço do Produto")) {
			
			total += preco;
			
		}
		escrevaL("A média de Preços é de R$", total / qtd);
	}
}
