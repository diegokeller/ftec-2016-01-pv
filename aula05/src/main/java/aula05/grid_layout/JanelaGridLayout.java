package aula05.grid_layout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaGridLayout extends JFrame {

	public JanelaGridLayout() {
		setTitle("Gerenciador de Layout - Grid Layout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Cria um painel
		JPanel painelConteudo = new JPanel();

		// Define o gerenciador de layout
		// 2 linhas por 2 colunas
		painelConteudo.setLayout(new GridLayout(2, 2));

		JButton salvar = new JButton("Salvar");
		painelConteudo.add(salvar);
		JButton excluir = new JButton("Excluir");
		painelConteudo.add(excluir);
		JButton voltar = new JButton("Voltar");
		painelConteudo.add(voltar);
//		JButton confirmar = new JButton("Confirmar");
//		painelConteudo.add(confirmar);

		// Adiciona o painel de conteúdo
		getContentPane().add(painelConteudo);

		// Mostra a janela
		setVisible(true);
	}

}
