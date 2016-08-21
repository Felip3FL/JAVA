package logica.ex05;

import java.util.stream.IntStream;

import br.senai.sp.info132.console.Programa;

public class Ex03x extends Programa {
	public void inicio() {
		int soma = IntStream.range(0, 5)
			.map(s -> s += leInteiro("Informe o nº"))
			.sum();
		
		escrevaL("A Soma: ", soma);
		escrevaL("A Média: ", soma / 5);
	}
}
