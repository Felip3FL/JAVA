package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {
	public void inicio() {
		int qtd = leInteiro("Informe a Quantidade");

		if (qtd > 0) {
			int num = leInteiro("Informe o 1º nº");
			int oMaior = num;

			for (int i = 1; i < qtd; i++) {
				num = leInteiro("Informe o ", i + 1, "º nº");

				if (num > oMaior)
					oMaior = num;
			}

			escrevaL("O Maior: ", oMaior);
		} else {
			escrevaL("Foi solicitado a finalização do programa");
		}
	}
}
