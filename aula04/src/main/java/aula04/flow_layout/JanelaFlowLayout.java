package aula04.flow_layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaFlowLayout extends JFrame {
	
	public JanelaFlowLayout() {
		setTitle("Gerenciador de Layout - Flow Layout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Cria um novo painel
		JPanel conteudo = new JPanel();
		
		// Define o gerenciador de layout
		// Por padrão todo o painel usa FlowLayout
		conteudo.setLayout(new FlowLayout());
		
		// Cria um botão
		JTextField campoNome = new JTextField(10);
		JButton ok = new JButton("OK");
		JLabel rotulo = new JLabel("Clique para cancelar:");
		JButton cancelar = new JButton("Cancelar");
		JButton b1 = new JButton("Botão 1");
		JButton b2 = new JButton("Botão 2");
		JButton b3 = new JButton("Botão 3");
		
		// Adiciona o botão no painel
		conteudo.add(campoNome);
		conteudo.add(ok);
		conteudo.add(rotulo);
		conteudo.add(cancelar);
		conteudo.add(b1);
		conteudo.add(b2);
		conteudo.add(b3);
		
		// Adiciona o painel à janela
		this.add(conteudo);
		
		// Mostra a janela
		setVisible(true);
	}

}
