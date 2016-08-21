package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class Ex04DoWhile extends Programa {
	/*
	 * n! = n * (n - 1)!
	 * 
	 * 5! = 5 * 4 * 3 * 2 * 1
	 * 
	 * 5! = 5 * 4!
	 * 4! = 4 * 3!
	 * 3! = 3 * 2!
	 * 2! = 2 * 1!
	 */

		
	public void inicio() {
		int num = leInteiro("Informe um nº");
		int fat = 1;
	
		/*
		          x x x x 
		          8 4 2 1
		                
			7 <=> 0 1 1 1
		    
		    7       4+2+1

           dec     bin       hex
			15 <=> 1 1 1 1   f
		    
		    15     8+4+2+1

				 x x x x  x x x x 
  		         1 6 3 1  8 4 2 1
                 2 4 2 6
		         8

                    f        f
		   255   1 1 1 1  1 1 1 1
		            7        f
		   127   0 1 1 1  1 1 1 1
		
		
		*/
		
		int i = 1;
		do {
			fat *= i++;
		} while ( i <= num);
		escrevaL("\nO Fatorial de ", num, " é ", fat);
	}
}
