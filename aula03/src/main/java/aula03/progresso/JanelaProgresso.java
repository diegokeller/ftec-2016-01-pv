package aula03.progresso;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JanelaProgresso extends JFrame {

	private int x = 0;

	public JanelaProgresso() {
		this.setTitle("Progresso");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.getContentPane().setLayout(new FlowLayout());
		JButton ok = new JButton("OK");
		this.getContentPane().add(ok);
		ok.addActionListener((e) -> {
			new ThreadProgresso(this).start();
		});

		this.setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillRect(50, 100, x, 30);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
