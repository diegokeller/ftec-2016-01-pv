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

	public void inserir(Produto produto) {

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
