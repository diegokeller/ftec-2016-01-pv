package tela;

import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import excecoes.NegocioException;
import modelo.Produto;
import negocio.ProdutoBO;

public class CadastroProduto extends JFrame {
	
	ProdutoBO bo;
	
	public CadastroProduto() {
		
		bo = new ProdutoBO();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setTitle("Cadastro de Produto");
		
		JButton incluir = new JButton("Incluir");
		incluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Produto produto = new Produto(null, "Abacaxi", 
							"Terra de Areia", 123f, 1, true);
					bo.inserir(produto);
				} catch (NegocioException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(
							null, e1.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		this.getContentPane().add(incluir);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CadastroProduto();		
	}
	

}
