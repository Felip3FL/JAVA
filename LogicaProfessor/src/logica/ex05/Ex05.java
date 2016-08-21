package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex05 extends Programa {
	@Override
	public void inicio() {
		double salario = leReal("Informe o Salário");
		
		while(salario > 0) {
			if(salario <= 500) {
				salario *= 1.2;
			} else {
				salario *= 1.1;
			}
			escrevaL("O Salário com aumento é de R$", salario);
				
			salario = leReal("Informe o Salário");
		}
		escrevaL("Fim");
	}
}
