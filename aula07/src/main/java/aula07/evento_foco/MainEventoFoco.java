package aula07.evento_foco;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.crypto.SecretKeyFactorySpi;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MainEventoFoco extends JFrame {

	public MainEventoFoco() {
		setSize(400,400);
		setTitle("Evento de Foco");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel conteudo = new JPanel(new FlowLayout());
		
		JTextField campo1 = new JTextFieldDiego(10);
		JTextField campo2 = new JTextFieldDiego(10);
		
		conteudo.add(campo1);
		conteudo.add(campo2);
		
		this.getContentPane().add(conteudo);
	}
	
	public static void main(String[] args) {
		new MainEventoFoco().setVisible(true);
	}

}
