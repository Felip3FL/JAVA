package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex02a extends Programa {
	public void inicio() {
		int num1 = leInteiro("Informe o 1º nº");
		int num2 = leInteiro("Informe o 2º nº");
		
		if(num1 > num2) {
			int aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		if(num1 % 2 == 0)
			num1++;
		
		for (int i = num1; i <= num2; i += 2) {
			escrevaL(i);
		}
	}
}
