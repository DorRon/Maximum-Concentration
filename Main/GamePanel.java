import javax.swing.*;
import java.awt.*;
public class GamePanel extends JPanel
{

	public GamePanel()
	{
		super();
		setLayout(new GridLayout(6,44));
		for(int i = 0; i < 4; i++){
		this.add( new Card ("cat.png"));
		this.add( new Card ("frog.png"));
		this.add( new Card ("devid.png"));
		this.add( new Card ("hedgehog.png"));
		this.add( new Card ("leopard.png"));
		this.add( new Card ("snow_leopard.png"));
		this.add( new Card ("black_leopard.png"));
		this.add( new Card ("dog.png"));
		this.add( new Card ("owl.png"));
		this.add( new Card ("panda.png"));
		this.add( new Card ("koala.png"));
		this.add( new Card ("dog.gif"));
		}
	}
}
