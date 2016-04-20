package aula08.fabrica.tela;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelLinhaDeProducao extends JPanel {
	
	public PainelLinhaDeProducao() {
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints r = new GridBagConstraints();
		
		PainelFabrica fabrica = new PainelFabrica();
		r.gridx = 0;
		r.gridy = 0;
		r.ipadx = 140;
		r.ipady = 140;
		r.gridwidth = 2;
		add(fabrica, r);
		
		JButton ligar = new JButton("Ligar");
		r.gridx = 0;
		r.gridy = 1;
		r.ipadx = 0;
		r.ipady = 0;
		r.gridwidth = 1;
		add(ligar, r);
		
		JButton desligar = new JButton("Desligar");
		r.gridx = 1;
		r.gridy = 1;
		r.ipadx = 0;
		r.ipady = 0;
		r.gridwidth = 1;
		add(desligar, r);
		
		
		
	}

}
