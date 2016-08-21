package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Ex04a extends Programa {
	public void inicio() {
		double salBruto = leReal("Informe o Salário Bruto");
		double desconto;
		
		if(salBruto < 300) {
			desconto = salBruto * .05;
		} else if(salBruto <= 1200) {
			desconto = salBruto * .1;
		} else {
			desconto = salBruto * .15;
		}
		
		escrevaL("O Salário Líquido é de R$ ", salBruto - desconto);
	}
}


