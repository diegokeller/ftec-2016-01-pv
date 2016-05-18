package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	/**
	 * Pega uma conexão com o Postgres
	 * @throws SQLException 
	 */
	public static Connection getPostgresConnection() throws SQLException {

		// Carrega o driver JDBC
		// Esse passo é opcional depois do JDBC4
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Classe do driver não encontrada." + 
			"Verifique o caminho.");
		}

		// String de conexão com o banco de dados
		String stringConexao = 
				"jdbc:postgresql://localhost:5432/ftec_pedidos";
		String usuario = "postgres";
		String senha = "postgres";

		Connection conexao = null;
		
		// Conecta no banco
		conexao = DriverManager.getConnection(
				stringConexao, usuario, senha);

		return conexao;
	}

}
