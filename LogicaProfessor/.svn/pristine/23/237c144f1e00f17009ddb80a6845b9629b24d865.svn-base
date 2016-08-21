package logica.ex07;

public class Ordenador {
	public static final boolean CRESCENTE = true;
	public static final boolean DECRESCENTE = false;
	
	
	public static void ordena(int[] dados) {
		ordena(dados, CRESCENTE);
	}

	public static void ordena(int[] dados, boolean crescente) {
		boolean ordenado;
		do {
			ordenado = true;

			for (int i = 0; i < dados.length - 1; i++) {
				ordenado = crescente ? testaCrescente(dados, i) :
					testaDecrescente(dados, i);
			}
		} while (!ordenado);
	}

	private static boolean testaCrescente(int[] dados, int pos) {
		if (dados[pos] > dados[pos + 1]) {
			troca(dados, pos);
			return false;
		}
		return true;
	}
	
	private static boolean testaDecrescente(int[] dados, int pos) {
		if (dados[pos] < dados[pos + 1]) {
			troca(dados, pos);
			return false;
		}
		return true;
	}
	
	private static void troca(int[] dados, int pos) {
		int aux = dados[pos];
		dados[pos] = dados[pos + 1];
		dados[pos + 1] = aux;
	}
}
