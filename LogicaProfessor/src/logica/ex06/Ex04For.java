package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class Ex04For extends Programa {
	/*
	 * n! = n * (n - 1)!
	 * 
	 * 5! = 5 * 4 * 3 * 2 * 1
	 * 
	 * 5! = 5 * 4!
	 * 4! = 4 * 3!
	 * 3! = 3 * 2!
	 * 2! = 2 * 1!
	 */

		
	public void inicio() {
		int num = leInteiro("Informe um nº");
		int fat = 1;
		
		for (int i = 2; i <= num; i++) {
			fat *= i;
		}
		escrevaL("\nO Fatorial de ", num, " é ", fat);
	}
}
