package aula17.tecla_atalho;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TeclaAtalho extends JFrame {

	public TeclaAtalho() {

		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Faz com que a janela possa ter o foco do teclado
		this.setFocusable(true);

		// Adiciona um listener de evento de tecla
		KeyboardFocusManager.getCurrentKeyboardFocusManager().
			addKeyEventDispatcher(new KeyEventDispatcher() {
				
			@Override
			public boolean dispatchKeyEvent(KeyEvent e) {
				
				// Verifica se a tecla foi pressionada
				boolean teclaPressionada = (e.getID() == KeyEvent.KEY_PRESSED);
				if(!teclaPressionada){
					return false;
				}
				
				// Pega o código da tecla pressionado
				int codigoTecla = e.getKeyCode();
				

				// Verifica a tecla pressionada e faz o que precisa
				switch (codigoTecla) {

					case 113:
						JOptionPane.showMessageDialog(null, "Você pressionou F2");
						break;

					case 114:
						JOptionPane.showMessageDialog(null, "Você pressionou F3");
						break;

					case 115:
						JOptionPane.showMessageDialog(null, "Você pressionou F4");
						break;

					default:
						break;
				}
				return false;
			}
		});

	}

	public static void main(String[] args) {
		new TeclaAtalho().setVisible(true);
	}

}
