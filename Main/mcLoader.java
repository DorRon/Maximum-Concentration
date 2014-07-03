import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.*;
import java.util.*;

public class mcLoader
{
	private String dir;

	public mcLoader ( String pDir)
	{
		dir = pDir;
	}

	public BufferedImage load ( String name)
	{
		BufferedImage img = null;
		try
		{
			img = ImageIO.read( new File( dir+"/" + name));
		}
		catch (IOException e){ e.printStackTrace();}

		return img;
	}

	public ArrayList<BufferedImage> loadAll()
	{
		ArrayList<BufferedImage> imgs = new ArrayList<BufferedImage>();

		try
		{
			File [] files = new File(dir).listFiles();
			for ( File file : files)
			{
				imgs.add( ImageIO.read(file));
			}
		}
		catch (IOException e) {}

		return imgs;
	}

	public ArrayList<BufferedImage> loadAll(int times)
	{
		ArrayList<BufferedImage> imgs = loadAll();
		ArrayList<BufferedImage> total = new ArrayList<BufferedImage>();
		for ( int i = 0; i < times; i+=1)
		{
			total.addAll(imgs);
		}
		return total;
	}
}
