package br.senai.sp.logica.exercicio05a;

import br.senai.sp.info132.console.Programa;

public class exercicio03 extends Programa {

	@Override
	public void inicio() {

		int idade = 0;
		int maiorIdade = 0;
		
		do {
			idade = leInteiro("Digite a sua idade: ");
			if (maiorIdade < idade)
				maiorIdade = idade;
		} while (idade != 0);
		
		escreva("O Vencedor tem " + maiorIdade + " anos de idade");

	}

}
