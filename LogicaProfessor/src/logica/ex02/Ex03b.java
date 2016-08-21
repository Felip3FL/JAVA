package logica.ex02;

import br.senai.sp.info132.console.Programa;

public class Ex03b extends Programa {
	public void inicio() {
		int[] nota = { 100, 50, 20, 10, 5, 2, 1 };
		
		int valor = leInteiro("Informe o Valor de Saque");
		
		int i = 0; 
		while(i < nota.length) {
			escrevaL("Notas de ", nota[i], ": ", valor / nota[i]);
			valor = valor % nota[i];
			
			i++;
		}
	}
}
