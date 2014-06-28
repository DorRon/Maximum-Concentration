import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel
{
	Card a,b,c,d;
	public GamePanel()
	{
		super();
		a = new Card( "dog","dog.gif",this);
	}

	public void paintComponent( Graphics g)
	{
		super.paintComponent(g);
		a.draw(g,0,0);
	}
}
