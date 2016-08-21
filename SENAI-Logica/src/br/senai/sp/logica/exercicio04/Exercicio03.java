package br.senai.sp.logica.exercicio04;

import br.senai.sp.info132.console.Programa;

public class Exercicio03 extends Programa {

	@Override
	public void inicio() {
		
		double a;
		double b;
		double c;
		
		double x1;
		double x2;
		
		//a = leReal("Informe o valor de a");
		//b = leReal("Informe o valor de b");
		//c = leReal("Informe o valor de c");
		
		a = 1;
		b = -5;
		c = 6;

		x1 = (- b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2* a);
		x2 = (- b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2* a);
		
		escrevaL("X1 ",x1);
		escrevaL("X2 ",x2);
				
	}
	


}
