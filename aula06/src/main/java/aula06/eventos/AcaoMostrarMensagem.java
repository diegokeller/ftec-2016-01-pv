package aula06.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AcaoMostrarMensagem implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// Mostra uma mensagem
		JOptionPane.showMessageDialog(null, "Você clicou no botão!");
	}

}
