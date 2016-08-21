package br.senai.sp.logica.exercicio04;

import br.senai.sp.info132.console.Programa;

public class Exercicio04 extends Programa {

	@Override
	public void inicio() {
	
		String nome;
		int nota1;
		int nota2;
		int nota3;
		int media;
		int falta;
		
		nome = leTexto("Informe o nome");
		nota1 = leInteiro("Informe a 1º nota");
		nota2 = leInteiro("Informe a 2º nota");
		nota3 = leInteiro("Informe a 3º nota");
		falta = leInteiro("Informe o nº de faltas");

		media = nota1 + nota2 + nota3;
		media = media / 3;
		
		if (falta > 15){
			escrevaL(nome + ", você foi: REPROVADO POR FALTAS");
		}else if(media < 7){
			escrevaL(nome + ", você foi: REPROVADO POR MEDIA");
		}else{
			escrevaL(nome + ", você foi: APROVADO");
		}
		
	}

}
