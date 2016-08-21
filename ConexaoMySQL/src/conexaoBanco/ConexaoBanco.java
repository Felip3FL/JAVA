package conexaoBanco;

import java.sql.*;  //Importa��o de todas as classes JAVA.SQL

public class ConexaoBanco {

	static String status=""; //Variavel que informa o status da conex�o
	
	public static Connection getConexaoBancoMySQL() {

	        Connection conn = null; //Variavel para conex�o, atributo do tipo Connection
	 
	try {
				Class.forName("com.mysql.jdbc.Driver").newInstance(); //Carregando o Drive MySQL para a conex�o
				
				String url = "jdbc:mysql://localhost/projetocc?user=root&password=fl";  //Local, NomeUsuario, Senha...
	            conn = DriverManager.getConnection(url); //Enviando dados para o banco
	            status="Connection opened"; //SUCESSO!
	            
        		Statement comandoSQL = conn.createStatement(); //Instanciando comandoSQL  
        		comandoSQL.execute("SELECT * FROM tbl_lexico"); //Enviando comandos SQL para o banco
	            
	}

 
	
	          catch (SQLException e){
	        	  status = e.getMessage();
	          }
	          
	          catch (ClassNotFoundException e){
	        	  status = e.getMessage();
	          }
	
	          catch (Exception e){
	        	  status = e.getMessage();
	          }
	          
	          return conn;
}
}
	