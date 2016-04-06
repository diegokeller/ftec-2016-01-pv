package aula06.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TratarEventosMouse implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse - Clicou X = " + e.getX() + " Y = " + e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse - Pressionou");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse - Soltou");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse - Entrou");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse - Saiu");
	}

}
