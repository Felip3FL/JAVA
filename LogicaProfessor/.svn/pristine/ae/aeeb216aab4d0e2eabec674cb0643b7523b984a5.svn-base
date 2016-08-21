package logica.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.senai.sp.info132.console.Programa;

public class Ex04x extends Programa {
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
		for (Funcionario func : cadastro) {
			escrevaL(func.toString());
		}

	}

}