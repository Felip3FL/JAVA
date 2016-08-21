package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex05_02a extends Programa {
	public void inicio() {
		int[] cargos = { 0, 0, 0, 0, 0 };
		String[] nomesDosCargos = { "Analistas", "Programadores", "Usuários", "Gestores", "Outros" };
		
		int op = leOpcao();
		
		while(op != 0) {
			if(op >= 1 && op <= 5) {
				cargos[op - 1]++;
			} else {
				escrevaL("Cargo Inválido, tente novamente");
			}
			
			op = leOpcao();
		}
		
		escrevaL("\nParticipantes do Congresso\n");
		for (int i = 0; i < cargos.length; i++) {
			escrevaL(nomesDosCargos[i], ": " , cargos[i]);
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
