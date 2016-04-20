package aula08.fabrica.negocio;

public class LinhaDeProducao extends Thread {
	
	private boolean ligada = false;
	
	@Override
	public void run() {
		super.run();
		
		while(true){
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if(ligada){
				System.out.println("Produziu um carro.");
				Fabrica.getInstancia().produzir();
			}
			
		}
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
}
