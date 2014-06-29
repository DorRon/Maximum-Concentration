import javax.swing.*;
import java.awt.*;
public class GamePanel extends JPanel
{

	public GamePanel()
	{
		super();
		setLayout(new GridLayout(6,48));
		RandomImage random = new RandomImage("E:\\Codes\\New folder\\Icons");

		for(int i = 0; i < 48; i++){
		add( new Card (random.getImage()));
		}
	}
}
