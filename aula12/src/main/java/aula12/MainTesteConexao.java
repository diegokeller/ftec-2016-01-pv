package aula12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

			// Insere um produto
			String sql = "insert into produto(nome, descricao, "
					+ "preco, quantidade_estoque, ativo) "
					+ "values (?,?,?,?,?)";
			PreparedStatement ps = null;
			ps = conexao.prepareStatement(sql);
			ps.setString(1, "Teste");
			ps.setString(2, "Um produto qualquer");
			ps.setFloat(3, 123.4f);
			ps.setInt(4, 4);
			ps.setBoolean(5, true);
			ps.execute();
			ps.close();

			// Buscar um produto
			String sqlSelect = "select * from produto where id = ?";
			PreparedStatement psSelect = conexao.prepareStatement(sqlSelect);
			psSelect.setInt(1, 180);

			// Executa
			ResultSet resultado = psSelect.executeQuery();
			
			// Verifica se tem resultados
			if (resultado.next()) {
				Integer idProduto = resultado.getInt("id");
				String nome = resultado.getString("nome");
				Float preco = resultado.getFloat("preco");
				Boolean ativo = resultado.getBoolean("ativo");
				System.out.println(idProduto);
				System.out.println(nome);
				System.out.println(preco);
				System.out.println(ativo);
			}
			
			// Fecha o comando
			psSelect.close();
			resultado.close();
			
			// Desconectar
			conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("OK");

	}

}
