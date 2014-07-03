import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.awt.*;

public class Tile
{
	private int x,y;
	private static int width,height;
	private boolean isSelected = false;
	private BufferedImage front;
	private static BufferedImage back;

	public static void init ( BufferedImage pBack, int pWidth, int pHeight)
	{
		back = pBack;
		width = pWidth;
		height = pHeight;
	}

	public Tile ( int pX, int pY, BufferedImage pFront)
	{
		x     = pX    ; y      = pY;
		front = pFront;
	}

	public void draw ( Graphics g)
	{
		if ( isSelected)
		{
			g.drawImage (front,x,y,width,height,null);
		}
		else
		{
			g.drawImage(back,x,y,width,height,null);
		}
		g.drawRect(x,y,width,height);
	}

	public boolean isPointInside (int pX, int pY)
	{
		int mX = x + width;
		int mY = y + height;
		if ( x <= pX && pX <= mX && y <= pY && pY <= mY)
		{
			return true;
		}
		return false;
	}

	public void setSelected ( boolean pIsSelected)
	{
		isSelected = pIsSelected;
	}
}
