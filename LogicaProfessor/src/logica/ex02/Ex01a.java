package logica.ex02;

import br.senai.sp.info132.console.Programa;

public class Ex01a extends Programa {
	public void inicio() {
		double comp = leReal("Informe o Comprimento");
		double larg = leReal("Informe a Largura");
		double prof = leReal("Informe a Profundidade");
		double custo = comp * larg * prof * 45;
		
		escrevaL("O Preço final é de R$ ", custo);
	}
}
