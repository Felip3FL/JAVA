package logica.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.senai.sp.info132.console.Programa;

public class Ex04a extends Programa {
	private List<Funcionario> cadastro = new ArrayList<>();

	public void inicio() {

		String nome = leTexto("Informe o Nome");
		while (!nome.equals("fim")) {
			double salario = leReal("Informe o Salário");

			Funcionario func = new Funcionario();
			func.setNome(nome);
			func.setSalario(salario);

			cadastro.add(func);

			nome = leTexto("Informe o Nome");
		}

		Collections.sort(cadastro, Comparator.comparing(Funcionario::getSalario).reversed());

		escrevaL("\nFuncionario\tSalário");
		escrevaL("-----------\t-------");
		for (int i = 0; i < cadastro.size(); i++) {
			Funcionario func = cadastro.get(i);
			escrevaL(func.getNome(), "\t\t", func.getSalario());
		}

	}

}