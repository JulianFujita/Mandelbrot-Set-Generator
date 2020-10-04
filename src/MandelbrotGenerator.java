import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class MandelbrotGenerator extends JPanel{
	
	private final Color BACKGROUND_COLOR = Color.BLACK;
	private final Dimension SIZE = new Dimension(600, 600);
	private final Point CENTER = new Point(SIZE.width / 2, SIZE.height / 2);
	private final int LIMIT = 2;
	private final int ITERATIONS = 100;
	
	public MandelbrotGenerator() {
		
		this.setPreferredSize(SIZE);
		this.setBackground(BACKGROUND_COLOR);
	}

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		
		
	}	
}
