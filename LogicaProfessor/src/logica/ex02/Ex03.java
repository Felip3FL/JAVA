package logica.ex02;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {
	public void inicio() {
		int valor = leInteiro("Informe o Valor de Saque");
		
		escrevaL("Notas de 100: ", valor / 100);
		valor = valor % 100;
		escrevaL("Notas de 50: ", valor / 50);
		valor = valor % 50;
		escrevaL("Notas de 20: ", valor / 20);
		valor = valor % 20;
		escrevaL("Notas de 10: ", valor / 10);
		valor = valor % 10;
		escrevaL("Notas de 5: ", valor / 5);
		valor = valor % 5;
		escrevaL("Notas de 2: ", valor / 2);
		valor = valor % 2;
		escrevaL("Notas de 1: ", valor);
	}
}
