package logica.ex06;

import java.math.BigInteger;

import br.senai.sp.info132.console.Programa;

public class Ex04For2 extends Programa {
	public void inicio() {
		BigInteger num = new BigInteger(leInteiro("Informe um nº").toString());
		
		BigInteger fat = BigInteger.ONE;
		
		BigInteger i = new BigInteger("2");
		while(/* i <= num */  i.compareTo(num) <= 0 ) {
			fat = fat.multiply(i);
			i = i.add(BigInteger.ONE);
		}
		escrevaL("\nO Fatorial de ", num.toString(), " é ", fat.toString());
	}
}
