package aula03.progresso;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ThreadProgresso extends Thread {

	private JanelaProgresso janela;
	
	public ThreadProgresso(JanelaProgresso janela) {
		super();
		this.janela = janela;
	}
	
	@Override
	public void run() {
		super.run();
		
		while (true) {
			janela.setX(janela.getX() + 5);
			if (janela.getX() >= 300) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			// Java 8 - Lambda Expressions
			SwingUtilities.invokeLater(() -> {
				janela.repaint();
			});
		}
	}

}
