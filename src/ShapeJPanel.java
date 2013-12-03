import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

import javax.swing.JPanel;


public class ShapeJPanel extends JPanel {

	public void paintComponent ( Graphics g )
	{
	super.paintComponent( g );
	Random random = new Random();
	
	int[] xPoints = {5, 75, 75, 5, -15, -15};
		//{5, 55, 55, 5, 5, 0, 0, 55, 55, 0, 40 };
		//{55, 27, 37, 1, 43, 55, 67,109, 73, 83};
	int[] yPoints = {25, 25, 75, 75, 50, 15}; 
		//{30, 30, 72, 72, 60, 40, 30, 100, 100, 30, 40 };
		//{72, 96, 54, 36, 36, 0, 36, 36, 54, 96};
	
	Graphics2D g2d = ( Graphics2D ) g;
	GeneralPath cube = new GeneralPath();
	
	cube.moveTo( xPoints[0], yPoints[0]);
	
	for (int count = 1; count < xPoints.length; count++)
		cube.lineTo( xPoints [count], yPoints [count] );
		
	cube.closePath();
	
	g2d.translate( 150, 150 );
	/*
	for (int count = 1; count <= 20; count++) {
		g2d.rotate(Math.PI / 10.0);
		
		g2d.setColor(new Color( random.nextInt( 256 ), 
				random.nextInt( 256 ), random.nextInt( 256)));
		g2d.draw( cube );	
		}*/
	g2d.draw( cube );
	}

	
}
