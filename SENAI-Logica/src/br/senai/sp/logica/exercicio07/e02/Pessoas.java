package br.senai.sp.logica.exercicio07.e02;

	//VARIAVEIS que são declaradas na classe, se torna ATRIBUTO

public class Pessoas {
	
	//VARIAVEIS
	private String nome[] = new String[10];
	int posicaoVetor = 0;
	
	public void setNome(String pessoas) {
		this.nome[posicaoVetor] = pessoas;
		posicaoVetor++;
	}
	
	public String getNome(int posicao) {
		return nome[posicao];
	}
	
	public int getTamanhoVetor(){
		return nome.length;
	}
	
	public String pequisaNome(String nomePesquisar){
		
		for (int i = 0; i < nome.length;i++) {
			if (nome[i].equals(nomePesquisar)){
				return "O nome: " + nomePesquisar + " foi encontrado";
			}
		}

		return "O nome: " + nomePesquisar + " não foi encontrado";
	}
	
}
