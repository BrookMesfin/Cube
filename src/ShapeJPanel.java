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
	
	int[] xPoints = { 100, 100, 200, 200, 100 };
	int[] x2Points =  { 75, 75, 175, 175, 75 };
	

	int[] yPoints = { 100, 200, 200, 100, 100 };
	int[] y2Points = { 75, 175, 175 ,75, 75 };
	
	Graphics2D g2d = ( Graphics2D ) g;
	GeneralPath cube = new GeneralPath();
	
	cube.moveTo( xPoints[0], yPoints[0]);
	cube.moveTo( x2Points[0], y2Points[0]);

	for ( int i = 1; i <= 4; i++ ) {
	// create the first base
	cube.moveTo( xPoints[ i - 1 ], yPoints[ i - 1 ] );
	cube.lineTo( xPoints[ i ], yPoints[ i ] );

	// create the second base
	cube.moveTo( x2Points[ i - 1 ], y2Points[ i - 1 ] );
	cube.lineTo( x2Points[ i ], y2Points[ i ] );

	// create the lines between the bases
	cube.moveTo( xPoints[ i ], yPoints[ i ] );
	cube.lineTo( x2Points[ i ], y2Points[ i ] );
}

	cube.closePath();
	
	g2d.translate( 300, 300 );
	

	for (int count = 1; count <= 40; count++) {
		g2d.rotate(Math.PI / 20.0);
		
		g2d.setColor(new Color( random.nextInt( 256 ), 
				random.nextInt( 256 ), random.nextInt( 256)));
		g2d.fill ( cube );
		g2d.draw( cube );	
		}
	g2d.draw( cube );
	}

	
}
