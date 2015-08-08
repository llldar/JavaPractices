package timer;

import javax.swing.*;

/**
 * Created by LLL on 15/8/8.
 */
public class InnerClassTest {
    public static void main(String... args) {
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
