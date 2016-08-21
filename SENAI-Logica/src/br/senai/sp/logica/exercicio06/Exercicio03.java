package br.senai.sp.logica.exercicio06;

import br.senai.sp.info132.console.Programa;

public class Exercicio03 extends Programa {

	@Override
	public void inicio() {

			String nome;
			char sexo;
			double nota1;
			double nota2;
			double nota3;
			int numeroFaltas;
			
			double mediaM = 0;
			double mediaF = 0;
			
			int numeroAlunoM = 0;
			int numeroAlunoF = 0;
			
			double numeroReprovadoMediaM = 0;
			double numeroReprovadoMediaF = 0;
			double numeroReprovadoFaltaM = 0;
			double numeroReprovadoFaltaF = 0;			
			
			double reprovacaoGeral;

			//calculo / (double)(cnt == 0 ? 1 : cnt);
			//            cast
			
			do{
				
				nome = leTexto("Informe o seu nome");
				
				if (!nome.equals("fim")){
					
					double mediaAluno;
					byte tipoAprovacaoReprovacao;
					
					sexo = leCaracter("Informe o Sexo (M/F)");
					nota1 = leReal("Informe a 1º nota");
					nota2 = leReal("Informe a 2º nota");
					nota3 = leReal("Informe a 3º nota");
					numeroFaltas = leInteiro("Informe o nº de faltas");
					
					mediaAluno = (nota1 + nota2 + nota3) / 3;
					escreva(nome + " está com media: " + mediaAluno + " ");
					escreva("com a situação: ");
					
					if (numeroFaltas > 15){
						tipoAprovacaoReprovacao = 1;
						escrevaL("Reprovado por Faltas");
					}else{
						if (mediaAluno >= 7.00){
							tipoAprovacaoReprovacao = 0;
							escrevaL("Aprovado");
						}else{
							tipoAprovacaoReprovacao = 2;
							escrevaL("Reprovado por Média");
						}					
					}
	
					if (sexo == 'M'){
						numeroAlunoM ++;
						mediaM += mediaAluno;
						if (tipoAprovacaoReprovacao == 1)
							numeroReprovadoFaltaM ++;
						if (tipoAprovacaoReprovacao == 2)
							numeroReprovadoMediaM ++;	
						
					}else if(sexo == 'F'){
						numeroAlunoF ++;
						mediaF += mediaAluno;
						if (tipoAprovacaoReprovacao == 1)
							numeroReprovadoFaltaF ++;
						if (tipoAprovacaoReprovacao == 2)
							numeroReprovadoMediaF ++;	

					}
				}
				
			}while (!nome.equals("fim"));
	
			mediaM = mediaM / (numeroAlunoM);
			mediaF = mediaF / (numeroAlunoF);
			
			reprovacaoGeral = numeroReprovadoMediaM + numeroReprovadoFaltaM + numeroReprovadoMediaF + numeroReprovadoFaltaF;
			reprovacaoGeral /=  (numeroAlunoF + numeroAlunoM);
			reprovacaoGeral *=  100;
			
			numeroReprovadoMediaM = (numeroReprovadoMediaM / numeroAlunoM) * 100;
			numeroReprovadoMediaF = (numeroReprovadoMediaF / numeroAlunoF) * 100;
			numeroReprovadoFaltaM = (numeroReprovadoFaltaM / numeroAlunoM) * 100;
			numeroReprovadoFaltaF = (numeroReprovadoFaltaF / numeroAlunoF) * 100;
			
			escrevaL("Média Masculino ", mediaM);
			escrevaL("Média Feminino ", mediaF);
			escrevaL("% reprovação p/ média Masculino: ", numeroReprovadoMediaM);
			escrevaL("% reprovação p/ média Feminino: ", numeroReprovadoMediaF );
			escrevaL("% reprovação p/ falta Masculino: ", numeroReprovadoFaltaM);
			escrevaL("% reprovação p/ falta Feminino: ", numeroReprovadoFaltaF);
			escrevaL("% reprovação: ", reprovacaoGeral);

			
	}

}
