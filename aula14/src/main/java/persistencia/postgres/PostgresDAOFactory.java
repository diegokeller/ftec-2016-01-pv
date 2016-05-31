package persistencia.postgres;

import persistencia.DAOFactory;
import persistencia.ProdutoDAO;

public class PostgresDAOFactory extends DAOFactory {

	@Override
	public ProdutoDAO getProdutoDAO() {
		return new ProdutoPostgresDAO();
	}

}
