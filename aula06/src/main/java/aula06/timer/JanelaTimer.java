package aula06.timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaTimer extends JFrame implements OuvinteTimerConcluido, OuvinteAtualizacaoTimer {

	public JanelaTimer() {

		setTitle("Timer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 250);

		setVisible(true);

		TimerThread timerThread = new TimerThread();
		timerThread.setOuvinte(this);
		timerThread.setOuvinteAtualizacao(this);
		timerThread.start();

	}
	
	@Override
	public void segundosRestantes(int segundos) {
		this.setTitle("Faltam " + segundos + " segundos!");
	}

	public static void main(String[] args) {
		new JanelaTimer();
	}
	
	@Override
	public void timerConcluido() {
		JOptionPane.showMessageDialog(null, "O Timer foi concluído");
	}
	

}
