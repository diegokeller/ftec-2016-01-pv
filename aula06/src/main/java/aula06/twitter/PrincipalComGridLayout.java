package aula06.twitter;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PrincipalComGridLayout extends JPanel {

	public PrincipalComGridLayout() {

		// Define o layout
		this.setLayout(new GridLayout(3, 1));

		// Cria o label
		JLabel label = new JLabel("Mensagem:");

		// Cria o contador
		JLabel contador = new JLabel("");

		// Cria o campo
		JTextArea campo = new JTextArea();
		campo.addKeyListener(new AtualizarContador(campo, contador));

		// Adiciona
		this.add(label);
		this.add(campo);
		this.add(contador);
	}

}
