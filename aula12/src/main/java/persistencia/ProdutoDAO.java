package persistencia;

import java.sql.SQLException;
import java.util.List;

import modelo.Produto;

public interface ProdutoDAO {

	public void inserir(Produto p) throws SQLException;
	
	public void atualizar(Produto p);

	public void excluir(Integer id);

	public Produto buscarPorId(Integer id) throws SQLException;
	
	public List<Produto> buscarTodos() throws SQLException;
	
}
