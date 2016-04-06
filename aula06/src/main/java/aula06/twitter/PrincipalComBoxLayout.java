package aula06.twitter;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PrincipalComBoxLayout extends JPanel {

	public PrincipalComBoxLayout() {
		
		Box conteudo = Box.createVerticalBox();
		this.add(conteudo);
		
		JLabel label = new JLabel("Mensagem:");
		conteudo.add(label);
		
		JTextArea campo = new JTextArea();
		conteudo.add(campo);
		
		JLabel contador = new JLabel("X caracteres restantes.");
		conteudo.add(contador);
	}
	
}
