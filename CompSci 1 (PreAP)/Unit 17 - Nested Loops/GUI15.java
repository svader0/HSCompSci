package Unit17;
import java.awt.*;
import javax.swing.*;

public class GUI15 extends JFrame
{
    public GUI15()
    {
        setLayout(null);                                 
        setSize(400, 400);                               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        getContentPane().setBackground(Color.white);     
        setVisible(true);                                
    }
    
    public void paint(Graphics page)
    {
        super.paint(page);  // erase background
        Color color = Color.black;
        for (int i = 0; i <= 10; i++) {
            
            
            for (int r = 0; r <= 10; r++) {
                
                if(color == Color.white)  
                    color = Color.black;
                else
                    color = Color.white;
                
                page.setColor(color);
                page.fillRect(r * 40, i * 40, 40, 40);
                
                
            }
        }
        
        
		
		
        

    }
    
    // main method
    public static void main(String[] args)
    {
        GUI15 app = new GUI15();  // run program
    }
}