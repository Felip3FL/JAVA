package br.senai.sp.logica.exercicio01;

import br.senai.sp.info132.console.Programa;

public class Exercicio03 extends Programa {

	@Override
	public void inicio() {
		
		double base;
		double altura;
		double area;
		
		base = leReal("Digite a base");
		altura = leReal("Digite a altura");

		area = (base * altura) / 2;
		
		escrevaL("A Área é de: ",area);
		
	}

}
