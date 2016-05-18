package persistencia.postgres;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import modelo.Produto;
import persistencia.ConnectionFactory;
import persistencia.ProdutoDAO;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ProdutoPostgresDAO implements ProdutoDAO {

	@Override
	public void inserir(Produto p) throws SQLException {

		// Pega a conexão
		Connection conexao = ConnectionFactory.getPostgresConnection();

		// Define o comando
		String sql = "insert into produto(nome, descricao, "
				+ "preco, quantidade_estoque, ativo) " + "values (?,?,?,?,?)";

		// Cria o comando preparado
		PreparedStatement ps = null;
		ps = conexao.prepareStatement(sql);

		// Define os parâmetros
		ps.setString(1, p.getNome());
		ps.setString(2, p.getDescricao());
		ps.setFloat(3, p.getPreco());
		ps.setInt(4, p.getQuantidadeEstoque());
		ps.setBoolean(5, p.getAtivo());

		// Executa
		ps.execute();

		// Fechamento
		ps.close();
		conexao.close();

	}

	@Override
	public void atualizar(Produto p) {
		// TODO: Implementar
		throw new NotImplementedException();
	}

	@Override
	public void excluir(Integer id) {
		// TODO: Implementar
		throw new NotImplementedException();
	}

	@Override
	public Produto buscarPorId(Integer id) throws SQLException {

		// Pega a conexão
		Connection conexao = ConnectionFactory.getPostgresConnection();

		// Define o comando
		String sql = "select * from produto where id = ?";

		// Cria o comando preparado
		PreparedStatement ps = conexao.prepareStatement(sql);

		// Define os parâmetros
		ps.setInt(1, id);

		// Cria um modelo
		Produto produto = null;

		// Executa
		ResultSet resultado = ps.executeQuery();

		// Verifica se tem resultados
		if (resultado.next()) {

			// Monta o modelo
			produto = montarModelo(resultado);

		}

		// Fechamento
		ps.close();
		resultado.close();
		conexao.close();

		return produto;
	}

	@Override
	public List<Produto> buscarTodos() throws SQLException {

		// Pega a conexão
		Connection conexao = ConnectionFactory.getPostgresConnection();

		// Define o comando
		String sql = "select * from produto";
		PreparedStatement ps = conexao.prepareStatement(sql);

		// Cria uma lista dos produtos retornados
		List<Produto> produtos = new LinkedList<Produto>();
		
		// Executa o comando
		ResultSet resultado = ps.executeQuery();

		// Enquanto houver resultados
		while (resultado.next()) {
			
			// Monta o modelo
			Produto modelo = montarModelo(resultado);
			
			// Adiciona na lista
			produtos.add(modelo);
		}

		// Fechamento
		ps.close();
		resultado.close();
		conexao.close();

		return produtos;
	}

	private Produto montarModelo(ResultSet resultado) throws SQLException {

		// Obtém os valores
		Integer idProduto = resultado.getInt("id");
		String nome = resultado.getString("nome");
		String descricao = resultado.getString("descricao");
		Float preco = resultado.getFloat("preco");
		Integer quantidadeEstoque = resultado.getInt("quantidade_estoque");
		Boolean ativo = resultado.getBoolean("ativo");

		// Cria um modelo
		Produto produto = new Produto(idProduto, nome, descricao, preco,
				quantidadeEstoque, ativo);

		// Retorna
		return produto;
	}

}
