import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.text.AttributedString;
public class Jpannelexample {
    Jpannelexample()
    {

    }
    public static void main (String args[])
    {

        JFrame f = new JFrame("Jpannel text rendring");


        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Font f1 = new Font("Arial", Font.BOLD, 20);
                AttributedString as = new AttributedString("Tribhuvan University");
                as.addAttribute(TextAttribute.FONT, f1);
                as.addAttribute(TextAttribute.FOREGROUND, Color.darkGray);

                TextLayout tyt = new TextLayout(as.getIterator(), g.getFontMetrics().getFontRenderContext());

                tyt.draw((Graphics2D) g, 50, 100);
            }
        };
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 300);
        f.add(panel);
        f.setVisible(true);
    }


}
