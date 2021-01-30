package FallFinal;

import java.util.*;

public class ProblemThree 
{
    
    ProblemThree () {
        System.out.println("************\n  Problem 3    \n************\n\n");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter phone number (xxx-xxx-xxxx) -->");
        String number = keyboard.next();
        number = number.replaceAll("-", "");
        System.out.println("\n\n" +number);
        
        

}
    public static void main(String[] args) 
    {
        ProblemThree app = new ProblemThree();
    }
}
