package br.senai.sp.logica.exercicio05;

import br.senai.sp.info132.console.Programa;

public class Exercicio05 extends Programa {

	@Override
	public void inicio() {
		
		double salario = 0;
		
		do  {
			salario = leReal("Informe o Salário");
			if (salario <= 500.00){
				salario += salario * 0.2;
			}else{
				salario += salario * 0.1;
			}
			escrevaL("O Salário com aumento é de $",salario);
		}while(salario != 0);

	}

}
