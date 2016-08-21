package logica.ex02.exemplos;

import br.senai.sp.info132.console.Programa;

/*
 * Tabela de salarios
 * 
 * salários de   0 até  100 aumento de 10%
 * salários de 101 até  500 aumento de  7%
 * salários de 501 até 1000 aumento de  5%
 * salátios acima   de 1000 aumento de  2%
 */


public class Exemplo01 extends Programa {
	public void inicio() {
		double salario = leReal("Informe o seu salário");
		
		double novoSalario;
		
		// determinar o aumento salarial com base na tabela acima
		
		if(salario <= 100) {
			novoSalario = salario * 1.1;
		} else if(salario <= 500) {
			novoSalario = salario * 1.07;
		} else if(salario <= 1000) {
			novoSalario = salario * 1.05;
		} else {
			novoSalario = salario * 1.02;
		}
		
		escrevaL("O salário reajustado é de R$ ", novoSalario);
	}
}
