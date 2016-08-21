package br.senai.sp.logica.exercicio03;

import br.senai.sp.info132.console.Programa;

public class Exercicio04 extends Programa {

	@Override
	public void inicio() {

		double salario;
		double desconto;
		
		salario = leReal("Digite o Salario");
	
		if (salario < 300){
			desconto = salario * 0.05;
		}else if (salario < 1200){
			desconto = salario * 0.10;
		}else{
			desconto = salario * 0.15;
		}
		
		escrevaL("Desconto: ",desconto);

	}

}
