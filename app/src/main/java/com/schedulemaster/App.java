package com.schedulemaster;

import mdlaf.MaterialLookAndFeel;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
            com.schedulemaster.MainFrame frame = new com.schedulemaster.MainFrame();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
