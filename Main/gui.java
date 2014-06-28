//GUI for Maximum Concentration

import javax.swing.*;
import java.awt.*;

public class gui{
    public static void main(String [] args){
        JFrame ui = new JFrame();
        ui.setTitle("Maximum Concentration");
        ui.setSize(1000, 1200);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setResizable(true);
        JPanel n = new JPanel();
        n.setBackground(Color.cyan);
        JPanel s = new JPanel();
        s.setBackground(Color.magenta);
        JPanel e = new JPanel();
        e.setBackground(Color.orange);
        JPanel w = new JPanel();
        w.setBackground(Color.red);
        Container link = ui.getContentPane();
        link.add(n, BorderLayout.NORTH);
        link.add(s, BorderLayout.SOUTH);
        link.add(e, BorderLayout.EAST);
        link.add(w, BorderLayout.WEST);
        ui.setVisible(true);

    }
}
