package Unit15;

import java.util.*;

import java.util.*;

public class RepeatMenu
{
    private Scanner keyboard = new Scanner(System.in);
	
    /* This method displays a menu and waits for the user to make a selection.
     * If the user's selection is not a valid number (not between 1 and 5) 
     * the method displays the menu again and allows user to make another  
     * selection. This process is repeated until a valid selection is made.
     * @ return the number selection made by the user.
     */
    public int displayMenu()
    {
        System.out.printf("\n      Menu"
                + "\n   =========="
                + "\n1.  Dr. Pepper"
                + "\n2.  Coke"
                + "\n3.  Sprite"
                + "\n4.  7-UP"
                + "\n5.  Diet Coke"
                + "\n\nSelection: ");
        return (keyboard.nextInt());
        
    }

   /* This method makes a call to method displayMenu to get the user's 
    * number selection. Once user's selection has been retrieved it 
    * determines the name of the menu item selected and displays the  
    * following message: "You have chosen (selection name)" where 
    * selection name is the name of the menu item selected by the user.
    */
    public void printSelection()
    {
        int selectionNum = displayMenu();
        String selection = "ERROR TRY AGAIN";
        if (selectionNum <= 5 && selectionNum > 0) {
            switch (selectionNum) {
            case 1:
                selection = "Dr. Pepper";
            case 2:
                selection = "Coke";
            case 3:
                selection = "Sprite";
            case 4:
                selection = "7-Up";
            case 5:
                selection = "Diet Coke";
            default:
                System.out.println("\n\nYour selection is " + selection);
            }
        }
        else {
            printSelection();
        }
    }

    public static void main(String[] args)
    {
        RepeatMenu app = new RepeatMenu();
        app.printSelection();
    }
}