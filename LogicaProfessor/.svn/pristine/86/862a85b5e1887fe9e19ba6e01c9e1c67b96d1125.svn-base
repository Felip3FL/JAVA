package logica.ex06.escola;

import br.senai.sp.info132.console.Programa;

public class Ex03x extends Programa {
	@Override
	public void inicio() {
		Escola escola = new Escola();

		String nome = leTexto("Informe o Nome");

		while (!nome.equals("fim")) {
			Aluno obj = new Aluno();
			obj.setNome(nome);
			obj.setSexo(leCaracter("Informe o Sexo (M/F)"));
			for (int i = 0; i < 3; i++)
				obj.adicionaNota(leInteiro("Informe a ", i + 1, "ª nota"));
			obj.setFaltas(leInteiro("Informe as Faltas"));

			escola.adicionaAluno(obj);

			escrevaL(nome, " está com média: ", obj.getMedia(), " com a situação: ", obj.getSituacao().toString());

			nome = leTexto("Informe o Nome");
		}

		if(escola.qtdAlunos() > 0) {
			escrevaL("Média Masculino: ", escola.mediaNotas('M'));
			escrevaL("Média Feminino: ", escola.mediaNotas('F'));
			escrevaL("% reprovação p/ média Masculino: ", escola.percentReprov('M', Situacao.REPROVADO_MEDIA), "%");
			escrevaL("% reprovação p/ média Feminino: ", escola.percentReprov('F', Situacao.REPROVADO_MEDIA), "%");
			escrevaL("% reprovação p/ falta Masculino: ", escola.percentReprov('M', Situacao.REPROVADO_FALTAS), "%");
			escrevaL("% reprovação p/ falta Feminino: ", escola.percentReprov('F', Situacao.REPROVADO_FALTAS), "%");
			escrevaL("% reprovação : ", escola.percentReprov(), "%");
		} else {
			escrevaL("Não existem alunos");
		}

	}
}
