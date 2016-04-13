package aula07.evento_janela;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.crypto.SecretKeyFactorySpi;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MainEventoJanela extends JFrame {

	public MainEventoJanela() {
		setSize(400,400);
		setTitle("Evento de Janela");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Eventos de janela
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.out.println("Fechando a janela.");
			}
		});
	}
	
	public static void main(String[] args) {
		new MainEventoJanela().setVisible(true);
	}

}
