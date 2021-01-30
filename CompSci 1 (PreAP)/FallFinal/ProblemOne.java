package FallFinal;

import java.util.*;

public class ProblemOne 
{
    
    ProblemOne () {
        System.out.println("************\n  Problem 1    \n************\n\n");
        Scanner keyboard = new Scanner(System.in);
        System.out.print(" First name -->");
        String name = keyboard.next();
        System.out.print(" First color -->");
        String color = keyboard.next();
        System.out.print(" First food -->");
        String food = keyboard.next();
        System.out.print(" First animal -->");
        String animal = keyboard.next();
        
        System.out.println("\n\nI had a dream that " + name + " ate a " + color + " " + animal + " and she said it tasted like " + food + "!");
        
        

}
    public static void main(String[] args) 
    {
        ProblemOne app = new ProblemOne();
    }
}
