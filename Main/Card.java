import javax.swing.*;
import java.awt.*;

public class Card extends JButton
{
	private String name;
	private ImageIcon image;
	public Card ( String parImageName)
	{
		super(new ImageIcon (parImageName));
	}
	public Card (ImageIcon image)
	{
		super(image);
	}

	public boolean equals(Card parCard)
	{
		return ( name.equals( parCard.getName()));
	}

	public String getName()
	{
		return name;
	}
}
