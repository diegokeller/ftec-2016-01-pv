package aula04.border_layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaBorderLayout extends JFrame {

	public JanelaBorderLayout() {
		setTitle("Gerenciador de Layout - Border Layout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Cria um novo painel
		JPanel conteudo = new JPanel();

		// Define o gerenciador de layout
		conteudo.setLayout(new BorderLayout());

		// Cria label
		conteudo.add(new Cabecalho("Sistema de Pedidos", Color.RED),
				BorderLayout.NORTH);

		// Sul
		JLabel rodape = new JLabel("FTEC Faculdades");
		conteudo.add(rodape, BorderLayout.SOUTH);

		// Oest
		JButton ok = new JButton("OK");
		conteudo.add(ok, BorderLayout.WEST);

		// Centro
		JTextField campo = new JTextField();
		conteudo.add(campo, BorderLayout.CENTER);

		// Adiciona o conteúdo à janela
		this.add(conteudo);

		// Mostra a janela
		setVisible(true);
	}

}
