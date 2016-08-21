package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {
	public void inicio() {
		double qtdM = 0; // quatidade de Homens
		double qtdF = 0; // quantidade de Mulheres
		double mediaM = 0; // media Masculina
		double mediaF = 0; // media Feminina
		int qtdRepMediaM = 0; // quantidade de Reporvações por Media Homens
		int qtdRepMediaF = 0; // quantidade de Reporvações por Media Mulheres
		int qtdRepFaltaM = 0; // quantidade de Reporvações por Faltas Homens
		int qtdRepFaltaF = 0; // quantidade de Reporvações por Faltas Mulheres
		
		String nome = leTexto("Informe o seu Nome");
		
		while(!nome.equals("fim")) {
			char sexo = Character.toUpperCase(leCaracter("Informe o Sexo (M/F)"));
			double media = 0;
			for (int i = 0; i < 3; i++)
				media += leReal("Informe a ", i+1, "ª nota");
			media /= 3;
			int faltas = leInteiro("Informe o nº de faltas");
			
			String situacao = "";

			if(sexo == 'M') { qtdM++; mediaM += media; }
			else { qtdF++; mediaF += media; } 
			
			if(faltas > 15) {
				situacao = "Reprovad";
				if(sexo == 'M') { qtdRepFaltaM++; situacao += "o por Faltas"; }
				else { qtdRepFaltaF++; situacao += "a por Faltas"; }
			} else if(media < 7) {
				situacao = "Reprovad";
				if(sexo == 'M') { qtdRepMediaM++; situacao += "o por Média"; }
				else { qtdRepMediaF++; situacao += "a por Média"; }
			} else {
				situacao = sexo == 'M' ? "Aprovado" : "Aprovada";
			}
			
			escrevaL(nome, " está com média: ", media, " com a situação: ", situacao);
			
			nome = leTexto("Informe o seu Nome");
		}
		double qtdAlunos = qtdM + qtdF;
		double qtdReprovacao = qtdRepFaltaF + qtdRepFaltaM + qtdRepMediaF + qtdRepMediaM;
		if(qtdAlunos > 0) {
			escrevaL("Média Masculino: ", mediaM / qtdM);
			escrevaL("Média Feminino: ", mediaF / qtdF);
			escrevaL("% reprovação p/ média Masculino: ", qtdRepMediaM * 100 / (double)(qtdM == 0 ? 1 : qtdM), "%");
			escrevaL("% reprovação p/ média Feminino: ", qtdRepMediaF * 100 / (double)(qtdF == 0 ? 1 : qtdF), "%");
			escrevaL("% reprovação p/ falta Masculino: ", qtdRepFaltaM * 100 / (double)(qtdM == 0 ? 1 : qtdM), "%");
			escrevaL("% reprovação p/ falta Feminino: ", qtdRepFaltaF * 100 / (double)(qtdF == 0 ? 1 : qtdF), "%");
			escrevaL("% reprovação : ", qtdReprovacao * 100 / qtdAlunos, "%");
		} else {
			escrevaL("Não existem alunos");
		}
	}
}
