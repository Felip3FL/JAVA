package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex05_01 extends Programa {
	public void inicio() {
		double total = 0;
		int qtd = 0;

		double preco = leReal("Informe o preço do Produto");
		while (preco > 0) {
			qtd++;
			total += preco;
			preco = leReal("Informe o preço do Produto");
		}
		escrevaL("A média de Preços é de R$", total / qtd);
	}
}
