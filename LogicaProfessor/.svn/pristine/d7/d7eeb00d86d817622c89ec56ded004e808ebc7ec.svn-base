package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Ex06b extends Programa {
	public void inicio() {
		int idade = leIdade();
		
		if (idade > 0) {

			String categoria;

			if (idade <= 10) {
				categoria = "Infantil";
			} else if (idade <= 15) {
				categoria = "Infanto";
			} else if (idade <= 18) {
				categoria = "Juvenil";
			} else {
				categoria = "Adulto";
			}

			escrevaL("Sua Categoria é: ", categoria);
		} else {
			escrevaL("O Programa foi finalizado por excesso de tentativas");
		}
	}
	
	/**
	 * @author Professor
	 * 
	 * Este método solicita a idade e gera mensagens se a mesma 
	 * for um valor negativo ou zero (0)
	 * 
	 * @return  A idade informada ou um valor negativo indicando a falha
	 * @since 2016
	 * @version 1.0
	 */
	public int leIdade() {
		int informacao = leInteiro("Informe a sua Idade");
		int cnt = 0;
		while (informacao <= 0 && cnt < 2) {
			escrevaL("A idade mínima é 1,\nfavor informe a idade novamente");

			informacao = leInteiro("Informe a sua Idade");
			cnt++;
		}
		
		return informacao;
	}
}
