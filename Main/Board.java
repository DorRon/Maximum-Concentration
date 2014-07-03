import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Board extends JPanel
{
	private int tilesPerRow, tilesPerColumn;
	private int tileWidth  , tileHeight;
	private int width      , height;
	private BufferedImage background;
	private ArrayList<Tile> tiles;
	private ArrayList<BufferedImage> imgs;
	public Board (int pTilesPerRow, int pTilesPerColumn, int pTileWidth, int pTileHeight)
	{
		super();
		tilesPerRow    = pTilesPerRow;
		tilesPerColumn = pTilesPerColumn;
		tileWidth      = pTileWidth;
		tileHeight     = pTileHeight;
		width          = tilesPerRow    * tileWidth;
		height         = tilesPerColumn * tileHeight;
		setPreferredSize(new Dimension (width,height ));
		tiles          = new ArrayList<Tile>();
		mcLoader load  = new mcLoader("images//tiles");
		imgs = load.loadAll(2);
		Collections.shuffle(imgs);
		int i = 0;
		for ( BufferedImage img : imgs)
		{	int x = i % tilesPerRow;
			int y = (i-x) / tilesPerRow;
			Tile tile = new Tile(x*tileWidth,y*tileHeight,img);
			tiles.add(tile);
			i+=1;
		}

		addMouseListener(new mcMouseListener());
	}

	public void setBackgrounds ( BufferedImage pBackground, BufferedImage pTileBackground)
	{
		background = pBackground;
		Tile.init(pTileBackground,tileWidth, tileHeight);
	}

	public void paintComponent (Graphics g)
	{
		g.drawImage(background,0,0,width,height,null);
		for ( Tile tile : tiles)
		{
			tile.draw(g);
		}
	}


class mcMouseListener extends MouseAdapter
{
	public void mousePressed( MouseEvent e)
	{
		int mouseX = e.getX();
		int mouseY = e.getY();
		for( Tile tile : tiles)
		{
			if (tile.isPointInside(mouseX,mouseY))
			{
				tile.setSelected(true);
				repaint();
			}
		}
	}
}

}

