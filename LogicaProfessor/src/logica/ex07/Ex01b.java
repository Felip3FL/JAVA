package logica.ex07;

//import java.util.Arrays;

import br.senai.sp.info132.console.Programa;

public class Ex01b extends Programa {
	
	public void inicio() {
		int[] num = new int[10];
		double media = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = leInteiro("Informe o ",i+1,"º nº");
			media += num[i];
		}
		
		media /= num.length;
		
		ordena(num);
		
		// até java 1.4
		for (int i = 0; i < num.length; i++) {
			if(num[i] > media) {
				escrevaL(num[i]);
			}
		}
	}
	
	public void ordena(int[] num) {
		boolean ordenado;
		do {
			ordenado = true;
			
			for (int i = 0; i < num.length - 1; i++) {
				if(num[i] > num[i + 1]) {
					int aux = num[i];
					num[i] = num[i + 1];
					num[i+ 1] = aux;
					ordenado = false;
				}
			}
		} while(!ordenado);
	}
}
