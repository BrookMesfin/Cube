import java.awt.Color;
import javax.swing.JFrame;

public class Cube {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ( "Cube" );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ShapeJPanel shapeJPanel = new ShapeJPanel();
		frame.add( shapeJPanel );
		frame.setBackground( Color.WHITE);
		frame.setSize(315, 350);
		frame.setVisible( true );
		

	}

}
