package aula05.grid_bag_layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela4GridLayout extends JFrame {

	public Janela4GridLayout() {
		setTitle("Gerenciador de Layout - Grid Bag Layout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Define o layout
		this.getContentPane().setLayout(new GridBagLayout());
		
		JButton botao1 = new JButton("Botão 1");
		GridBagConstraints r1 = new GridBagConstraints();
		r1.gridx = 0;
		r1.gridy = 0;
		r1.insets = new Insets(10, 10, 10, 10);
		this.getContentPane().add(botao1, r1);
		
		JPanel painelCentral = new JPanel();
		GridBagConstraints r3 = new GridBagConstraints();
		r3.gridx = 0;
		r3.gridy = 1;
		r3.weightx = 1;
		r3.weighty = 1;
		r3.fill = GridBagConstraints.BOTH;
		this.getContentPane().add(painelCentral, r3);

		JButton botao2 = new JButton("Botão 2");
		GridBagConstraints r2 = new GridBagConstraints();
		r2.gridx = 0;
		r2.gridy = 2;
		r2.ipadx = 50;
		r2.ipady = 50;
		r2.insets = new Insets(20, 20, 20, 20);
		this.getContentPane().add(botao2, r2);

		// Mostra a janela
		setVisible(true);
	}

}
