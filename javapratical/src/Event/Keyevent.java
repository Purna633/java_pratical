package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyevent implements KeyListener {
    JLabel l;
    JFrame f;
    JTextArea t1;
    public Keyevent() {
        f = new JFrame("key event");
        l = new JLabel();
        l.setBounds(30, 50, 100, 30);
        t1 = new JTextArea();
        t1.setBounds(30, 80, 100, 100);
        t1.addKeyListener(this);
        f.add(l);
        f.add(t1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }



            @Override
            public void keyTyped(KeyEvent e) {
                l.setText("key typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                l.setText("key pressed");

            }

            @Override
            public void keyReleased(KeyEvent e) {
                l.setText("key released");

            }




    public static void main(String args[])
    {
        Keyevent k1=new Keyevent();
    }
}
