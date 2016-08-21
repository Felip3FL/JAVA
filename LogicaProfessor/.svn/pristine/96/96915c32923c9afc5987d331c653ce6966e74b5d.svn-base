package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class Ex01 extends Programa {
	@Override
	public void inicio() {
		int cnt = 0;
		int oMenor = Integer.MAX_VALUE;
		int num = leInteiro("Informe o nº");
		
		while(num > 0) {
			if(num < oMenor) {
				oMenor = num;
				cnt = 1;
			} else if(num == oMenor) {
				cnt++;
			}
			
			num = leInteiro("Informe o nº");
		}
		
		if(cnt > 0)
			escrevaL("O Menor nº informado é: ", oMenor , 
				"\ne foi informado ", cnt , " vezes");
		else 
			escreva("Final");
	}
}
