package logica.ex05;

import java.util.stream.IntStream;

import br.senai.sp.info132.console.Programa;

public class Ex02x extends Programa {
	public void inicio() {
		int num1 = leInteiro("Informe o 1º nº");
		int  num2 = leInteiro("Informe o 2º nº");
		
		if(num1 > num2) {
			int aux = num1;
			num1 = num2;
			num2 = aux;
		}
					
		IntStream.rangeClosed(num1, num2)
			.filter(i -> i %2 != 0)
			.forEach(this::escrevaL);
	}
}
