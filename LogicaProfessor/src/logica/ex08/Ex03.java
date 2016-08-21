package logica.ex08;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {
	@Override
	public void inicio() {
		for(;;) {
			int num = leInteiro("Informe o nº da conta");
			escrevaL("O dígito verificador para a conta ", num, " é ", 
					digito(num));
		}				
	}
	
	public int digito(int cod) {
		int soma = cod + Ex02.inverso(cod);
		int dig = 0;
		
		for (int i = 6; i >= 1; i--) {
			dig += soma % 10 * i;
			soma /= 10;
		}
		
		return dig % 10;
	}
}
