package Unit12;
import java.util.*;

public class LetterGrade 
{
    Scanner keyboard = new Scanner(System.in);
    double gradeIn;
    public LetterGrade () {
        System.out.print("Enter a grade -->");
        gradeIn = keyboard.nextDouble();
        System.out.println("\n" + getGrade(gradeIn));
    }
    public String getGrade(double grade) {
        
        if (grade > 97) {
            return ("A+");
        }
        if (grade > 94 && grade < 97) {
            return("A");
        }
        if (grade > 90 && grade < 94) {
            return("A-");
        }
        if (grade > 87 && grade < 90) {
            return("B+");
        }
        if (grade > 84 && grade < 87) {
            return("B");
        }
        if (grade > 80 && grade < 84) {
            return("B-");
        }
        if (grade > 77 && grade < 80) {
            return("C+");
        }
        if (grade > 74 && grade < 77) {
            return("C");
        }
        if (grade > 70 && grade < 74) {
            return("C-");
        }
        if (grade < 70) {
            return("F");
        }
        return null;
    }
    public static void main(String[] args) 
    {
        new LetterGrade();
    }
}
