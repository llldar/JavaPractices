package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by LLL on 15/8/8.
 */
public class TalkingClock {
    private int interval;
    private boolean beep;
    public TalkingClock(int interval,boolean beep){
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval,listener);
        t.start();
    }

    public class TimePrinter implements ActionListener{

        public void actionPerformed(ActionEvent event){
            Date now = new Date();
            System.out.println("At the tone,the time is "+ now);
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
