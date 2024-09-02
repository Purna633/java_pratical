import javax.swing.*;
import java.awt.*;
public class Mousepressed_Release {
    JFrame f;
    JLabel l1,l2;
    JTextField t1,t2,t3;
    JButton b1;
    public  Mousepressed_Release()
    {
        f=new JFrame("Purna Aale");
        f.setBackground(Color.GREEN);
        t3=new JTextField();
        t3.setBounds(120,50,170,30);
        t3.setForeground(Color.RED);
        t3.setFont(new Font("Arial",Font.BOLD,12));

        l1=new JLabel("1st num:");
        l1.setBounds(50,100,100,30);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Arial",Font.BOLD,12));
        t1=new JTextField("");
        t1.setBounds(120,100,170,30);
        t1.setForeground(Color.RED);
        t1.setFont(new Font("Arial",Font.BOLD,12));

        l2=new JLabel("2nd num:");
        l2.setBounds(50,150,100,30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,12));
        t2=new JTextField("");
        t2.setBounds(120,150,170,30);
        t2.setForeground(Color.RED);
        t2.setFont(new Font("Arial",Font.BOLD,12));


        b1=new JButton("Action");
        b1.setBounds(150,200,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,12));

        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                try {
                    double i = Double.parseDouble(t1.getText());
                    double i1 = Double.parseDouble(t2.getText());
                    double result = i - i1;
                    String res4 = String.valueOf(result);
                    t3.setText(res4);
                } catch (NumberFormatException n1) {
                    JOptionPane.showMessageDialog(null, "invalid input.");
                }
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                try{
                    double i = Double.parseDouble(t1.getText());
                    double i1 = Double.parseDouble(t2.getText());
                    double result=i+i1;
                    String res5 = String.valueOf(result);
                    t3.setText(res5);
                } catch (NumberFormatException n2) {
                    JOptionPane.showMessageDialog(null, "invalid input.");
                }
            }
        });


        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main (String args[])
    {
        Mousepressed_Release m1=new Mousepressed_Release();

    }

}
