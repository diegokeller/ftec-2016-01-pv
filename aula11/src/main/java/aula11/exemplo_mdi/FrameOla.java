package aula11.exemplo_mdi;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class FrameOla extends JInternalFrame {

	public FrameOla() {
		
		this.add(new JLabel("Olá"));
		this.setSize(400, 400);
		this.setVisible(true);
		
		// Outras opções de frames
		
		// Título do frame
		this.setTitle("Olá! Bem vindo!");
		
		// Define que o frame pode ser fechado
		this.setClosable(true);
		
		// Define que o frame pode ser minimizado
		this.setIconifiable(true);
		
		
		
		
		// Pode ser redimensionável
		this.setResizable(true);
		
		// Pode ser maximizado
		this.setMaximizable(true);
		
		// Definir a posição
		this.setLocation(100, 100);
		
	}
	
}
