package aula06.twitter;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PrincipalComGridBagLayout extends JPanel {

	public PrincipalComGridBagLayout() {

		this.setLayout(new GridBagLayout());

		JLabel label = new JLabel("Mensagem:");
		GridBagConstraints cLabel = new GridBagConstraints();
		cLabel.gridx = 0;
		cLabel.gridy = 0;
		cLabel.weightx = 1;
		cLabel.weighty = 0.1;
		cLabel.anchor = GridBagConstraints.WEST;
		this.add(label, cLabel);

		JTextArea campo = new JTextArea();
		GridBagConstraints cCampo = new GridBagConstraints();
		cCampo.gridx = 0;
		cCampo.gridy = 1;
		cCampo.weightx = 1;
		cCampo.weighty = 0.8;
		cCampo.fill = GridBagConstraints.BOTH;
		this.add(campo, cCampo);

		JLabel contador = new JLabel("X caracteres restantes.");
		GridBagConstraints cContador = new GridBagConstraints();
		cContador.gridx = 0;
		cContador.gridy = 2;
		cContador.weightx = 1;
		cContador.weighty = 0.1;
		cContador.anchor = GridBagConstraints.EAST;
		this.add(contador, cContador);
	}

}
