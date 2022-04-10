package Jogo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal extends JFrame {
	private JLabel hora = new JLabel();
	
	public Principal() {
		initUI();
		
		new Relogio(hora).start();
	}

	private void initUI() {
		//setLayout(new FlowLayout());
		setTitle("Aplicação");
		setSize(400, 500);
		setLocationRelativeTo(null);
		add(new Jogo());
		setVisible(true);
		add(hora, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				Principal janela = new Principal();

			}

		});
	}

}
