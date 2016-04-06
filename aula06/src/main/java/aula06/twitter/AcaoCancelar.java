package aula06.twitter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoCancelar implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// Finaliza o programa
		System.exit(0);
	}

}
