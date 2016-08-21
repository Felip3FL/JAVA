package br.senai.sp.logica.exercicio05a;

import br.senai.sp.info132.console.Programa;

public class exercicio02 extends Programa {

	@Override
	public void inicio() {
		
		int analista = 0;
		int programador = 0;
		int usuario = 0 ;
		int gesto = 0 ;
		int outro = 0;
		String entrada = "";
		
		do{
			
			entrada = leTexto("Digite quem ingressou: ");
			
			switch (entrada) {
			case "analista":
				analista ++;
				break;
			case "programador":
				programador ++;
				break;
			case "usuario":
				usuario ++;
				break;				
			case "gestor":
				gesto ++;
				break;	
			case "outro":
				outro ++;
				break;			
			case "fim":
				break;			
			default:
				escrevaL("Funcionario " + entrada + " invalido!");
				break;
			}
			
		}while(!entrada.equals("fim"));
		//para compraração de STRING, usa o equals, String é um objeto
		
		escrevaL("analista: ", analista);
		escrevaL("programador: ", programador);
		escrevaL("usuario: ", usuario);
		escrevaL("gesto: ", gesto);
		escrevaL("outro: ", outro);

	}

}
