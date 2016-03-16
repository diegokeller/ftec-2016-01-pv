package aula03.sincronizacao;

public class ThreadSomar extends Thread {
	
	private Double inicio;
	private Double fim;
	private Double soma = 0d;
	
	public ThreadSomar(Double inicio, Double fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	@Override
	public void run() {
		super.run();
		
		for(Double i = inicio; i <= fim; i++){
			soma += i;
		}
		
	}

	public Double getSoma() {
		return soma;
	}
}
