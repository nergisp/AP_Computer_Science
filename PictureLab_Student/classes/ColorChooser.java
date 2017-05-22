import javax.swing.JColorChooser;
import javax.swing.JFrame;
import java.awt.Color;
	
public class ColorChooser 
{
	
	public static Color pickAColor()
	{
		Color color = Color.white;
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		color = JColorChooser.showDialog(frame,"Pick a color",color);
		
		return color;
	}
	
	public static void main(String[] args)
	{
		Color pickedColor = ColorChooser.pickAColor();
		System.out.println(pickedColor);
	}
	
}
