package Unit16;

import java.awt.*;
import javax.swing.*;

public class Gradient extends JFrame
{
    public Gradient()
    {
        // set frame attributes
        setLayout(null);                                 
        setSize(500, 500);                               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        getContentPane().setBackground(Color.white);     
        setVisible(true);   
        
        
    }
    public void paint(Graphics page)
    {
        Graphics2D g2d = (Graphics2D) page;
        RenderingHints rhints = g2d.getRenderingHints();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        super.paint(page);  // erase background
        int size = 400;
        int pos = 50;
        page.drawOval(50, 50, 400, 400);
        for (int i = 0; i <= 255; i++) {
            page.setColor(new Color(255, 100, i));
            page.drawOval(pos, pos, size, size);
            size = size - 2;
            pos++;
        }
    }
    public static void main(String[] args)
    {
        Gradient app = new Gradient();  // run program
    }
}