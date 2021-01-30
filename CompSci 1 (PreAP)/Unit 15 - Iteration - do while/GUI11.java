package Unit15;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI11 extends JFrame implements ActionListener
{
    // instance variables
    private JButton button;
    private JTextField rTextField, gTextField, bTextField; // Step 1: declare JTextfield variable
    
    // constructor
    public GUI11()
    {       
        button = new JButton("Submit");
        button.setLocation(50, 50);
        button.setSize(100, 25);
        
        getContentPane().add(button);
        
        button.addActionListener(this);
        
        rTextField = new JTextField();
        gTextField = new JTextField();
        bTextField = new JTextField();
        
        rTextField.setLocation(175, 50);
        rTextField.setSize(150, 25);   
        
        gTextField.setLocation(175, 100);
        gTextField.setSize(150, 25); 
        
        bTextField.setLocation(175, 150);
        bTextField.setSize(150, 25); 
        
        
        getContentPane().add(rTextField);
        getContentPane().add(gTextField);
        getContentPane().add(bTextField);
        
        
        // set frame attributes
        setLayout(null);
        setSize(500, 500);                               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);                                
    }
    
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == button)
        { 
           int r = Integer.parseInt(rTextField.getText());  
           int g = Integer.parseInt(gTextField.getText());
           int b = Integer.parseInt(bTextField.getText());
           rTextField.setText("");
           gTextField.setText("");
           bTextField.setText("");
           Color bg = new Color(r, g, b);
           getContentPane().setBackground(bg);
           
           

           
        }
    }
    
    // main method
    public static void main(String[] args)
    {
        GUI11 app = new GUI11();
    }
}