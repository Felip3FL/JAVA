package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	public void inicio() {
		int valor1 = leInteiro("Informe o 1º valor");
		int valor2 = leInteiro("Informe o 2º valor");
		
		if(valor1 == valor2) {
			escrevaL("São iguais");
		} else {
			escrevaL("São diferentes");
		}
	}
}
