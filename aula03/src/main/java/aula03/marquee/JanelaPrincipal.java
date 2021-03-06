package aula03.marquee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JanelaPrincipal extends JFrame {

	private int x = 400;
	
	public JanelaPrincipal() {
		this.setTitle("Sistema de Envio de NF-e");
		this.setSize(400, 400);
		this.setVisible(true);
		while(true){
			x -= 5;
			if(x <= 0){
				x = 400;
			}
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			SwingUtilities.invokeLater(() -> {
				this.repaint();
			});
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.setFont(new Font("Arial", Font.BOLD, 24));
		g.drawString("Bem vindo a 1995", x, 100);
	}
	
}
