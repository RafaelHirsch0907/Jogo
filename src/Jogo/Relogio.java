package Jogo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

//public class Relogio implements Runnable
public class Relogio extends Thread{
	
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	private JLabel hora;
	
	public Relogio(JLabel hora) {
		this.hora = hora;
	}
	@Override
	public void run() {
		while(true) {
			String valor = sdf.format(new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(hora);
			hora.setText(valor);
		}
	}
}
