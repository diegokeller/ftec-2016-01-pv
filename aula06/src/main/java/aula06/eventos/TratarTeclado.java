package aula06.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TratarTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(
				"Tecla digitada - " + 
						e.getKeyCode() + " " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Tecla Pressionada");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Tecla Solta");

	}

}
