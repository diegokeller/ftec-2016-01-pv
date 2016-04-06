package aula06.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JanelaEventos extends JFrame {

	public JanelaEventos() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Tratamento de Eventos");

		JPanel conteudo = new JPanel();

		JButton botao1 = new JButton("Botão 1");
		conteudo.add(botao1);

		// Evento de click em um botão
		// Classe separada
		AcaoMostrarMensagem acao = new AcaoMostrarMensagem();
		botao1.addActionListener(acao);

		////

		JButton botao2 = new JButton("Botão 2");
		conteudo.add(botao2);

		// Evento de click em um botão
		// Classe anonima
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Clicou no botão 2.");
			}
		});

		///

		JButton botao3 = new JButton("Botão 3");
		conteudo.add(botao3);

		// Evento de click em um botão
		// Java 8 Lambda Expressions
		botao3.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Clicou no botão 3.");
		});

		// Eventos de mouse
		// this.addMouseListener(new TratarEventosMouse());
		// this.addMouseMotionListener(new TratarMovimentoMouse());
		// this.addMouseWheelListener(new TratarScrollMouse());
		
		JTextField campo = new JTextField(10);
		String texto = campo.getText(); // Texto do campo
		conteudo.add(campo);
		this.setFocusable(true);
		this.addKeyListener(new TratarTeclado());

		getContentPane().add(conteudo);

	}

	public static void main(String[] args) {
		new JanelaEventos().setVisible(true);
	}

}
