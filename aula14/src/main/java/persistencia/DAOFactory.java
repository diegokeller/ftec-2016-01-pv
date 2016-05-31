package persistencia;

import persistencia.postgres.PostgresDAOFactory;

public abstract class DAOFactory {
	
	// Um método para cada tabela
	public abstract ProdutoDAO getProdutoDAO();
	
	public static DAOFactory getDAOFactory(){
		return new PostgresDAOFactory();
	}

}
