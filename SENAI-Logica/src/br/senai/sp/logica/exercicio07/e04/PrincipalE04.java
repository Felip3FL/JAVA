package br.senai.sp.logica.exercicio07.e04;

import br.senai.sp.info132.console.Programa;

public class PrincipalE04 extends Programa {

	public void inicio() {
		
		int i = 0;
		Empresa empresaX = new Empresa();
		
		String nome = leTexto("Digite o " + (i+1) + "º nome");
		
		while(!nome.equals("fim")){
			Funcionario empregado = new Funcionario();
			empregado.setNome(nome);
			empregado.setSalario(leReal("Digite o " + (i+1) + "º salario"));
			empresaX.addEmpregado(empregado);
			i++;
			
			nome = leTexto("Digite o " + (i+1) + "º nome");
		}
		
		for (int j = 0; j < i; j++) {
			escrevaL("Funcionario: ", empresaX.getEmpregado()[j].getNome());
		}
		
	}

}
