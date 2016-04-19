package aula08.fabrica.tela;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Estoque extends JPanel {
	
	public Estoque() {

		setLayout(new GridLayout(2, 1));
		
		JLabel estoque = new JLabel("Estoque");
		estoque.setFont(new Font("Arial", Font.BOLD, 14));
		add(estoque);
		
		JProgressBar progresso = new JProgressBar(0, 100);
		progresso.setPreferredSize(new Dimension(460, 30));
		progresso.setValue(50);
		add(progresso);
		
	}

}
