package br.com.fl.lotofacil;

import java.util.ArrayList;
import java.util.Collections;

public class ValoresParaNaoSortear{

	/**
	 *@author Felipe Lima
	 *
	 * ArrayList valoresSorteados armazena todos os valores que o usuario n�o quer que seja sorteado
	 */
	private static ArrayList<Integer> valoresParaNaoSorteados = new ArrayList<>();
	
	PadraoSorteio padraoSorteio = new PadraoSorteio();
	
	/**
	 *  <code>limiteBotaoApertado</code> limita a quantidade de n�meros que o usu�rio pode optar para n�o sortear
	 *  @return false - N�meros adicionado chegou ao limite, ent�o n�o poder� proceguir
	 *  @return true -  N�meros n�o chegou ao limite, ent�o continuar a adicionar n�meros no arrayList
	 */
	public boolean limiteBotaoApertado(int numeroBotaoApertado){
		
		if(valoresParaNaoSorteados.size() == padraoSorteio.quantNumeroBloqueados()){
			return false;
		}else{
			return true;
		}
		
	}
	
	
	public boolean add(int numeroNaoSortear){
		if(limiteBotaoApertado(numeroNaoSortear)){
			valoresParaNaoSorteados.add(numeroNaoSortear);
			
			Collections.sort(valoresParaNaoSorteados);
			System.out.println(valoresParaNaoSorteados);
			
			return true;
		}else{
			return false;
		}
	}
	
	public void remove(int numeroNaoSortear){
		valoresParaNaoSorteados.remove(valoresParaNaoSorteados.indexOf(numeroNaoSortear));
	}
	
	public boolean getValorNaoSortear(int numero){
		return valoresParaNaoSorteados.contains(numero);
	}
	
	public void removerTodosValores(){
		valoresParaNaoSorteados.removeAll(valoresParaNaoSorteados);
	}
	
	public String mensagemValoresBloqueados(){
		String texto;
		
		if(valoresParaNaoSorteados.size() == 0){
			texto = "Todos os "+padraoSorteio.getNumMaxSorteioLotofacil()+" n�meros fazem parte do sorteio";
			
		}else if(valoresParaNaoSorteados.size() == 1){
			texto = (valoresParaNaoSorteados.get(0)+1)+" n�o faz parte do sorteio";
			
		}else{
			
			texto = Integer.toString(valoresParaNaoSorteados.get(0)+1);
			
			for(int i = 1; i < valoresParaNaoSorteados.size(); i++){
				texto += ", "+(valoresParaNaoSorteados.get(i)+1);
			}
			texto += " n�o ser�o sorteado";
			
		}
		
		return texto;
		
	}
	
}
