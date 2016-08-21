package logica.ex05;

import java.util.stream.IntStream;

import br.senai.sp.info132.console.Programa;

public class Ex04x extends Programa {
	public void inicio() {
		int qtd = leInteiro("Informe a Quantidade");

		if (qtd > 0) {
			escrevaL("O Maior: ", IntStream.rangeClosed(1, qtd)
					.map(n -> leInteiro("Informe um nº"))
					.max()
					.getAsInt());
		} else {
			escrevaL("Foi solicitado a finalização do programa");
		}
	}
}
