package Unit12;

import java.awt.*;
import javax.swing.*;


public class GUI03 extends JFrame
{
    JLabel label1, label2, label3, label4;
    int fontsize = 72;
    String font = "Times New Roman";
    // constructor
    public GUI03()
    {
        JLabel label1 = new JLabel("Don't", SwingConstants.CENTER);
        JLabel label2 = new JLabel("mess", SwingConstants.CENTER);
        JLabel label3 = new JLabel("with",SwingConstants.CENTER);
        JLabel label4 = new JLabel("Texas.", SwingConstants.CENTER);
        label1.setLocation(125, 70);
        label1.setSize(200, 60);
        label1.setForeground(Color.darkGray);
        label1.setFont(new Font(font, Font.BOLD, fontsize));
        getContentPane().add(label1);
        
        label2.setLocation(125, 140);
        label2.setSize(200, 60);
        label2.setForeground(Color.darkGray);
        label2.setFont(new Font(font, Font.BOLD, fontsize));
        getContentPane().add(label2);
        
        label3.setLocation(125, 210);
        label3.setSize(200, 60);
        label3.setForeground(Color.darkGray);
        label3.setFont(new Font(font, Font.BOLD, fontsize));
        getContentPane().add(label3);
        
        label4.setLocation(125, 280);
        label4.setSize(200, 60);
        label4.setForeground(Color.darkGray);
        label4.setFont(new Font(font, Font.BOLD, fontsize));
        getContentPane().add(label4);
        setLayout(null);                                 // no layout will be used
        setSize(500, 500);                               // sets size of frame window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // activate close icon
        getContentPane().setBackground(Color.white);     // set background color
        setVisible(true);       
        // show frame
    }
    
    // main method
    public static void main(String[] args)
    {
        GUI03 app = new GUI03();    // run program
    }
}