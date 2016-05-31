package main;

import java.sql.SQLException;
import java.util.List;

import modelo.Produto;
import persistencia.DAOFactory;
import persistencia.ProdutoDAO;

public class TesteDAO {

	public static void main(String[] args) throws SQLException {

		ProdutoDAO dao = DAOFactory.getDAOFactory().getProdutoDAO();

		Produto p = new Produto(null, "Produto 1", "Descrição 1", 123.45f, 5, true);

		dao.inserir(p);

		Produto p2 = dao.buscarPorId(1);
		System.out.println(p2);

		List<Produto> todos = dao.buscarTodos();
		System.out.println(todos);

		System.out.println("OK");

	}

}
