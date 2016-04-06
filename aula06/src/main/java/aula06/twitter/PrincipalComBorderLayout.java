package aula06.twitter;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PrincipalComBorderLayout extends JPanel {

	public PrincipalComBorderLayout() {
		
		this.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("Mensagem:");
		this.add(label, BorderLayout.NORTH);
		
		JTextArea campo = new JTextArea();
		this.add(campo, BorderLayout.CENTER);
		
		JLabel contador = new JLabel("X caracteres restantes.");
		this.add(contador, BorderLayout.SOUTH);
	}
	
}
