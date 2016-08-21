package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex02a extends Programa {
	public void inicio() {
		String[] lista = new String[10];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = leTexto("Informe o ", i+1, "º nome");
		}
		
		escrevaL();
		
		String nome = leTexto("Informe o nome a pesquisar");
		while(!nome.equals("fim")) {
			escreva("O nome: ", nome);
			if(!encontrou(lista, nome)) {
				escreva(" não");
			}
			escrevaL(" foi encontrado");
				
			
			nome = leTexto("Informe o nome a pesquisar");
		}
	}
	
	public boolean encontrou(String[] listaOndePesquisar, String nomeAPesquisar) {
		boolean encontrou = false;
		for (int i = 0; i < listaOndePesquisar.length; i++) {
			if(nomeAPesquisar.equals(listaOndePesquisar[i])) {
				encontrou = true;
				break;
			}
		}
		return encontrou;
	}
}
