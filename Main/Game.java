import javax.swing.*;
import java.awt.*;

public class Game
{
	public static void main (String args [])
	{
		JFrame game 	= new JFrame();
		Board board 	= new Board (6,4,126,126 );
		mcLoader loader = new mcLoader("Images");
		board.setBackgrounds(loader.load("Background.png"), loader.load("tileBackground.png"));
		game.getContentPane().add(board);
		game.pack();
		game.setVisible(true);
	}
}
