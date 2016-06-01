package aula14;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.Calculadora;

public class TesteCalculadora {

	@Test
	public void testSomar() {
		Calculadora c = new Calculadora();
		Float resultado = c.somar(5f, 7f);
		assertEquals(12f, resultado, 0);
		
		assertEquals(0f, c.somar(0f, 0f), 0);
		assertEquals(0f, c.somar(-5f, 5f), 0);
		assertEquals(-11, c.somar(-3f, -8f), 0);
		assertEquals(1, c.somar(1f, null), 0);
		assertEquals(5, c.somar(null, 5f), 0);
		assertEquals(0, c.somar(null, null), 0);
	}

	@Test
	public void testMedia() {
		fail("Not yet implemented");
	}

	@Test
	public void testDividir() {
		fail("Not yet implemented");
	}

}
