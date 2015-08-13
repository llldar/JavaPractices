package Logging;

import sun.plugin2.main.server.WindowsHelper;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by LLL on 15/8/13.
 */
public class LoggingImageViewer {
    public static void main(String[] args){
        if(System.getProperty("java.util.logging.config.class") == null
                && System.getProperty("java.util.logging.config.file") == null) {
            try {
                Logger.getLogger("com.llldar.blog").setLevel(Level.ALL);
                final int LOG_ROTATION_COUNT = 10;
                Handler handler = new FileHandler("%h/LoggingImageViewer.log",0,LOG_ROTATION_COUNT);
            }catch (IOException e){
                Logger.getLogger("com.llldar.blog").log(Level.SEVERE,
                        "Can't create log file handler",e);
            }
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Handler windowHandler = new WindowHandler();
                windowHandler.setLevel(Level.ALL);
                Logger.getLogger("com.llldar.blog").addHandler(windowHandler);

                JFrame frame = new ImageViewFrame();
                frame.setTitle("LoggingImageViewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Logger.getLogger("com.llldar.blog").fine("Showing frame");
                frame.setVisible(true);
            }
        });
    }
}

