package aula08.fabrica.tela;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.Border;

public class LayoutPrincipal extends JPanel {
	
	public LayoutPrincipal() {

		setLayout(new BorderLayout());
		
		JPanel linhas = new JPanel();
		LinhaDeProducao linha1 = new LinhaDeProducao();
		linhas.add(linha1);
		LinhaDeProducao linha2 = new LinhaDeProducao();
		linhas.add(linha2);
		LinhaDeProducao linha3 = new LinhaDeProducao();
		linhas.add(linha3);
		add(linhas, BorderLayout.NORTH);
		
		Estoque estoque = new Estoque();
		add(estoque, BorderLayout.CENTER);
		
		Vendas vendas = new Vendas();
		add(vendas, BorderLayout.SOUTH);
	
	}

}
