package aula06.eventos;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class TratarScrollMouse implements MouseWheelListener {

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("Mouse - Scroll " + e.getWheelRotation() 
			+ " " + e.getScrollAmount());
	}

}
