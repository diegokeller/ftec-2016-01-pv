package janela_heranca;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MinhaJanela extends JFrame {

	public MinhaJanela() {
		this.setTitle("Minha Janela");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

		// Configure se pode ou não redimensionar a janela
		this.setResizable(true);

		// Trocar a cor de fundo da janela - Cores predefinidas
		this.getContentPane().setBackground(Color.BLUE);
		this.getContentPane().setBackground(new Color(150, 150, 150));

		// Pega o Toolkit
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// Ícone da janela
		Image icone = toolkit.getImage("src/main/resources/user.png");
		this.setIconImage(icone);
		
		// Define a posição da janela
		this.setLocation(250, 250);
		
		// Centraliza a janela
		this.setLocationRelativeTo(null);
		
	}

}
