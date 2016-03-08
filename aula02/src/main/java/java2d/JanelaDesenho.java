package java2d;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class JanelaDesenho extends JFrame {

	public JanelaDesenho() {

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		// Cor do objeto a ser desenhado
		g.setColor(Color.BLUE);

		// Quadrado Preenchido
		// posição x e y, altura, e largura)
		g.fillRect(30, 30, 50, 50);

		// Quadrado vazado
		g.setColor(Color.RED);
		g.drawRect(40, 40, 50, 50);

		// Círculo Vazado
		g.setColor(Color.GREEN);
		g.drawOval(130, 30, 50, 50);

		// Círculo PReenchido
		g.fillOval(135, 50, 50, 70);
		
		// Retângulo 3D
		g.setColor(Color.BLUE);
		g.fill3DRect(230, 40, 100, 100, true);

		// Retangulos aredondados
		g.drawRoundRect(30,150,80,40,30,50);
	    g.fillRoundRect(35,155,80,40,30,50);
	    
	    // Arcos
	    g.setColor(Color.darkGray); 	
	    g.drawArc(150,150,80,40,90,270);
	    g.fillArc(160,160,80,40,90,270);
	    
	    // Poligonos
	    g.setColor(Color.magenta); 	
	    int ValoresX[] = {370,450,410,370};
	    int ValoresY[] = {40,40,70,40};
	    g.drawPolygon(ValoresX,ValoresY,4);

	    int ValoresX2[] = {370,450,410,370};
	    int ValoresY2[] = {80,80,120,80};
	    g.fillPolygon(ValoresX2,ValoresY2,4);
	    
	    // Linhas
	    g.setColor(Color.BLACK);
	    g.drawLine(0, 250, 250, 250);
	    
	    // Textos
	    g.setColor(Color.CYAN);
	    g.setFont(new Font("Arial", Font.BOLD, 24));
	    g.drawString("Isso é um texto", 10, 250);
	}

}
