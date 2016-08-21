package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	public void inicio() {
		String[] lista = new String[10];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = leTexto("Informe o ", i+1, "º nome");
		}
		
		escrevaL();
		
		String nome = leTexto("Informe o nome a pesquisar");
		while(!nome.equals("fim")) {
			boolean encontrou = false;
			for (int i = 0; i < lista.length; i++) {
				if(nome.equals(lista[i])) {
					encontrou = true;
					break;
				}
			}
			
			escreva("O nome: ", nome);
			if(!encontrou) {
				escreva(" não");
			}
			escrevaL(" foi encontrado");
				
			
			nome = leTexto("Informe o nome a pesquisar");
		}
	}
}
