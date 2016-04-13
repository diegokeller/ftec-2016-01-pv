package aula07.jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JanelaJogo extends JFrame {

	private int xNave = 250;

	private GerenciadorDeQuadrados gerenciador;

	public JanelaJogo() {

		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Jogo");
		setVisible(true);
		
		// Cri e inicia a thread que gerencia os quadrados
		gerenciador = new GerenciadorDeQuadrados();
		gerenciador.start();

		// Responder aos eventos de mouse movimentado
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				super.mouseMoved(e);
				xNave = e.getX();
				repaint();
			}
		});
		
		// Atualizar a tela continuamente
		while(true){
			// Sleep
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			// Atualizar
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					repaint();
				}
			});
		}

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.BLUE);
		if (xNave < 60) {
			xNave = 60;
		}
		if (xNave > 340) {
			xNave = 340;
		}
		g.fillRect(xNave - 50, 370, 100, 20);

		// Percore os quadrados e desenhar
		List<Quadrado> quadrados = gerenciador.getQuadrados();
		for (Quadrado quadrado : quadrados) {
			g.setColor(quadrado.getCor());
			g.fillRect((int) quadrado.getX(), (int) quadrado.getY(),
					(int) quadrado.getWidth(), (int) quadrado.getHeight());
		}
	}

}
