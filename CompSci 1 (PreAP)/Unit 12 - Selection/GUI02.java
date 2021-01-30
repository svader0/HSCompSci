package Unit12;

import java.awt.*;
import javax.swing.*;

public class GUI02 extends JFrame
{
    // Step 1 : create JLabel variable
    JLabel label;
    
    // constructor
    public GUI02()
    {   
        // Step 2 : create JLabel object and store its reference in label
        label = new JLabel("Have a nice day!");
        
        // Step 3 : set label attributes
        label.setLocation(150, 180);
        label.setSize(200, 40);
        label.setForeground(Color.darkGray);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        
        // Step 4: add label to content pane of frame
        getContentPane().add(label);
        
        // set frame attributes
        setLayout(null);                                 
        setSize(500, 500);                              
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        getContentPane().setBackground(Color.white);     
        setVisible(true);                            
    }
    
    // main method
    public static void main(String[] args)
    {
        GUI02 app = new GUI02();   // run program
    }
}   
   