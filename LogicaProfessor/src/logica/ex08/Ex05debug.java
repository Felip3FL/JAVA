package logica.ex08;

import br.senai.sp.info132.console.Programa;

public class Ex05debug extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe um nº para o calculo do Fatorial");
		escrevaL();
		escrevaL("\nO valor calculado com a função fatorial para ",
				num, " é: ", fatorial(num));
	}
	
	
	// f(n) = n * f(n-1) para n > 1
	// fat = 5 * 4 * 3 * 2 * 1;
	public int fatorial(int num) {
		int fat = 1;
		
		if(num > 1) {
			escrevaL("fat = ", num, " * fatorial(", num , "- 1);");
			fat = num * fatorial(num - 1);
		}
		
		escrevaL("return ", fat);
		return fat;
	}
}
