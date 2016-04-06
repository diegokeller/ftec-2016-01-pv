package aula06.timer;

public class TimerThread extends Thread {

	private OuvinteTimerConcluido ouvinte;
	private OuvinteAtualizacaoTimer ouvinteAtualizacao;

	@Override
	public void run() {
		super.run();

		int segundos = 3;
		while (segundos > 0) {
			ouvinteAtualizacao.segundosRestantes(segundos);
			segundos--;
			try {
				Thread.sleep(1000); // 1 segundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ouvinte.timerConcluido();
	}

	public OuvinteTimerConcluido getOuvinte() {
		return ouvinte;
	}

	public void setOuvinte(OuvinteTimerConcluido ouvinte) {
		this.ouvinte = ouvinte;
	}

	public OuvinteAtualizacaoTimer getOuvinteAtualizacao() {
		return ouvinteAtualizacao;
	}

	public void setOuvinteAtualizacao(OuvinteAtualizacaoTimer ouvinteAtualizacao) {
		this.ouvinteAtualizacao = ouvinteAtualizacao;
	}
	
	

}
