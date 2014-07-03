import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
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
		mcLoader load  = new mcLoader("Images\\tiles");
		imgs = load.loadAll(2);
		Collections.shuffle(imgs);
		for ( BufferedImage img : imgs)
		{
			Tile tile = new Tile(10,20,img);
			tiles.add(tile);
		}
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

}
