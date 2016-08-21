package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex01d extends Programa {
	public void inicio() {
		for (int i = 2; i <= 1000; i += 2) {
			escreva(i % 40.0 == 0 ?
				 String.format("%04d%n", i) : 
					 String.format("%04d ", i));
		}
	}
}
