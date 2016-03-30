package aula05.grid_bag_layout;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela1GridLayout extends JFrame {

	public Janela1GridLayout() {
		setTitle("Gerenciador de Layout - Grid Bag Layout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Cria um painel
		JPanel painelConteudo = new JPanel();

		// Define o gerenciador de layout
		painelConteudo.setLayout(new GridBagLayout());

		JButton salvar = new JButton("Salvar");
		GridBagConstraints r1 = new GridBagConstraints();
		r1.gridx = 1;
		r1.gridy = 1;
		painelConteudo.add(salvar, r1);

		JButton excluir = new JButton("Excluir");
		GridBagConstraints r2 = new GridBagConstraints();
		r2.gridx = 2;
		r2.gridy = 2;
		painelConteudo.add(excluir, r2);

		// Adiciona o painel de conteúdo
		getContentPane().add(painelConteudo);

		// Mostra a janela
		setVisible(true);
	}

}
