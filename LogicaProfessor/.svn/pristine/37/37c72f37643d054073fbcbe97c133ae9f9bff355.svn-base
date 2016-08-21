package logica.ex08;

import br.senai.sp.info132.console.Programa;

public class Ex01x extends Programa {
	public void inicio() {
		String msg = "O nº informado é ";
		
		while (true) {
			int num = leInteiro("Informe um nº");
			
			if(ePar(num)) {
				msg += "par";
			} else {
				msg += "impar";
			}
			
			escrevaL(msg);
		}
	}
	
	public boolean ePar(int num) {
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
}
