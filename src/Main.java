import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static class DrawingBoard extends JFrame{
		
		public DrawingBoard() {
			
			this.setTitle("Mandelbrot Set");
			this.add(new MandelbrotGenerator());
			this.pack();
			this.setResizable(false);
			this.setVisible(true);
		}	
	}
	
	public static void main(String[] args) {new DrawingBoard();}

}
