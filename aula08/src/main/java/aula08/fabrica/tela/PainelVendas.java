package aula08.fabrica.tela;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import aula08.fabrica.negocio.Fabrica;

public class PainelVendas extends JPanel {

	public PainelVendas() {

		setLayout(new GridLayout(2, 2));

		JLabel vendas = new JLabel(" Vendas");
		vendas.setFont(new Font("Arial", Font.BOLD, 14));
		add(vendas);

		final JLabel vendasContador = new JLabel("0 carros vendidos");
		Thread atualizarContadorVendas = new Thread(new Runnable() {

			public void run() {
				while (true) {
					// Espera meio segundo
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// Atualiza o contador
					vendasContador.setText(Fabrica.getInstancia().getVendas()
							+ " carros vendidos.");
				}
			}
		});
		atualizarContadorVendas.start();
		add(vendasContador);

		JButton vender = new JButton("Vender");
		vender.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Fabrica.getInstancia().vender();
			}
		});
		add(vender);

	}

}
