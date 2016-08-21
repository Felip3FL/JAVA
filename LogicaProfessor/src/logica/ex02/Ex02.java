package logica.ex02;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	public void inicio() {
		int entrada = leInteiro("Informe um nº");
		int saida = 0;
		
		saida = saida * 10 + entrada % 10;
		entrada = entrada / 10;

		saida = saida * 10 + entrada % 10;
		entrada = entrada / 10;

		saida = saida * 10 + entrada % 10;
		entrada = entrada / 10;

		
		escrevaL("Entrada: ", entrada, " - Saída: ", saida );
	}
}


