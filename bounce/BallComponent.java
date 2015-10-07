package bounce;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by LLL on 15/10/7.
 */
public class BallComponent extends JPanel{
    private static final int DEFAULT_WIDTH = 450;
    private static final int DEFAULT_HEIGHT = 450;

    private java.util.List<Ball> balls = new ArrayList<>();

    public void add(Ball b){
        balls.add(b);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Ball b: balls){
             g2.fill(b.getShape());
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
