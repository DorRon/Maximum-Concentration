import javax.swing.*;
import java.awt.*;

public class Game
{
	public static void main (String args [])
	{
		JFrame game 	= new JFrame();
		Board board 	= new Board (6,4,126,126);
		mcLoader loader = new mcLoader("images");
		board.setBackgrounds(loader.load("columbiana2.png"), loader.load(""));
		game.getContentPane().add(board);
		game.pack();
		game.setVisible(true);
	}
}
