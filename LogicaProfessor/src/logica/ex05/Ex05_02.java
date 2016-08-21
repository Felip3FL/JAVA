package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex05_02 extends Programa {
	public void inicio() {
		int analista = 0;
		int programador = 0;
		int usuario = 0;
		int gestor = 0;
		int outros = 0;
		
		String cargo = leTexto("Informe o seu Cargo").toLowerCase();
		while(!cargo.isEmpty()) {
			switch (cargo) {
			case "analista":
				analista++;
				break;
			case "programador":
				programador++;
				break;
			case "usuario":
				usuario++;
				break;
			case "gestor":
				gestor++;
				break;
			case "outros":
				outros++;
				break;
			default:
				escrevaL("Cargo Inválido, tente novamente");
				break;
			}
			
			cargo = leTexto("Informe o seu Cargo").toLowerCase();
		}
		
		escrevaL("\nParticipantes do Congresso\n");
		escrevaL("Analistas: ", analista);
		escrevaL("Programadores: ", programador);
		escrevaL("Usuários: ", usuario);
		escrevaL("Gestores: ", gestor);
		escrevaL("Outros: ", outros);
	}
}
