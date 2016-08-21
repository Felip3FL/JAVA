package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex05_03 extends Programa {
	public void inicio() {
		int idade = leInteiro("Informe a sua Idade");
		int oMaisIdoso = idade;
		
		while(idade > 0) {
			if(idade > oMaisIdoso)
				oMaisIdoso = idade;
			
			idade = leInteiro("Informe a sua Idade");
		}
		
		escrevaL("O Ganhador foi a pessoa com ", oMaisIdoso, " anos de idade");
	}
}
