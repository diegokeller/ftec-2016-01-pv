package aula12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainTesteConexao {

	public static void main(String[] args) {

		// Carrega o driver JDBC
		// Esse passo é opcional depois do JDBC4
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Classe do driver não encontrada."
					+ "Verifique o caminho.");
		}

		// String de conexão com o banco de dados
		String stringConexao = "jdbc:postgresql://localhost:5432/ftec_pedidos";
		String usuario = "postgres";
		String senha = "postgres";

		// Conecta no banco
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(stringConexao, usuario,
					senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("OK");

	}

}
