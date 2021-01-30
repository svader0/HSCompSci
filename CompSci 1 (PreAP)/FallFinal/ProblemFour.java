package FallFinal;

import java.util.*;

public class ProblemFour 
{
    
    ProblemFour () {
        System.out.println("************\n  Problem 4    \n************\n\n");
        Scanner keyboard = new Scanner(System.in);
        System.out.print(" First grade -->");
        double gr1 = keyboard.nextDouble();
        System.out.print(" Second grade -->");
        double gr2 = keyboard.nextDouble();
        System.out.print(" Third grade -->");
        double gr3 = keyboard.nextDouble();
        System.out.print(" Fourth grade -->");
        double gr4 = keyboard.nextDouble();
        System.out.print(" Fifth grade -->");
        double gr5 = keyboard.nextDouble();
        
        int average = (int)Math.round((gr1 + gr2 + gr3 + gr4 + gr5) / 5);
        
        System.out.println("\n\nYour average is " + average + ". " + getStatus(average));
        
    }
    
    public String getStatus(int grade) {
        if (grade >= 90) {
            return "Excellent!";
        }
        if (grade >= 70 && grade < 90) {
            return "Good.";
        }
        if (grade < 70) {
            return "Needs improvement.";
        }
        else {
            return "ERROR";
        }
    }
    public static void main(String[] args) 
    {
        ProblemFour app = new ProblemFour();
    }
}
