package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

class TestJComponent extends JComponent {
    Image img;
    public TestJComponent() {
        super();
        img = new ImageIcon("files\\parrot.jpg").getImage();
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Tekst", 300 ,300);

        g.setColor(Color.lightGray);
        g.fillRect(30,50,100,200);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(img, 100,100,200,200,this);

        g2d.setColor(Color.RED);
        g2d.draw(new Line2D.Float(0.0f,10.0f,220.0f,200.5f));

        g2d.draw(new Rectangle2D.Float(10.0f,20.0f,50.0f,100.0f));

        g2d.setColor(Color.darkGray);
        g2d.draw(new Ellipse2D.Float(30.0f,50.0f,80.0f,50.0f));

        g2d.draw(new RoundRectangle2D.Float(50.0f, 50.0f, 300.0f,370.0f,60.0f,60.0f));

        GradientPaint gp = new GradientPaint(5,5,Color.YELLOW,20,25, Color.RED, true);
        g2d.setPaint(gp);
        g2d.fillRect(60,80,100,50);
    }
}

/**
 * Created by tkrud on 19.10.2022.
 */
public class JComponentExample extends JFrame {
    public static void main(String[] args) {
        JComponentExample frame = new JComponentExample();

        TestJComponent component = new TestJComponent();
        frame.add(component);

        frame.setSize(640,480); //rozmiar w pikselach
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // standardowe przyciski do zamkniecia okna
        frame.setLocationRelativeTo(null); // wycentowanie okna na ekranie
        frame.setVisible(true); //widzialnosc oczywiscie

    }
}
