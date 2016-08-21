package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {
	public void inicio() {
		String nome = leTexto("Informe seu Nome");
		int nota1 = leInteiro("Informe a 1ª nota");
		int nota2 = leInteiro("Informe a 2ª nota");
		int nota3 = leInteiro("Informe a 3ª nota");
		int faltas = leInteiro("Informe o nº de faltas");
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if(faltas > 15) {
			escrevaL(nome, " você foi Reprovado por Faltas");
		} else if(media < 7) {
			escrevaL(nome, " você foi Reprovado por média");
		} else {
			escrevaL(nome, " você foi Aprovado");
		}
	}
}
