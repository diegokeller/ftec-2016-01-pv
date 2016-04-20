package aula08.fabrica.tela;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import aula08.fabrica.negocio.Fabrica;

public class PainelLinhaDeProducao extends JPanel {
	
	private JButton ligar;
	private JButton desligar;
	

	public PainelLinhaDeProducao(final int numero) {
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints r = new GridBagConstraints();
		
		PainelFabrica fabrica = new PainelFabrica();
		r.gridx = 0;
		r.gridy = 0;
		r.ipadx = 140;
		r.ipady = 140;
		r.gridwidth = 2;
		add(fabrica, r);
		
		ligar = new JButton("Ligar");
		ligar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				desligar.setEnabled(true);
				ligar.setEnabled(false);
				Fabrica.getInstancia().ligarLinha(numero);
			}
		});
		r.gridx = 0;
		r.gridy = 1;
		r.ipadx = 0;
		r.ipady = 0;
		r.gridwidth = 1;
		add(ligar, r);
		
		desligar = new JButton("Desligar");
		desligar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				desligar.setEnabled(false);
				ligar.setEnabled(true);
				Fabrica.getInstancia().desligarLinha(numero);
			}
		});
		r.gridx = 1;
		r.gridy = 1;
		r.ipadx = 0;
		r.ipady = 0;
		r.gridwidth = 1;
		add(desligar, r);
		
		
		
	}

}
