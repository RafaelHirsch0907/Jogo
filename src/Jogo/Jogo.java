package Jogo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Jogo extends JPanel{
	public Jogo() {
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		desenhar(g);
	}
	
	private void desenhar(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Dimension size = getSize();
		double largura = size.getWidth();
		double altura = size.getHeight();
		
		Ellipse2D ellipse2d = new Ellipse2D.Double(0, 0, 100, 100);
		for(int deg = 0; deg < 360; deg += 5) {
			AffineTransform t  = AffineTransform.getTranslateInstance(largura / 2, altura / 2);
			t.rotate(Math.toRadians(deg));
			g2d.draw(t.createTransformedShape(ellipse2d));
		}
		
	}
}
