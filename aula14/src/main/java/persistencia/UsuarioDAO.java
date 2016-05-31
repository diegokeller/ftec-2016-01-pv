package persistencia;

import java.sql.SQLException;
import java.util.List;

import modelo.Usuario;

/**
 * Interface do DAO de usuários.
 * @author Diego
 *
 */
public interface UsuarioDAO {

	/**
	 * Insere.
	 * @param p
	 * @throws SQLException
	 */
	public void inserir(Usuario u) throws SQLException;
	
	/**
	 * Atualiza as informações do usuario.
	 * Já deve ter um id.
	 * @param p
	 */
	public void atualizar(Usuario p) throws SQLException;

	/**
	 * Exclui o usuario com o id informado.
	 * @param id
	 */
	public void excluir(Integer id) throws SQLException;

	/**
	 * Busca um usuario pelo seu id.
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public Usuario buscarPorId(Integer id) throws SQLException;
	
	/**
	 * Busca usuarios de acordo com os critérios de pesquisa.
	 * @return
	 * @throws SQLException
	 */
	public List<Usuario> buscar(String nome, Boolean ativo) throws SQLException;
	
}
