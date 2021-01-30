package FallFinal;
import java.util.*;

public class ProblemTwo 
{
    ProblemTwo () {
        System.out.println("************\n  Problem 2    \n************\n\n");
        
        System.out.print("Enter degree in farenheit -->");
        double input = keyboard.nextDouble();
        
        double degreesC = 5 * (input-32) / 9;
        degreesC = Math.round(degreesC);
        
        System.out.println(input + " degrees farenheit  =  " + degreesC + " degrees Celsius.");
        
    
    }
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ProblemTwo app = new ProblemTwo();
    }
}
