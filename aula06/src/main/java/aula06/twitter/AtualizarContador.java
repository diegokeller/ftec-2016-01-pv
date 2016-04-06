package aula06.twitter;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class AtualizarContador implements KeyListener {

	private JTextArea campo;
	private JLabel contador;

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public AtualizarContador(JTextArea campo, JLabel contador) {
		super();
		this.campo = campo;
		this.contador = contador;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int restantes = 140 - campo.getText().length();
		contador.setText(restantes + " caracteres restantes.");
		if (restantes <= 0) {
			contador.setForeground(Color.RED);
		} else {
			contador.setForeground(Color.BLACK);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

}
