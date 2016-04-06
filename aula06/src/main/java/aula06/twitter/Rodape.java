package aula06.twitter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Rodape extends JPanel {

	private JButton cancelar;

	public Rodape() {
		
		// Botão OK
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Mostra a mensagem
				JOptionPane.showMessageDialog(null, "Mensagem enviada!");
				cancelar.doClick();
			}
		});
		this.add(ok);
		
		cancelar = new JButton("Cancelar");
		cancelar.addActionListener(new AcaoCancelar());
		this.add(cancelar);
		
	}
	
}