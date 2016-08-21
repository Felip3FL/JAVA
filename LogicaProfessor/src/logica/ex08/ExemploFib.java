package logica.ex08;

import br.senai.sp.info132.console.Programa;

// f(n) => f(n - 2) + f(n - 1) para n > 2
public class ExemploFib extends Programa {

	public void inicio() {
		int num = leInteiro("Informe um nº para o calculo de Fibonacci");
		while (num > 0) {
			escrevaL("O valor calculado com a função fibonnaci para ", num, " é: ", fibonacci(num));
			num = leInteiro("Informe um nº para o calculo de Fibonacci");
		}
	}

	public int fibonacci(int num) {
		int fib = 1;

		escrevaL("fibonacci(", num, ")");
		
		if (num > 2)
			fib = fibonacci(num - 2) + fibonacci(num - 1);

		return fib;
	}

}
