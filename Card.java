import javax.swing.*;
import java.awt.*;

public class Card
{
	private String name;
	private ImageIcon image;
	private Component panel;


	public Card (String parName, String parImageName, Component panel)
	{
		name = parName;
		image = new ImageIcon(parImageName);
		this.panel = panel;
	}

	public String ToString()
	{
		return name;
	}

	public boolean equals(Card parCard)
	{
		return ( name.equals( parCard.getName()));
	}

	public String getName()
	{
		return name;
	}
	public void draw (Graphics g, int  x, int y)
	{
		image.paintIcon(panel,g, x,y);
		g.drawRect(x,y,image.getIconWidth(),image.getIconHeight());
	}
}

