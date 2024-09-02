import java.awt.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Form {
    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1,b2;
    DefaultTableModel model;
    JTable table;

    public Form()
    {
        f=new JFrame("welcome to login page");
        f.setBackground(Color.GREEN);
        model = new DefaultTableModel(new String[]{"Name", "Email", "Phone", "Gender", "Faculty"}, 0);
        table = new JTable(model);

        l1=new JLabel("Name:");
        l1.setBounds(50,50,80,30);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Arial",Font.BOLD,12));
        t1=new JTextField("");
        t1.setBounds(150,50,150,30);
        t1.setForeground(Color.RED);
        t1.setFont(new Font("Arial",Font.BOLD,12));

        l2=new JLabel("Email");
        l2.setBounds(50,100,80,30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,12));
        t2=new JTextField("");
        t2.setBounds(150,100,150,30);
        t2.setForeground(Color.RED);
        t2.setFont(new Font("Arial",Font.BOLD,12));

        l3=new JLabel("Phone:");
        l3.setBounds(50,150,80,30);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,12));
        t3=new JTextField();
        t3.setBounds(150,150,150,30);
        t3.setForeground(Color.RED);
        t3.setFont(new Font("Arial",Font.BOLD,12));

        l4=new JLabel("Gender:");
        l4.setBounds(50,200,80,30);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Arial",Font.BOLD,12));
        r1=new JRadioButton("Male");
        r1.setForeground(Color.RED);
        r1.setFont(new Font("Arial",Font.BOLD,12));
        r1.setBounds(150,200,75,30);
        r2=new JRadioButton("Female");
        r2.setBounds(230,200,75,30);
        r2.setForeground(Color.RED);
        r2.setFont(new Font("Arial",Font.BOLD,12));

        ButtonGroup obj1=new ButtonGroup();
        obj1.add(r1);
        obj1.add(r2);

        l5=new JLabel("Faculty");
        l5.setBounds(50,250,80,30);
        l5.setForeground(Color.RED);
        l5.setFont(new Font("Arial",Font.BOLD,12));
        String subject[]={"BIM","BBA","BBM","BBS"};
        c1=new JComboBox(subject);
        c1.setBounds(150,250,150,30);
        c1.setBackground(Color.BLACK);
        c1.setForeground(Color.WHITE);
        c1.setFont(new Font("Arial",Font.BOLD,12));

        b1=new JButton("Submit");
        b1.setBounds(200,300,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,12));

        b1.addActionListener(e -> {
            String Name= t1.getText();
            String Email= t2.getText();
            String Phone= t3.getText();
            String gender= r1.isSelected() ? "Male":"Female";
            String Faculty=(String) c1.getSelectedItem();

            //Print out the data

            //Vector<Vector> dataVector = model.getDataVector();
            model.addRow(new Object[]{Name, Email, Phone, gender, Faculty});
            /*model.addRow(new Object[]{name});
            model.addRow(new Object[]{email});
            model.addRow(new Object[]{phone});
            model.addRow(new Object[]{gender});
            model.addRow(new Object[]{Faculty});*/


            JScrollPane src = new JScrollPane(table);
            JOptionPane.showMessageDialog((Component)null, src);
            System.out.println();
        });

        b2=new JButton("clear");
        b2.setBounds(50,300,100,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Arial",Font.BOLD,12));

        b1.addActionListener(e1 -> {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);

        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(r1);
        f.add(r2);
        f.add(l5);
        f.add(c1);
        f.add(b1);
        f.add(b2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {

        Form obj=new Form();
    }
}

