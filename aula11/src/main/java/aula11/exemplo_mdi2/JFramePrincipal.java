package aula11.exemplo_mdi2;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import aula11.exemplo_mdi.MenuDeOpcoesOld;

public class JFramePrincipal extends JFrame {
	
	// Gerenciador de janelas
	private JDesktopPane desktop;

	public JFramePrincipal() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Exemplo de janelas MDI");

		// Centralizar janela
		setLocationRelativeTo(null);

		// Instancia o desktop
		desktop = new JDesktopPane();

		// Adiciona a barra de menus
		this.setJMenuBar(new MenuDeOpcoes(desktop));

		// Adicionar os frames internos
		FrameInterno interno1 = new FrameInterno();
		FrameInterno interno2 = new FrameInterno();
		desktop.add(interno1);
		desktop.add(interno2);

		// Adiciona ao frame
		this.setLayout(new BorderLayout());
		this.add(desktop, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new JFramePrincipal().setVisible(true);
	}
}
