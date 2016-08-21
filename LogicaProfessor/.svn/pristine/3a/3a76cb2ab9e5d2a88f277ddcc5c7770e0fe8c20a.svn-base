package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class Ex02a extends Programa {
	public void inicio() {
		double salario1 = 0;
		double salario2 = 0;
		double salario3 = 0;
		double salario = leReal("Informe o Salário");

		while (salario > 0) {
			if (salario > salario1) {
				salario3 = salario2;
				salario2 = salario1;
				salario1 = salario;
			} else if (salario < salario1 && salario > salario2) {
				salario3 = salario2;
				salario2 = salario;
			} else if (salario < salario2 && salario > salario3) {
				salario3 = salario;
			}

			escrevaL("Salário 1: ", salario1);
			escrevaL("Salário 2: ", salario2);
			escrevaL("Salário 3: ", salario3);

			salario = leReal("Informe o Salário");
		}
		escrevaL("O 1º Salário: ", salario1);
		escrevaL("O 2º Salário: ", salario2);
		escrevaL("O 3º Salário: ", salario3);

	}
}
