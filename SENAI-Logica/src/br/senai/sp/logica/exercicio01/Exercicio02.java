package br.senai.sp.logica.exercicio01;

import br.senai.sp.info132.console.Programa;

public class Exercicio02 extends Programa {

	@Override
	public void inicio() {
		
		int valor1;
		int valor2;
		int valor3;
		int valor4;
		
		double resultado;
		
		valor1 = leInteiro("Digite a nota 1");
		valor2 = leInteiro("Digite a nota 1");
		valor3 = leInteiro("Digite a nota 1");
		valor4 = leInteiro("Digite a nota 1");
		
		resultado = (valor1 + valor2 + valor3 + valor4) / 4.0;
		
		escrevaL("A media é:", resultado);

	}

}
