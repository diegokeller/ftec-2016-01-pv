package negocio;

import java.sql.SQLException;
import java.util.List;

import excecoes.NegocioException;
import modelo.Produto;
import persistencia.DAOFactory;
import persistencia.ProdutoDAO;

public class ProdutoBO {

	ProdutoDAO dao; // DAO dos produtos, usar a interface na declaração

	public ProdutoBO() { // Inicializa o DAO
		dao = DAOFactory.getDAOFactory().getProdutoDAO();
	}

	public void inserir(Produto produto) throws NegocioException {

		if(produto == null){
			throw new NegocioException("Produto não informado.");
		}
		
		// Quantidade em estoque não pode ser negativa
		if(produto.getQuantidadeEstoque() < 0){
			throw new NegocioException("Quantidade em estoque não pode ser negativa.");
		}
		
		// Preço deve ser maior do que zero
		if(produto.getPreco() <= 0){
			throw new NegocioException("Preço deve ser maior que zero.");
		}
		
		// Ativo e nome são obrigatórios
		if(produto.getNome() == null || 
				produto.getNome().isEmpty() || 
				produto.getAtivo() == null){
			throw new NegocioException("Campos de nome e ativo são obrigatórios.");
		}
		
		if(produto.getNome().length() > 100){
			throw new NegocioException("Campo de nome deve ter no máximo 100 caracteres.");
		}
		
		try {
			dao.inserir(produto);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new NegocioException("Erro de acesso ao banco.", e);
		}
		
	}

	public Produto buscarPorId(Integer id) throws NegocioException {

		// Valida se tem id
		if (id == null || id <= 0) {
			return null;
		}

		// Busca e retorna
		try {
			return dao.buscarPorId(id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new NegocioException("Erro de acesso ao banco.", e);
		}

	}

	public List<Produto> buscarTodos() throws NegocioException {
		try {
			return dao.buscarTodos();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new NegocioException("Erro de acesso ao banco.", e);
		}
	}
}
