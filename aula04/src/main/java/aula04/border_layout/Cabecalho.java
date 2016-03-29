package aula04.border_layout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cabecalho extends JPanel {

	private String titulo;

	private Color corDeFundo;

	public Cabecalho(String titulo, Color corDeFundo) {
		super();
		this.titulo = titulo;
		this.corDeFundo = corDeFundo;
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel tituloCabecalho = new JLabel(titulo);
		tituloCabecalho.setFont(new Font("Arial", Font.BOLD, 24));
		tituloCabecalho.setForeground(Color.WHITE);
		this.setBackground(corDeFundo);
		
		
		this.add(tituloCabecalho);
	}

}
