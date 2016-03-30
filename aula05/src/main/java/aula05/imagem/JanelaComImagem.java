package aula05.imagem;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JanelaComImagem extends JFrame {
	
	public JanelaComImagem() {
		this.setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Image computador;
		try {
			File arquivo = new File("src/main/java/aula05/imagem/computador.jpg");
			computador = ImageIO.read(arquivo);
			g.drawImage(computador, 50, 50, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
