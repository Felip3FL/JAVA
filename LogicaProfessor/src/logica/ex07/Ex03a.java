package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex03a extends Programa {
	public void inicio() {
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = leInteiro("Informe o ",i+1,"º nº");			
		}
		
		Ordenador.ordena(num);
		
		escrevaL("\nNúmeros pares em ordem crescente");
		for (int i = 0;i < num.length;i++) {
			if(num[i] % 2 == 0) 
				escreva(num[i], " ");
		}
		
		Ordenador.ordena(num, Ordenador.DECRESCENTE);

		escrevaL("\n\nNúmeros impares em ordem decrescente");
		for (int i = 0;i < num.length;i++) {
			if(num[i] %2 != 0)
				escreva(num[i], " ");
		}
	}
}
