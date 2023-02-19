import javax.swing.*;
import java.awt.*;

public class GameFrame {

    JFrame frame;


    GamePanel panel;
    GameFrame()
    {
        frame=new JFrame("Pong game");
//        frame.setLayout(null);
       frame.setSize(1000,555);
        panel =new GamePanel();
       // panel.setBounds(0,0,1000,555);

        frame.add(panel);
        frame.setBackground(Color.black);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);


    }

}
