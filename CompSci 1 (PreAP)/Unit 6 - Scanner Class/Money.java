package Unit6;

import java.util.*;

public class Money 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Money Counter!\n\n---------------\n \n");
        System.out.print("Quarters -- > ");
        int quarters = keyboard.nextInt();     // number of quarters
        System.out.print("Dimes -- > ");
        int dimes = keyboard.nextInt();        // number of dimes
        System.out.print("Nickels -- > ");
        int nickels = keyboard.nextInt();       // number of nickels
        System.out.print("Pennies -- > ");
        int pennies = keyboard.nextInt();     // number of pennies
        int totalCents;   // total cents collected
        int dollars = 0;     // dollar amount
        int cents = 0;      // cents amount
        
        
        
        totalCents = (quarters * 25) + (dimes * 10) + (nickels * 5) + pennies;
        dollars = totalCents / 100;
        cents = totalCents % 100;
        
        System.out.println("\nYou have " + dollars + " dollars and " + cents + " cents.");
        
        
        
        
    }
}
