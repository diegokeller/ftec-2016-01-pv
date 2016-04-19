package aula08.fabrica.tela;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vendas extends JPanel {

	public Vendas() {

		setLayout(new GridLayout(2, 2));

		JLabel vendas = new JLabel(" Vendas");
		vendas.setFont(new Font("Arial", Font.BOLD, 14));
		add(vendas);

		JLabel vendasContador = new JLabel("123 carros vendidos");
		add(vendasContador);

		JButton vender = new JButton("Vender");
		add(vender);

	}

}
