package aula08.fabrica.negocio;

public class Fabrica {

	private Integer estoque;
	private Integer vendas;
	
	private LinhaDeProducao[] linhasDeProducao;
	
	private static Fabrica instancia = new Fabrica();
	
	public static Fabrica getInstancia() {
		return instancia;
	}
	
	private Fabrica() {
		this.estoque = 0;
		this.vendas = 0;
		
		// Cria as lihas de produção
		this.linhasDeProducao = new LinhaDeProducao[3];
		linhasDeProducao[0] = new LinhaDeProducao();
		linhasDeProducao[1] = new LinhaDeProducao();
		linhasDeProducao[2] = new LinhaDeProducao();

		// Inicia todas as threads
		linhasDeProducao[0].start();
		linhasDeProducao[1].start();
		linhasDeProducao[2].start();
		
	}
	
	public synchronized void produzir(){
		estoque++;
	}
	
	public synchronized void vender(){
		if(estoque > 0){
			estoque--;
			vendas++;
		} else {
			System.out.println("Sem carros no estoque.");
		}
	}
	
	public void ligarLinha(int linha){
		linhasDeProducao[linha].setLigada(true);
	}

	public void desligarLinha(int linha){
		linhasDeProducao[linha].setLigada(false);
	}
	
	public Integer getEstoque() {
		return estoque;
	}
	
	public Integer getVendas() {
		return vendas;
	}
}
