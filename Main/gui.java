//GUI for Maximum Concentration

import javax.swing.*;
import java.awt.*;

public class gui{
    public static void main(String [] args){
        JFrame ui = new JFrame();
        gui.setTitle("Maximum Concentration");
        gui.setSize(1000, 1200);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setResizable(true);
        String[] borderArray = {
                'n',
                's',
                'e',
                'w'
        };

        for (int i = 0; i < 3; i++)
        {
            JPanel borderArray[i] = new JPanel();
        }

        n.setBackground(Color.cyan);
        s.setBackground(Color.magenta);
        e.setBackground(Color.orange);
        w.setBackground(Color.gray);
        Container link = gui.getContainerPane();
        link.add(n, BorderLayout.NORTH);
        link.add(s, BorderLayout.SOUTH);
        link.add(e, BorderLayout.EAST);
        link.add(w, BorderLayout.WEST);
        gui.setVisible(true);

    }
}
