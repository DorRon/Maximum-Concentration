import java.util.*;
import java.io.File;
import javax.swing.*;

public class RandomImage
{
	List<ImageIcon> images = new ArrayList<ImageIcon>();
	private static Random random = new Random();
	public RandomImage (String dir)
	{
		File[] files = new File(dir).listFiles();
		images = new Vector();
		for(File x : files)
		{
			images.add(new ImageIcon ( x.getName()));
		}
	}

	public ImageIcon getImage()
	{
		return images.get(random.nextInt(images.size()));
	}
}
