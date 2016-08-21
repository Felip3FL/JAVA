package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Ex06a extends Programa {
	public void inicio() {
		int idade = leInteiro("Informe a sua Idade");
		int cnt = 0;
		while (idade <= 0 && cnt < 2) {
			escrevaL("A idade mínima é 1,\nfavor informe a idade novamente");

			idade = leInteiro("Informe a sua Idade");
			cnt++;
		}

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
}
