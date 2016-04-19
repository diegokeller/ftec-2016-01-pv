package aula08.fabrica.tela;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JanelaTeste extends JFrame {

	public JanelaTeste() {
		
		setTitle("Teste");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new LinhaDeProducao());
		getContentPane().add(new LinhaDeProducao());
		getContentPane().add(new LinhaDeProducao());
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new JanelaTeste();
	}
	
}
