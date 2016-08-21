package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex01a extends Programa {
	public void inicio() {
		double media = leInteiro("Informe a 1ª nota");
		media += leInteiro("Informe a 2ª nota");
		media += leInteiro("Informe a 3ª nota");
		media += leInteiro("Informe a 4ª nota");
		media /= 4;
		
		escrevaL("Média: ", media);
		
		if(media >= 7) {
			escrevaL("Aprovado");
		} else {
			escrevaL("Reprovado");
		}
	}
}
