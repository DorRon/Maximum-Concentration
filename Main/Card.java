import javax.swing.*;
import java.awt.*;

public class Card extends JButton
{
	private String name;
	private ImageIcon image;
	private static String directory = "E:\\Codes\\New folder\\Icons\\";
	public Card ( String parImageName)
	{
		super(new ImageIcon (directory+parImageName));
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

