package aula08.fabrica.tela;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import aula08.fabrica.negocio.Fabrica;

public class PainelEstoque extends JPanel {

	public PainelEstoque() {

		setLayout(new GridLayout(2, 1));

		final JLabel estoque = new JLabel("Estoque");
		estoque.setFont(new Font("Arial", Font.BOLD, 14));
		add(estoque);

		final JProgressBar progresso = new JProgressBar(0, 100);
		progresso.setPreferredSize(new Dimension(460, 30));
		add(progresso);

		Thread atualizarContadorEstoque = new Thread(new Runnable() {

			public void run() {
				while (true) {
					// Espera meio segundo
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// Atualiza o progresso
					progresso.setValue(Fabrica.getInstancia().getEstoque());
					estoque.setText("Estoque: " + Fabrica.getInstancia().getEstoque().toString());
				}
			}
		});
		atualizarContadorEstoque.start();
	}

}
