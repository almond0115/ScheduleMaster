package com.schedulemaster.app;

import com.schedulemaster.app.view.testframe;
import mdlaf.MaterialLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;

public class App {
    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource)
                UIManager.put(key, f);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
            setUIFont (new javax.swing.plaf.FontUIResource("Sans", Font.PLAIN,12));
            //MainFrame frame = new MainFrame();
            //JFrame frame = new JFrame();
            testframe testf = new testframe();
            // frame.setBounds(100, 100, 450, 300);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.getContentPane().add(testf);
           // frame.setVisible(true);
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

    }
}
