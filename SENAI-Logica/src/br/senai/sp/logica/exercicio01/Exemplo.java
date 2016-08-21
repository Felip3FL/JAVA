package br.senai.sp.logica.exercicio01;

import br.senai.sp.info132.console.Programa;

public class Exemplo extends Programa {
	public void inicio() {
		String nome = leTexto("Informe seu Nome");
		int idade = leInteiro("Imforme sua Idade");
		double transporte = leReal("Informe o seu custo de Transporte");
		char continua = leCaracter("Quer mostrar o resultado? (S/N)");
		
		escrevaL("Nome: ", nome, " Idade: ", idade);
		escrevaL("Custo de Transporte: R$", transporte);
		escrevaL("Sua resposta foi: ", continua);
		
	}
}
