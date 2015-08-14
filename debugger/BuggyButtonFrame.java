package debugger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by LLL on 15/8/14.
 */
public class BuggyButtonFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public BuggyButtonFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        BuggyButtonPane pane = new BuggyButtonPane();
        add(pane);
    }
}

class BuggyButtonPane extends JPanel{
    public BuggyButtonPane(){
        ActionListener listener = new ButtonListener();

        JButton yellowButton = new JButton("Yellow");
        add(yellowButton);
        yellowButton.addActionListener(listener);

        JButton blueButton = new JButton("Blue");
        add(blueButton);
        blueButton.addActionListener(listener);

        JButton redButton = new JButton("Red");
        add(redButton);
        redButton.addActionListener(listener);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            String arg = event.getActionCommand();
//            switch (arg){
//                case "Yellow":
//                    setBackground(Color.yellow);
//                    break;
//                case "Blue":
//                    setBackground(Color.blue);
//                    break;
//                case "Red":
//                    setBackground(Color.red);
//                    break;
//                default:
//                    break;
//            }
            if (arg.equals("Yellow")) setBackground(Color.yellow);
            else if(arg.equals("Blue")) setBackground(Color.blue);
            else if (arg.equals("Red")) setBackground(Color.red);
        }
    }

}
