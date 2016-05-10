package aula11.exemplo_mdi;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class MeuFrame extends JFrame {
	
	// Gerenciador de janelas
	private JDesktopPane desktop;

	public MeuFrame() {
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Exemplo de janelas MDI");
		
		// Centralizar janela - Dica do Everton ;-)
		setLocationRelativeTo(null);
		
		// Instancia o desktop
		desktop = new JDesktopPane();
		
		// Adiciona a barra de menus
		this.setJMenuBar(new MenuDeOpcoesOld());
		
		// Adiciona ao frame
		this.setLayout(new BorderLayout());
		this.add(desktop, BorderLayout.CENTER);
		
		// Adiciona um frame ao desktop
		desktop.add(new FrameOla());
		desktop.add(new FrameOla());
		
	}
	
}
