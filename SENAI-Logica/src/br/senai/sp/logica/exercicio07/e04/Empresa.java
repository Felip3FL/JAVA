package br.senai.sp.logica.exercicio07.e04;

public class Empresa {
	
	private Funcionario[] empregado = new Funcionario[2];
	private int posicaoVetor = 0;
	
	public void addEmpregado(Funcionario empregado) {
		this.empregado[posicaoVetor] = empregado;
		posicaoVetor++;
	}
	
	public Funcionario[] getEmpregado() {
		return empregado;
	}
	
}
