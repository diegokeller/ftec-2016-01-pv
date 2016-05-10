package aula11.exemplo_mdi2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuDeOpcoes extends JMenuBar {

	public MenuDeOpcoes() {
		
		// Cria o menu arquivo
		JMenu arquivo = new JMenu("Arquivo");
		
		// Tecla de atalho com ALT
		arquivo.setMnemonic(KeyEvent.VK_A);
		
		// Adiciona o menu na barra
		this.add(arquivo);
		
		// Cria a opção sair dentro do menu arquivo
		JMenuItem arquivoSair = new JMenuItem("Sair");
		arquivoSair.setMnemonic(KeyEvent.VK_S);
		arquivoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		arquivo.add(arquivoSair);
		
		// Separador
		arquivo.addSeparator();
		
		JMenuItem arquivoFechar = new JMenuItem("Fechar");
		arquivo.add(arquivoFechar);
		
		JMenu clientes = new JMenu("Clientes");
		this.add(clientes);
		
		JMenu mais = new JMenu("Mais");
		mais.add(new JMenuItem("Mais 1"));
		mais.add(new JMenuItem("Mais 2"));
		clientes.add(mais);
	}
	
}
