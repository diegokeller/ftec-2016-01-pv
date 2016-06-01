package aula14;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import excecoes.NegocioException;
import modelo.Produto;
import negocio.ProdutoBO;

public class ProdutoBOTest {

	ProdutoBO bo = new ProdutoBO();
	
	@Rule
	public ExpectedException excecao = ExpectedException.none();
	
	@Test
	public void testInserirQueFunciona() throws NegocioException {
		Produto p = new Produto(null, "TESTE", "TESTE", 123f, 5, true);
		bo.inserir(p);
	}
	
	@Test
	public void testInserirCamposObrigatorios() throws NegocioException {
		excecao.expect(NegocioException.class);
		excecao.expectMessage("Campos de nome e ativo são obrigatórios.");
		Produto p = new Produto(null, null, "TESTE", 123f, 5, null);
		bo.inserir(p);
	}

	@Test
	public void testBuscarPorId() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuscarTodos() {
		fail("Not yet implemented");
	}

}
