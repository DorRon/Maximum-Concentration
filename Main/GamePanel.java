import javax.swing.*;
import java.awt.*;
public class GamePanel extends JPanel
{
	String directory = "E:\\Codes\\New folder\\Icons\\";
	public GamePanel()
	{
		super();
		setLayout(new GridLayout(2,2));
		this.add( new Card (directory+"cat.png"));
		this.add( new Card (directory+"frog.png"));
		this.add( new Card (directory+"cat.png"));
		this.add( new Card (directory+"frog.png"));
	}
}
