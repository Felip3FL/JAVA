package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {
	public void inicio() {
		double salBruto = leReal("Informe o Salário Bruto");
		double salLiquido;
		
		if(salBruto < 300) {
			salLiquido = salBruto * .95;
		} else if(salBruto <= 1200) {
			salLiquido = salBruto * .9;
		} else {
			salLiquido = salBruto * .85;
		}
		
		escrevaL("O Salário Líquido é de R$ ", salLiquido);
	}
}


