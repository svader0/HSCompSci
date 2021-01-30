package Unit14;

import java.awt.*;
import javax.swing.*;


public class GUI07 extends JFrame
{
    final JButton button, button2;
    
    public GUI07()
    {       
    
        button = new JButton("OK");
        button2 = new JButton("Cancel");
        

        button.setLocation(100,400);
        button.setSize(80, 30);
        
        button2.setLocation(300,400);
        button2.setSize(80, 30);
        

        getContentPane().add(button);
        getContentPane().add(button2);
        
        
        setLayout(null);
        setSize(500, 500);                               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        getContentPane().setBackground(Color.white);     
        setVisible(true);                                
    }
    
    public static void main(String[] args)
    {
        GUI07 app = new GUI07();  
    }
}