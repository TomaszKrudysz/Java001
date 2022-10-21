package com.example.swing;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by tkrud on 19.10.2022.
 */
public class MouseListenerMouseMotionListenerExample extends JFrame implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");
        System.out.println("click count: "  + e.getClickCount());
        System.out.println("screen x: " + e.getXOnScreen());
        System.out.println("screen y: " + e.getYOnScreen());

        String str = "Button clicked: ";
        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                str += "button1";
                break;
            case MouseEvent.BUTTON2:
                str += "button2";
                break;
            case MouseEvent.BUTTON3:
                str += "button3";
                break;
        }

        System.out.println(str);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited");

    }

    public static void main(String[] args) {
        MouseListenerMouseMotionListenerExample frame = new MouseListenerMouseMotionListenerExample();

        frame.addMouseListener(frame);

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("mouse drag");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
           //     System.out.println("mouse moved x: " + e.getX() + " y: " + e.getY());
            }
        });

        frame.setSize(640,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
