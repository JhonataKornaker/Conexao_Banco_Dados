package banco_de_dados_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost:3306/test?verifyServerCertificate=false&useSSL=true"; //Para usar uma conecxao segura
		final String usuario = "root";
		final String senha = "12345678";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		//criando banco de dados no propria IDE
		Statement stm = conexao.createStatement();
		stm.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso!");
		
		conexao.close();
	
	}
}
