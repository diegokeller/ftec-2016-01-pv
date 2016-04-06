package aula06.sem_layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaSemLayout extends JFrame {
	
	public JanelaSemLayout() {
		setTitle("Sem gerenciador de layout - Usando setBounds");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Cria um painel para o conteúdo
		// Passa NULL como o gerenciador de layout
		// Isso indica que é feito SEM layout
		JPanel conteudo = new JPanel(null);
		
		// Cria os componentes
		JLabel labelNome = new JLabel("Nome:");
		JTextField campoNome = new JTextField();
		JButton botaoOk = new JButton("OK");
		
		// Define os limites (bounds dos componentes)
		labelNome.setBounds(20, 10, 100, 25); // X, Y, Largura e Altura
		conteudo.add(labelNome);
		
		campoNome.setBounds(70, 10, 100, 25); // X, Y, Largura e Altura
		conteudo.add(campoNome);
		
		botaoOk.setBounds(180, 10, 70, 25); // X, Y, Largura e Altura
		conteudo.add(botaoOk);
		
		// Adiciona o conteudo à janela
		this.getContentPane().add(conteudo);
		
	}
	
	public static void main(String[] args) {
		new JanelaSemLayout().setVisible(true);
	}

}
