package aula08.fabrica.tela;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PainelFabrica extends JPanel {
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Image fabrica;
		try {
			File arquivo = new File("src/main/resources/fabrica.png");
			System.out.println(arquivo.getAbsolutePath()
					);
			fabrica = ImageIO.read(arquivo);
			g.drawImage(fabrica, 0, 0, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
