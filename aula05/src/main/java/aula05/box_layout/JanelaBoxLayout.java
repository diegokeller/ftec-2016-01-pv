package aula05.box_layout;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaBoxLayout extends JFrame {

	public JanelaBoxLayout() {
		setTitle("Gerenciador de Layout - Box Layout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Cria um painel - Pode ser horizontal ou vertical
		Box painelConteudo = Box.createVerticalBox();

		// Adicona alguns botões
		JButton salvar = new JButton("Salvar");
		painelConteudo.add(salvar);

		JButton excluir = new JButton("Excluir");
		painelConteudo.add(excluir);

		JButton voltar = new JButton("Voltar");
		painelConteudo.add(voltar);

		// Adiciona o painel de conteúdo
		getContentPane().add(painelConteudo);

		// Mostra a janela
		setVisible(true);
	}

}
