package aula07.evento_foco;

import javax.swing.JTextField;

/**
 * Usamos herança para criar nossa classe de campo de texto.
 * Vamos adicionar o listener de troca de cor de fundo.
 * @author Diego
 *
 */
public class JTextFieldDiego extends JTextField {

	public JTextFieldDiego(int colunas) {
		super(colunas);
		addFocusListener(new TrocarCorDeFundo());
	}
	
}
