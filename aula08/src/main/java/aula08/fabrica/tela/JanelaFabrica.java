package aula08.fabrica.tela;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JanelaFabrica extends JFrame {

	public JanelaFabrica() {
		
		setTitle("Teste");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 360);
		getContentPane().add(new LayoutPrincipal());
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new JanelaFabrica();
	}
	
}
