package aula06.twitter;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cabecalho extends JPanel {

	public Cabecalho() {
		
		// Label branco com fonte grande
		JLabel titulo = new JLabel("Twitter");
		titulo.setFont(new Font("Arial", Font.BOLD, 22));
		titulo.setForeground(Color.WHITE);
		this.add(titulo);

		// Fundo azul
		this.setBackground(Color.BLUE);
		
	}
	
}
