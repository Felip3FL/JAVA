package br.senai.sp.logica.exercicio04;

import br.senai.sp.info132.console.Programa;

public class Exercicio01 extends Programa {

	/*
	 * Crie um programa para calcular
	 * a média aritmética entre 4 notas
	 * de um aluno e mostrar a
	 * situação desse aluno, que pode
	 * ser aprovado ou reprovado. A
	 * média para aprovação é a partir
	 * de 7
	 * 
	 * @see br.senai.sp.info132.console.Programa#inicio()
	 */

	@Override
	public void inicio() {
		int[] notas = {0,0,0,0};
		int media;
		
		media = 0;
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = leInteiro("Digite a nota " + (i+1) + ": ",notas[i]);
			media +=  notas[i];
		}
	
		media = media / notas.length ;
		
		escrevaL("Media: ",media);
		if (media < 7){
			escrevaL("REPROVADO");
		}else {
			escrevaL("APROVADO");
		}
		

	}

}
