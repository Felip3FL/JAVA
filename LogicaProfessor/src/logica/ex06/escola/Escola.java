package logica.ex06.escola;

public class Escola {
	Aluno[] sala = new Aluno[10];
	int indice = 0;
	
	public void adicionaAluno(Aluno obj) {
		if(indice >= sala.length) {
			Aluno[] novaSala = new Aluno[sala.length + 10];
			for (int i = 0; i < sala.length; i++) {
				novaSala[i] = sala[i];
			}
			sala = novaSala;
		}
		sala[indice] = obj;
		indice++;
	}

	public int qtdAlunos() {
		return indice;
	}
	
	public double percentReprov(char sexo, Situacao tipoReprovacao) {
		int qtdSexo = 0;
		int qtdReprovado = 0;
		
		for (int i = 0; i < qtdAlunos(); i++) {
			Aluno a = sala[i];
			
			if(a.getSexo() == sexo) {
				qtdSexo++;
				
				if(a.getSituacao() == tipoReprovacao) {
					qtdReprovado++;
				}
			}
		}
		
		return qtdReprovado * 100.0 / qtdSexo;
	}
	
	public double percentReprov() {
		int qtdReprovado = 0;
		
		for (int i = 0; i < qtdAlunos(); i++) {
			Aluno a = sala[i];
			
			if(a.getSituacao() != Situacao.APROVADO) {
				qtdReprovado++;
			}
		}
		
		return qtdReprovado * 100.0 / qtdAlunos();
	}
	
	public double mediaNotas(char sexo) {
		int qtdSexo = 0;
		double media = 0;
		
		for (int i = 0; i < qtdAlunos(); i++) {
			Aluno a = sala[i];
			
			if(a.getSexo() == sexo) {
				qtdSexo++;

				media += a.getMedia();
			}
		}
		
		return media / qtdSexo;
	}
	
}
