package logica.ex08;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	public void inicio() {
		for(;;) {
			int num = leInteiro("Informe um nº");
			int num2 = inverso(num);
			escrevaL("O inverso do nº ", num, " é ", num2);
		}				
	}

	public static int inverso(int num) {
		int inv = 0;
		
		while(num > 0) {
			inv = inv * 10 + num % 10;
			num /= 10;
		}
		
		return inv;
	}
}
