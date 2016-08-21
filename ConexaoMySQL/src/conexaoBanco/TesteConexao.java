package conexaoBanco;

public class TesteConexao {
	
	public static void main (String[] args){
		
		ConexaoBanco.getConexaoBancoMySQL();
		System.out.println(ConexaoBanco.status);

		
	}
	
}
