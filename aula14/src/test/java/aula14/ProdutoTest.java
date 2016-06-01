package aula14;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Produto;
import negocio.ProdutoBO;

public class ProdutoTest {

	ProdutoBO bo = new ProdutoBO();
	
	@Test
	public void testInserirCamposObrigatorios() {
		
		Produto p = new Produto(null, null, "TESTE", 123f, 1, true);
		
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
