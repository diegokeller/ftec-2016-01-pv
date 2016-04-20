package aula08.fabrica.tela;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.Border;

import aula08.fabrica.negocio.Fabrica;

public class LayoutPrincipal extends JPanel {
	
	public LayoutPrincipal() {
		
		setLayout(new BorderLayout());
		
		JPanel linhas = new JPanel();
		PainelLinhaDeProducao linha1 = new PainelLinhaDeProducao();
		linhas.add(linha1);
		PainelLinhaDeProducao linha2 = new PainelLinhaDeProducao();
		linhas.add(linha2);
		PainelLinhaDeProducao linha3 = new PainelLinhaDeProducao();
		linhas.add(linha3);
		add(linhas, BorderLayout.NORTH);
		
		Estoque estoque = new Estoque();
		add(estoque, BorderLayout.CENTER);
		
		Vendas vendas = new Vendas();
		add(vendas, BorderLayout.SOUTH);
	
	}

}
