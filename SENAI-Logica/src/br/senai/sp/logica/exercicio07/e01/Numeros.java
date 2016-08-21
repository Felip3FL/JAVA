package br.senai.sp.logica.exercicio07.e01;

public class Numeros {

	int valores[] = new int[10];
	int index = 0;
	
	public int getValores(int posicao) {
		return valores[posicao];
	}
	
	public void setValores(int valores) {
		this.valores[index] = valores;
		index++;
	}
	
	public int getTamanhoVetor(){
		return valores.length;
	}

	public int getMedia(){
		int media = 0;
		for (int i = 0; i < getTamanhoVetor(); i++) {
			media += valores[i];
		}
		media /=  getTamanhoVetor();
		return media;
	}
	
	public void ordernaNumeros(){
		boolean troca = false;
		
		do{
			troca = false;
			for (int i = 0; i < valores.length-1; i++) {
				if (this.valores[i] > this.valores[i+1]){
					int aux = valores[i];
					valores[i] = valores[i + 1];
					valores[i + 1] = aux;
					troca = true;
				}
			}
		}while(troca);
	}
	
	public int[] getValoresMaiorMedia(){
		int media = getMedia();
		int posicaoVetor = 0;
		
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > media){
				posicaoVetor = i;
				break;
			}
		}
		
		int valoresMaior[] = new int[getTamanhoVetor() - posicaoVetor];
		
		for (int j = 0; j < valoresMaior.length; j++) {
			valoresMaior[j] = valores[j+posicaoVetor];
		}
		
		return valoresMaior;
	}
	

	
}
