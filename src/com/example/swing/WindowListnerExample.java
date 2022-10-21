package com.example.swing;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

/**
 * Created by tkrud on 19.10.2022.
 */
public class WindowListnerExample extends JFrame implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("okno otwarte");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("okno zamykane");
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("okno zamknięte");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("okno zminimalizowane");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("okno pokazane");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("okno aktywowane");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("okno deaktywowane");

    }

    public static void main(String[] args) {
        WindowListnerExample frame = new WindowListnerExample();

        frame.addWindowListener(frame);

        frame.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("okno ma fokus");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("okno straciło fokus");

            }
        });

        frame.setSize(640,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
