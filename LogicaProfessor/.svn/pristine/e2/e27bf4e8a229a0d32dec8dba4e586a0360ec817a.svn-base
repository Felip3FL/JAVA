package logica.ex05;

import java.util.stream.IntStream;

import br.senai.sp.info132.console.Programa;

public class Ex01xx extends Programa {
	public void inicio() {
		IntStream.rangeClosed(1, 1000)
			.filter(n -> n % 2 == 0)
			.mapToObj(n -> n % 40.0 == 0 ? 
					String.format("%04d%n", n) : 
						String.format("%04d ", n))
			.forEach(this::escreva);		
	}
}
