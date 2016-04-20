package aula08.fabrica.negocio;

public class Fabrica {

	private Integer estoque;
	private Integer vendas;
	
	private static Fabrica instancia = new Fabrica();
	
	public static Fabrica getInstancia() {
		return instancia;
	}
	
	private Fabrica() {
		this.estoque = 0;
		this.vendas = 0;
	}
	
	public void produzir(){
		estoque++;
	}
	
	public void vender(){
		estoque--;
		vendas++;
	}
	
}
