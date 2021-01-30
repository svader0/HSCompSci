package Unit13;
import java.awt.*;
import javax.swing.*;


public class GUI05 extends JFrame
{
    
    ImageIcon jackImage = new ImageIcon("jack.gif"), queenImage = new ImageIcon("queen.gif"), kingImage = new ImageIcon("king.gif");
    JLabel queenLabel = new JLabel(queenImage);
    JLabel jackLabel = new JLabel(jackImage);
    JLabel kingLabel = new JLabel(kingImage);
    // constructor
    public GUI05()
    {
        // set frame attributes
        setLayout(null);                                 // no layout will be used
        setSize(500, 500);                               // sets size of frame window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // activate close icon
        getContentPane().setBackground(Color.white);     // set background color
        setVisible(true);                                // show frame
        
        queenLabel.setLocation(0,0);
        queenLabel.setSize(queenImage.getIconWidth(), queenImage.getIconHeight()); 
        jackLabel.setLocation(200,0);
        jackLabel.setSize(jackImage.getIconWidth(), jackImage.getIconHeight()); 
        kingLabel.setLocation(400,0);
        kingLabel.setSize(kingImage.getIconWidth(), kingImage.getIconHeight()); 
        
        // Step 5: add label to frame
        getContentPane().add(queenLabel);
        getContentPane().add(jackLabel);
        getContentPane().add(kingLabel);
        
    }
    
    // main method
    public static void main(String[] args)
    {
        GUI05 app = new GUI05();    // run program
    }
}