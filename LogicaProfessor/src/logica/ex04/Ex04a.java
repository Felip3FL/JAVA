package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex04a extends Programa {
	public void inicio() {
		try {
			String nome = leTexto("Informe seu Nome");
			int nota1 = leNota("Informe a 1ª nota");
			int nota2 = leNota("Informe a 2ª nota");
			int nota3 = leNota("Informe a 3ª nota");
			int faltas = leInteiro("Informe o nº de faltas");

			double media = (nota1 + nota2 + nota3) / 3;

			if (faltas > 15) {
				escrevaL(nome, " você foi Reprovado por Faltas");
			} else if (media < 7) {
				escrevaL(nome, " você foi Reprovado por média");
			} else {
				escrevaL(nome, " você foi Aprovado");
			}
		} catch (Exception erro) {
			escrevaL(erro);
		}
	}

	public int leNota(String msg) throws Exception {
		int nota = leInteiro(msg);

		while (nota < 0 || nota > 10) {
			escrevaL("A Nota não pode ser menor que 0 nem maior que 10");
			char continua = leCaracter("Você deseja continuar? (S/N)");

			if (continua == 'S' || continua == 's')
				nota = leInteiro(msg);
			else
				throw new Exception("Programa Finalizado pelo Usuário");
		}

		return nota;
	}

}
