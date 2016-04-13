package aula07.evento_foco;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JComponent;

public class TrocarCorDeFundo implements FocusListener {

	public void focusLost(FocusEvent e) {
		// Perdeu o foco
		JComponent campo = (JComponent) e.getSource();
		campo.setBackground(Color.WHITE);
	}
	
	public void focusGained(FocusEvent e) {
		// Ganhou o foco
		JComponent campo = (JComponent) e.getSource();
		campo.setBackground(Color.YELLOW);
	}
	
}
