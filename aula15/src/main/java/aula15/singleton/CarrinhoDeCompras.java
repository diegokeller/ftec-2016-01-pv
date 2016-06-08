package aula15.singleton;

import java.util.LinkedList;
import java.util.List;

public class CarrinhoDeCompras {
	
	// Lista dos produtos do carrinho
	private List<Integer> produtos;

	// Instância única do carrinho de compras
	private static CarrinhoDeCompras instancia;
	
	// Construtor do carrinho
	private CarrinhoDeCompras() {
		this.produtos = new LinkedList<Integer>();
	}
	
	// Obter a instância unica desse objeto
	public synchronized static CarrinhoDeCompras getInstancia() {
		if(instancia == null){
			instancia = new CarrinhoDeCompras();
		}
		return instancia;
	}

}
