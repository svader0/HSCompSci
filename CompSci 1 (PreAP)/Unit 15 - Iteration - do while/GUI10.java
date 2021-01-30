package Unit15;
import java.awt.*;
import javax.swing.*;


public class GUI10 extends JFrame
{
    // constructor
    public GUI10()
    {
        // set frame attributes
        setLayout(null);                                 
        setSize(500, 500);                               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        getContentPane().setBackground(Color.black);     
        setVisible(true);                                
    }
    
    public void paint(Graphics page)
    {
        super.paint(page);  // erase background
        int i = 1;
        do {
            if(i % 2 == 0) {
                page.setColor(Color.green);
            }
            else {
                page.setColor(Color.blue);
            }
            
            int x = (int)(Math.random() * 500); 
            int y = (int)(Math.random() * 500);  

            page.drawLine(250, 250, x, y);
            i++;
        } while (i <= 300);
    }
    
    // main method
    public static void main(String[] args)
    {
        GUI10 app = new GUI10();  // run program
    }
}
