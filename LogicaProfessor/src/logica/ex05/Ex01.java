package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex01 extends Programa {
	public void inicio() {
		for (int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				escrevaL(i);
			}
		}
	}
}
