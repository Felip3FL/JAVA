package logica.ex04;

import br.senai.sp.info132.console.Programa;

import static java.lang.Math.*;

public class Ex03 extends Programa {
	public void inicio() {
		int a = leInteiro("Informe o valor de A");
		int b = leInteiro("Informe o valor de B");
		int c = leInteiro("Informe o valor de C");
		
		double D = pow(b, 2) - 4 * a * c;
		if(D >= 0) {
			int x1 = (int) (( -b + sqrt(D) ) / 2 * a);
			int x2 = (int) (( -b - sqrt(D) ) / 2 * a);
			escrevaL("x'  = ", x1);
			escrevaL("x'' =  ", x2);
		} else {
			escrevaL("a raiz será um número complexo");
		}
	}
}
