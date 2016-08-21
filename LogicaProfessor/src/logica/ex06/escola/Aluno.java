package logica.ex06.escola;

public class Aluno {
	private String nome;
	private char sexo;
	private int[] notas = new int[3];
	private int faltas;
	
	private int indice = 0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void adicionaNota(int nota) {
		if(indice < notas.length) {
			notas[indice] = nota;
			indice++;
		}
	}
	
	public double getMedia() {
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		return media / notas.length;
	}

	public boolean isReprovadoFaltas() {
		return faltas > 15;
	}
	
	public boolean isReprovadoMedia() {
		return getMedia() < 7;
	}
	
	public Situacao getSituacao() {
		if(isReprovadoFaltas())
			return Situacao.REPROVADO_FALTAS;
		else if(isReprovadoMedia())
			return Situacao.REPROVADO_MEDIA;
		else
			return Situacao.APROVADO;
	}
	
	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

}
