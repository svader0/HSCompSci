package Unit12;

import java.awt.*;
import javax.swing.*;


public class GUI01 extends JFrame
{
    // constructor
    public GUI01()
    {
        Container con = new Container();
        con = getContentPane();

        setLayout(null);                                 // no layout will be used
        setSize(400, 300);                               // sets size of frame window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // activate close icon
        getContentPane().setBackground(Color.white);     // set background color
        setVisible(true);  
        con.setBackground(new Color(50,120,200));
        
// show frame
    }
    
    // main method
    public static void main(String[] args)
    {
        GUI01 app = new GUI01();    // run program
    }
}