package logica.ex08;

import br.senai.sp.info132.console.Programa;

// f(n) => 2 * f(n - 1) + 1 para n > 1
public class ExemploHanoi extends Programa {
	public void inicio() {
		int num = leInteiro("Informe um nº para o calculo de Hanoi");
		while (num > 0) {
			escrevaL("O valor calculado com a função hanoi para ", num, " é: ", hanoi(num));
			num = leInteiro("Informe um nº para o calculo de Hanoi");
		}
	}

	public int hanoi(int num) {
		int han = 1;
		
		escrevaL("hanoi(", num, ")");
		
		if(num > 1)
			han = 2 * hanoi(num - 1) + 1;
		
		escrevaL("return ", han);
		return han;
	}
}
