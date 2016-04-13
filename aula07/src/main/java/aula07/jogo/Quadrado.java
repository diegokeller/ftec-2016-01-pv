package aula07.jogo;

import java.awt.Color;
import java.awt.Rectangle;

public class Quadrado extends Rectangle {

	private Color cor;

	public Quadrado() {
		// Posição X aleatória
		this.x = (int) (Math.random() * 400);
		
		// Y começa em zero
		this.y = 0;
		
		// Altura e largura
		this.width = 50;
		this.height = 50;
		
		// Algumas cores
		Color[] cores = new Color[] { Color.RED, Color.BLACK, Color.YELLOW,
				Color.ORANGE, Color.MAGENTA, Color.WHITE };
		
		// Uma cor aleatória
		int iCor = (int) (Math.random() * cores.length);
		this.cor = cores[iCor];
	}

	public Color getCor() {
		return cor;
	}

}
