package Unit14;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI08 extends JFrame implements ActionListener
{
    // instance variables
    private final JButton button, button2;
    
    // constructor
    public GUI08()
    {       
        // create button
        button = new JButton("Change Color");
        button2 = new JButton("Add circle");
        
        // set button attributes
        button.setLocation(175,50);
        button.setSize(150, 50);
        
        button2.setLocation(175,200);
        button2.setSize(150, 50);
        
        // add button to frame
        getContentPane().add(button);
        getContentPane().add(button2);
        
        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);     
        
        button.addActionListener(this);
        button2.addActionListener(this);
    }
    
    // Step 3: add an actionPerformed method

    @Override
    public void actionPerformed(ActionEvent event)
    {   
        Graphics page = getGraphics();
        if(event.getSource() == button)          
        {
            int r = (int)(Math.random() * 256);  
            int g = (int)(Math.random() * 256);   
            int b = (int)(Math.random() * 256);   
            Color color = new Color(r, g, b);       
            getContentPane().setBackground(color);  
        }
        else if(event.getSource() == button2)             
        {
            
            int r = (int)(Math.random() * 256);  
            int g = (int)(Math.random() * 256);
            int b = (int)(Math.random() * 256);  

            Color myColor = new Color(r, g, b);   

            page.setColor(myColor);   
            
            int x = (int)(Math.random() * 500);  
            int y = (int)(Math.random() * 500);   

            page.fillOval(x, y, 100, 100);
            
        }
    }
    


    public static void main(String[] args)
    {
        GUI08 app = new GUI08(); 
    }
}