package br.senai.sp.logica.exercicio04;

import br.senai.sp.info132.console.Programa;
public class Exercicio02 extends Programa {

	@Override
	public void inicio() {
		
		int a;
		int b;
		int c;
		
		a = leInteiro("Informe o 1º lado");
		b = leInteiro("Informe o 2º lado");
		c = leInteiro("Informe o 3º lado");
		
		if (a +b > c && b + c > a && a +c > b){

			if(a == b && b ==c){
				escrevaL("Equilatero");
			}else if (a != b && a != c && b != c) {
				escrevaL("Escaleno");
			}else if (a == b || a ==c || b ==c){
				escrevaL("Isosceles2");
			}
			
		}else {
			escrevaL("Os lados informados não formam um triângulo");
		}
		


	}

}
