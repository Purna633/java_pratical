package Layoutmanage;
import javax.swing.*;
import java.awt.*;
public class Borderlayout {
    JFrame f;
    public Borderlayout()
    {
        f=new JFrame("borderlayout");
        JButton b1 = new JButton("EAST");
        JButton b2 = new JButton("WEST");
        JButton b3 = new JButton("SOUTH");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");

        JPanel p1=new JPanel();

        p1.setLayout(new BorderLayout());
        p1.add(b1,BorderLayout.NORTH);
        p1.add(b2, BorderLayout.SOUTH);
        p1.add(b3,BorderLayout.EAST);
        p1.add(b4,BorderLayout.WEST);
        p1.add(b5,BorderLayout.CENTER);

        f.add(p1);
        f.setSize(400, 300);
        f.setVisible(true);
    }
    public static void main(String args[])
        {
            Borderlayout b1=new Borderlayout();


        }
}
