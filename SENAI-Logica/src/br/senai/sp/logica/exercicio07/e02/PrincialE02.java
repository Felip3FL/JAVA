package br.senai.sp.logica.exercicio07.e02;

import br.senai.sp.info132.console.Programa;

public class PrincialE02 extends Programa {

	//Aqui são declarados os atributos de classe (Variaveis)
	
	@Override
	public void inicio() {
		
		Pessoas cadastro = new Pessoas();
		
		for (int i = 0; i < cadastro.getTamanhoVetor(); i++) {
			cadastro.setNome(leTexto("Infome o " + (i+1) + "º nome"));
		}
		
		String nomePesquisa = leTexto("Informe o nome a ser pesquisado");
		
		while(!nomePesquisa.equals("fim")){
			escrevaL(cadastro.pequisaNome(nomePesquisa));
			nomePesquisa = leTexto("Informe o nome a ser pesquisado");
		};
		
		escrevaL("TERMINOU");
		
	}

}
