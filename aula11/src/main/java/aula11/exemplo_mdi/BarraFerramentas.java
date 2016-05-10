package aula11.exemplo_mdi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class BarraFerramentas extends JToolBar {

	public BarraFerramentas() {
		
		
		JButton alerta = new JButton("Alerta");
		alerta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cuidado!!!!", "Alerta", JOptionPane.WARNING_MESSAGE, null);
			}
		});
		this.add(alerta);
		
		JButton usuario = new JButton(new ImageIcon("user.png"));
		usuario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Usuários");
			}
		});
		this.add(usuario);
		
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.add(sair);
	}
	
}
