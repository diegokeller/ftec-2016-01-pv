package aula08.fabrica.tela;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.Border;

import aula08.fabrica.negocio.Fabrica;

public class LayoutPrincipal extends JPanel {
	
	public LayoutPrincipal() {
		
		setLayout(new BorderLayout());
		
		JPanel linhas = new JPanel();
		PainelLinhaDeProducao linha1 = new PainelLinhaDeProducao(0);
		linhas.add(linha1);
		PainelLinhaDeProducao linha2 = new PainelLinhaDeProducao(1);
		linhas.add(linha2);
		PainelLinhaDeProducao linha3 = new PainelLinhaDeProducao(2);
		linhas.add(linha3);
		add(linhas, BorderLayout.NORTH);
		
		PainelEstoque estoque = new PainelEstoque();
		add(estoque, BorderLayout.CENTER);
		
		PainelVendas vendas = new PainelVendas();
		add(vendas, BorderLayout.SOUTH);
	
	}

}
