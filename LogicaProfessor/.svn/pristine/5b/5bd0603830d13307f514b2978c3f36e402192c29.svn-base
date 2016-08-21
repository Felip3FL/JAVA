package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {
	private Funcionario[] cadastro = new Funcionario[5];
	private int indice = 0;  // aponta para a próxima posição livre no vetor

	public void inicio() {
		
		String nome = leTexto("Informe o Nome");
		while (!nome.equals("fim")) {
			double salario = leReal("Informe o Salário");
			
			Funcionario func = new Funcionario();
			func.setNome(nome);
			func.setSalario(salario);
			
			adicionaFuncionario(func);
			
			nome = leTexto("Informe o Nome");
		}
		
		boolean ordenado;
		do {
			ordenado = true;
			
			for (int i = 0; i < indice - 1; i++) {
				if(cadastro[i].getSalario() < cadastro[i + 1].getSalario()) {
					Funcionario aux = cadastro[i];
					cadastro[i] = cadastro[i + 1];
					cadastro[i+ 1] = aux;
					ordenado = false;
				}
			}
		} while(!ordenado);

		
		escrevaL("\nFuncionario\tSalário");
		escrevaL("-----------\t-------");
		for (int i = 0;i < indice;i++) {
			Funcionario func = cadastro[i];
			escrevaL(func.getNome(), "\t\t", func.getSalario());
		}
		
	}
	
	private void adicionaFuncionario(Funcionario obj) {
		if(indice >= cadastro.length) {
			Funcionario[] novoCad = new Funcionario[cadastro.length + 5];
			for (int i = 0; i < cadastro.length; i++) {
				novoCad[i] = cadastro[i];
			}
			cadastro = novoCad;
		}
		cadastro[indice++] = obj;
	}
}
