package bounce;

import javax.swing.*;
import java.awt.*;

/**
 * Created by LLL on 15/10/7.
 */
public class Bounce {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
