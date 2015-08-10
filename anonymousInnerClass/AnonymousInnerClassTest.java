package anonymousInnerClass;

import javax.swing.*;

/**
 * Created by LLL on 15/8/10.
 */
public class AnonymousInnerClassTest {

    public static void main(String[] args){
        TalkingClock clock = new TalkingClock();
        clock.start(1000,true);
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
