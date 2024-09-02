import javax.swing.*;
import java.awt.*;

public class DisplayButton {
    JFrame f;
    JTextField t1;
    JButton b1,b2;
    public  DisplayButton()
    {
        f=new JFrame("Purna Aale");
        f.setBackground(Color.GREEN);
        t1=new JTextField();
        t1.setBounds(50,50,170,30);
        t1.setForeground(Color.RED);
        t1.setFont(new Font("Arial",Font.BOLD,12));

        b1=new JButton("1st button");
        b1.setBounds(50,100,70,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,12));
        b1.addActionListener(e->
        {
            t1.setText("1st button is clicked");
        });

        b2=new JButton("2nd button");
        b2.setBounds(150,100,70,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Arial",Font.BOLD,12));
        b2.addActionListener(e->
    {
        t1.setText("2nd button is clicked");
    });


        f.add(t1);
        f.add(b2);
        f.add(b1);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main (String args[])
    {
        DisplayButton m1=new DisplayButton();

    }

}
