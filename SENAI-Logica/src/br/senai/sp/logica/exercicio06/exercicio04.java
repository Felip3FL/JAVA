package br.senai.sp.logica.exercicio06;

import br.senai.sp.info132.console.Programa;

public class exercicio04 extends Programa {

	@Override
	public void inicio() {

			int numero = 0;
			int i = 0;
			
			escrevaL("Usando o FOR");
			numero = leInteiro("Informe um nº ");
			
			for (i = (numero - 1); i > 0; i--) {
				numero *= i;
				//screvaL(i);
			}
			escrevaL("O fatorial é: ", numero);

			///////////////////////////////////////////////////////////////////////
			
			escrevaL("Usando o WHILE");
			numero = leInteiro("Informe um nº ");
			
			i = (numero - 1);
			while(i > 0){
				numero *= i;
				//escrevaL(i);
				i--;
			}
			escrevaL("O fatorial é: ", numero);
			
			/////////////////////////////////////////////////////////////////////
			
			escrevaL("Usando o DO..WHILE");
			numero = leInteiro("Informe um nº ");
			i = (numero - 1);
			do{
				numero *= i;
				//escrevaL(i);
				i--;
			}while(i > 0);
			escrevaL("O fatorial é: ", numero);
			
	}

}
