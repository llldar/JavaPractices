package debugger;

import javax.swing.*;
import java.awt.*;

/**
 * Created by LLL on 15/8/14.
 */
public class BuggyButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BuggyButtonFrame();
                frame.setTitle("BuggyButtonTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
