package logica.ex07;

import java.util.Arrays;

//import java.util.Arrays;

import br.senai.sp.info132.console.Programa;

public class Ex01x extends Programa {
	
	public void inicio() {
		int[] num = new int[10];
		double media = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = leInteiro("Informe o ",i+1,"º nº");
			media += num[i];
		}
		
		media /= num.length;
		
//		int[] novoNum = ordena(num);
//		
//		// até java 1.4
//		for (int i = 0; i < novoNum.length; i++) {
//			if(novoNum[i] > media) {
//				escrevaL(novoNum[i]);
//			}
//		}
		
		for (int novoNum : ordena(num)) {
			if(novoNum > media) {
				escrevaL(novoNum);
			}
		}

		int[] num2 = ordena(num);
		
		// até java 1.4
		for (int i = 0; i < num2.length; i++) {
			int novoNum = num2[i];
			
			if(novoNum > media) {
				escrevaL(novoNum);
			}
		}

	
	}
	
	public int[] ordena(int[] vetor) {
//		int[] dados = new int[vetor.length];
//		for (int i = 0; i < dados.length; i++) {
//			dados[i] = vetor[i];
//		}
		
		int[] dados = Arrays.copyOf(vetor, vetor.length);
		
		boolean ordenado;
		do {
			ordenado = true;
			
			for (int i = 0; i < dados.length - 1; i++) {
				if(dados[i] > dados[i + 1]) {
					int aux = dados[i];
					dados[i] = dados[i + 1];
					dados[i+ 1] = aux;
					ordenado = false;
				}
			}
		} while(!ordenado);
		
		return dados;
	}
}
