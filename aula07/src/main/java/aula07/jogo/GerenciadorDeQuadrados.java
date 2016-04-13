package aula07.jogo;

import java.util.LinkedList;
import java.util.List;

// Vamos herdar de Thread
public class GerenciadorDeQuadrados extends Thread {

	// Lista dos quadrados sendo gerenciados
	private List<Quadrado> quadrados;

	public GerenciadorDeQuadrados() {
		quadrados = new LinkedList<Quadrado>();
	}

	@Override
	public void run() {
		super.run();

		int novoQuadrado = 2000; // 2 segundos

		while (true) {

			// Adicionar novos quadrados
			novoQuadrado -= 100;
			if(novoQuadrado <= 0){
				quadrados.add(new Quadrado());
				novoQuadrado = 2000;
			}
			
			// Percorre os existentes incrementando
			for (Quadrado quadrado : quadrados) {
				quadrado.y += 10;
			}
			
			// Pega o último
			if(quadrados.size() > 0){

				Quadrado ultimo = quadrados.get(quadrados.size() - 1);
				
				// Verifica se deve remover
				if(ultimo.getY() >= 400){
					quadrados.remove(ultimo);
				}
				
			}
			

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Quadrado> getQuadrados() {
		return quadrados;
	}
	
}
