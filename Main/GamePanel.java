import javax.swing.*;
import java.awt.*;
public class GamePanel extends JPanel
{

	public GamePanel()
	{
		super();
		setLayout(new GridLayout(2,2));
		this.add( new Card ("cat.png"));
		this.add( new Card ("frog.png"));
		this.add( new Card ("cat.png"));
		this.add( new Card ("frog.png"));
	}
}
