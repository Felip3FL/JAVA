package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex01c extends Programa {
	public void inicio() {
		for (int i = 2; i <= 1000; i += 2) {
			if(i % 40.0 == 0) {
				escrevaL(String.format("%04d ", i));
			} else {
				escreva(String.format("%04d ", i));
			}
		}
	}
}
