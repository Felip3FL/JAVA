package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex05_02b extends Programa {
	public void inicio() {		
		Cargo[] listaDosCargos = { 
				new Cargo("Analistas"), 
				new Cargo("Programadores"), 
				new Cargo("Usuários"), 
				new Cargo("Gestores"), 
				new Cargo("Outros")
		};
		
		int op = leOpcao();
		
		while(op != 0) {
			if(op >= 1 && op <= 5) {
				Cargo cargoSelecionaro = listaDosCargos[op - 1];
				cargoSelecionaro.somaQuantidade();
			} else {
				escrevaL("Cargo Inválido, tente novamente");
			}
			
			op = leOpcao();
		}
		
		escrevaL("\nParticipantes do Congresso\n");
		for (int i = 0; i < listaDosCargos.length; i++) {
			escrevaL(listaDosCargos[i].imprime());
		}
	}
	
	public int leOpcao() {
		escrevaL("\nCongresso de Hackers\n");
		escrevaL("1 - Analistas");
		escrevaL("2 - Programadores");
		escrevaL("3 - Usuários");
		escrevaL("4 - Gestores");
		escrevaL("5 - Outros");
		escrevaL("0 - para finalizar");
		
		return leInteiro("Selecione o seu Cargo");
	}
}

class Cargo {
	private String nome;
	private int quantidade;
	
	public Cargo(String _nome) {
		nome = _nome;
		quantidade = 0;
	}

	public void somaQuantidade() {
		quantidade++;
	}

	public String imprime() {
		return nome + ": " + quantidade;
	}
}



