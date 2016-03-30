package aula05.grid_bag_layout;

import java.awt.Color;
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

public class Janela2GridLayout extends JFrame {

	public Janela2GridLayout() {
		setTitle("Gerenciador de Layout - Grid Bag Layout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Cria um painel
		JPanel painelConteudo = new JPanel();

		// Define o gerenciador de layout
		painelConteudo.setLayout(new GridBagLayout());

		JPanel salvar = new JPanel();
		salvar.setBackground(Color.RED);
		GridBagConstraints r1 = new GridBagConstraints();
		r1.gridx = 0;
		r1.gridy = 0;
		r1.fill = GridBagConstraints.BOTH;
		r1.weighty = 0.25;
		r1.weightx = 1;
		painelConteudo.add(salvar, r1);

		JPanel excluir = new JPanel();
		excluir.setBackground(Color.BLUE);
		GridBagConstraints r2 = new GridBagConstraints();
		r2.gridx = 0;
		r2.gridy = 1;
		r2.fill = GridBagConstraints.BOTH;
		r2.weighty = 0.75;
		r2.weightx = 1;
		painelConteudo.add(excluir, r2);

		// Adiciona o painel de conteúdo
		getContentPane().add(painelConteudo);

		// Mostra a janela
		setVisible(true);
	}

}
