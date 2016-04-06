package aula06.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class TratarMovimentoMouse implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse - Arrastou");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out
				.println("Mouse - Moveu X = " + 
						e.getX() + " Y = " + e.getY());
	}

}
