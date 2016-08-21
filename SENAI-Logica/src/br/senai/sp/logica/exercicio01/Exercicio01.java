package br.senai.sp.logica.exercicio01;

import br.senai.sp.info132.console.Programa;

public class Exercicio01 extends Programa {

	@Override
	public void inicio() {
		double valor1;
		double valor2;
		double resultado;

		valor1 = leReal("Digite o valor 1");
		valor2 = leReal("Digite o valor 1");

		resultado = Math.pow(valor1, valor2);

		escrevaL("Resultado: ", resultado);

	}

}
