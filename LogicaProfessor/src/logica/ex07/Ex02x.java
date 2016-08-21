package logica.ex07;

import java.util.Arrays;
import java.util.Optional;

import br.senai.sp.info132.console.Programa;

public class Ex02x extends Programa {
	public void inicio() {
		String[] lista = new String[10];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = leTexto("Informe o ", i+1, "º nome");
		}
		
		escrevaL();
		
		String nome = leTexto("Informe o nome a pesquisar");
		while(!nome.equals("fim")) {
			escreva("O nome: ", nome);
			
			final String valor = nome;
			
			Optional<String> nomeEncontrato = Arrays.stream(lista)
				.filter(nomeAPesquisar  ->  valor.equals(nomeAPesquisar) ? true : false)
				.findAny();
			
			if(nomeEncontrato.isPresent()) {
				escreva(" não");
			}
			escrevaL(" foi encontrado");
				
			
			nome = leTexto("Informe o nome a pesquisar");
		}
	}	
}
