package br.senai.sp.logica.exercicio08;

import br.senai.sp.info132.console.Programa;

public class Exercicio01 extends Programa {

	@Override
	public void inicio() {
		
		int numero = leInteiro("Informe um nº");
		
		if (numeroPar(numero))
			escrevaL("O nº " + numero + " é par");
		else
			escrevaL("O nº " + numero + " é impar");
		
	}

	public boolean numeroPar(int numero){
		return (numero%2)==0? true : false;
	}
	
}
