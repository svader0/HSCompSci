package Unit14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI09 extends JFrame implements ActionListener
{
    final JButton onButton, offButton;
    final JLabel text;
    final Font arial = new Font("Arial", Font.BOLD, 48);
    
    public GUI09()
    {       
    
        onButton = new JButton("On");
        offButton = new JButton("Off");
        text = new JLabel("Computers are fun!");
        
        
        text.setFont(arial);
        text.setLocation(10,200);
        text.setSize(450, 50);
        
        onButton.setLocation(150,50);
        onButton.setSize(100, 50);
        
        offButton.setLocation(270,50);
        offButton.setSize(100, 50);
        
        offButton.addActionListener(this);
        onButton.addActionListener(this);
        
        getContentPane().add(text);
        getContentPane().add(offButton);
        getContentPane().add(onButton);
        
        setLayout(null);
        setSize(500, 500);                               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        getContentPane().setBackground(Color.white);     
        setVisible(true);    
             
    }
    public void actionPerformed(ActionEvent event)
    {   
        if(event.getSource() == offButton)          
            text.setVisible(false);
        
        else if(event.getSource() == onButton)             
            text.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        GUI09 app = new GUI09();  
    }
}