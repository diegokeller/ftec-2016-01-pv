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

public class Janela3GridLayout extends JFrame {

	public Janela3GridLayout() {
		setTitle("Gerenciador de Layout - Grid Bag Layout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Cria um painel
		JPanel painelConteudo = new JPanel();

		// Define o gerenciador de layout
		painelConteudo.setLayout(new GridBagLayout());

		JButton botao1 = new JButton("Botão 1");
		GridBagConstraints r1 = new GridBagConstraints();
		r1.gridx = 0;
		r1.gridy = 0;
		r1.weightx = 1;
		r1.weighty = 1;
		r1.fill = GridBagConstraints.BOTH;
		r1.gridwidth = 2;
		painelConteudo.add(botao1, r1);

		JButton botao2 = new JButton("Botão 2");
		GridBagConstraints r2 = new GridBagConstraints();
		r2.gridx = 2;
		r2.gridy = 0;
		r2.weightx = 1;
		r2.weighty = 1;
		r2.fill = GridBagConstraints.BOTH;
		painelConteudo.add(botao2, r2);

		JButton botao3 = new JButton("Botão 3");
		GridBagConstraints r3 = new GridBagConstraints();
		r3.gridx = 0;
		r3.gridy = 1;
		r3.weightx = 1;
		r3.weighty = 1;
		r3.fill = GridBagConstraints.BOTH;
		painelConteudo.add(botao3, r3);

		JButton botao4 = new JButton("Botão 4");
		GridBagConstraints r4 = new GridBagConstraints();
		r4.gridx = 1;
		r4.gridy = 1;
		r4.weightx = 1;
		r4.weighty = 1;
		r4.fill = GridBagConstraints.BOTH;
		painelConteudo.add(botao4, r4);

		JButton botao5 = new JButton("Botão 5");
		GridBagConstraints r5 = new GridBagConstraints();
		r5.gridx = 0;
		r5.gridy = 2;
		r5.weightx = 1;
		r5.weighty = 1;
		r5.fill = GridBagConstraints.BOTH;
		painelConteudo.add(botao5, r5);

		JButton botao6 = new JButton("Botão 6");
		GridBagConstraints r6 = new GridBagConstraints();
		r6.gridx = 1;
		r6.gridy = 2;
		r6.weightx = 1;
		r6.weighty = 1;
		r6.fill = GridBagConstraints.BOTH;
		painelConteudo.add(botao6, r6);

		JButton botao7 = new JButton("Botão 7");
		GridBagConstraints r7 = new GridBagConstraints();
		r7.gridx = 2;
		r7.gridy = 1;
		r7.weightx = 1;
		r7.weighty = 1;
		r7.fill = GridBagConstraints.BOTH;
		r7.gridheight = 2;
		painelConteudo.add(botao7, r7);

		// Adiciona o painel de conteúdo
		getContentPane().add(painelConteudo);

		// Mostra a janela
		setVisible(true);
	}

}
