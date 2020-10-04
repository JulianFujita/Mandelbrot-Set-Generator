import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class MandelbrotGenerator extends JPanel{
	
	private final Color BACKGROUND_COLOR = Color.BLACK;
	private final Dimension SIZE = new Dimension(800, 800);
	private final int ITERATIONS = 100;
	private final int LIMIT = 2;
	private final double STEP = 0.01;
	
	private int currentX = 0;
	private int currentY = SIZE.height;
	
	public MandelbrotGenerator() {
		
		this.setPreferredSize(SIZE);
		this.setBackground(BACKGROUND_COLOR);
	}

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		ComplexNumber z = new ComplexNumber(0, 0);
		
		// For every x value
		for(double x = -2; x <= 2; x += STEP) {
			
			// For every i value
			for(double i = -2; i <= 2; i += STEP) {
				
				// For every specific point
				ComplexNumber c = new ComplexNumber(x,  i);
				z.resetToZero();
				
				for(int iter = 0; iter < ITERATIONS; iter++) {
					
					z.square();
					z.add(c);
				}
				
				if(z.getReal() < LIMIT && z.getImaginary() < LIMIT) {
					g.drawRect(currentX, currentY, 1, 1);
				}
				currentY--;
				
			}
			currentY = SIZE.height;
			currentX++;
		}
		
	}	
}
