package logica.ex02.exemplos;

import br.senai.sp.info132.console.Programa;

public class Exemplo03 extends Programa {
	public void inicio() {
		int mes = leInteiro("Informe o nº do mês");

		int trimestre;

		switch (mes) {
		case 1:
		case 2:
		case 3:
			trimestre = 1;
			break;
		case 4:
		case 5:
		case 6:
			trimestre = 2;
			break;
		case 7:
		case 8:
		case 9:
			trimestre = 3;
			break;
		case 10:
		case 11:
		case 12:
			trimestre = 4;
			break;
		default:
			trimestre = -1;
			break;
		}

		if(trimestre > 0)
			escrevaL("Estamos no ", trimestre,"º trimestre");
		else
			escrevaL("Trimestre inválido");
	}
}
