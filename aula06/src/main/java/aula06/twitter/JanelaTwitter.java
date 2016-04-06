package aula06.twitter;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaTwitter extends JFrame {

	public JanelaTwitter() {

		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Cria um painel de conteudo
		JPanel conteudo = new JPanel();
		conteudo.setLayout(new BorderLayout());

		// Adiciona o cabeçalho
		conteudo.add(new Cabecalho(), BorderLayout.NORTH);

		// Adiciona o principal
		conteudo.add(new PrincipalComGridLayout(), BorderLayout.CENTER);

		// Adiciona o rodape
		conteudo.add(new Rodape(), BorderLayout.SOUTH);

		// Adiciona o conteudo ao frame
		this.add(conteudo);

		// Mostra
		setVisible(true);

	}

}
