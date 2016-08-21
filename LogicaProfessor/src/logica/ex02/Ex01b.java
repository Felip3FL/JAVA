package logica.ex02;

import br.senai.sp.info132.console.Programa;

public class Ex01b extends Programa {
	public void inicio() {
		double comp = leReal("Informe o Comprimento");
		double larg = leReal("Informe a Largura");
		double prof = leReal("Informe a Profundidade");
		
		escrevaL("O Preço final é de R$ " + (comp * larg * prof * 45));
	}
}
