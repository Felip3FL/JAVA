package conexaoBanco;

import java.sql.*;  //Importação de todas as classes JAVA.SQL

public class ConexaoBanco {

	static String status=""; //Variavel que informa o status da conexão
	
	public static Connection getConexaoBancoMySQL() {

	        Connection conn = null; //Variavel para conexão, atributo do tipo Connection
	 
	try {
				Class.forName("com.mysql.jdbc.Driver").newInstance(); //Carregando o Drive MySQL para a conexão
				
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
	