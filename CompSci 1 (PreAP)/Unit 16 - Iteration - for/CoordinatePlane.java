package Unit16;

import java.awt.*;
import javax.swing.*;

public class CoordinatePlane extends JFrame
{
    // constructor
    public CoordinatePlane()
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
        super.paint(page);  // erase background
        Graphics2D g2d = (Graphics2D) page;    // page is the Graphics objec
        
        for (int i = 50; i <= 450; i+= 10) {
            page.drawLine(i , 450 ,i , 50);
        }
        for (int i = 50; i <= 450; i+= 10) {
            page.drawLine(450 ,i , 50 , i);
        }
        int width = 5;
        g2d.setStroke(new BasicStroke(width));
        page.setColor(Color.red);
        page.drawLine(50 ,250 , 450,  250);
        page.drawLine(250 ,450 , 250,  50);

    }
    
    // main method
    public static void main(String[] args)
    {
        CoordinatePlane app = new CoordinatePlane();  // run program
    }
}