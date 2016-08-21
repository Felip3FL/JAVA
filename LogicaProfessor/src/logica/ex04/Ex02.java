package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	public void inicio() {
		int a = leInteiro("Informe o lado a");
		int b = leInteiro("Informe o lado b");
		int c = leInteiro("Informe o lado c");
		
		if(a + b > c  &&  b + c > a && a + c > b) {
			if(a == b && b == c) {
				escrevaL("É um triângulo Eqüilátero");
			} else if (a != b && a != c && b != c) {
				escrevaL("É um triângulo Escaleno");
			} else if (a == b || a == c || b == c){
				escrevaL("É um triângulo Isósceles");
			}
		} else {
			escrevaL("Os lados informados não formam um triângulo");
		}
	}
}
