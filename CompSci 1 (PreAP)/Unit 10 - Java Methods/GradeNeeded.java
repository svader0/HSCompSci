package Unit10;
import java.util.*;

       
public class GradeNeeded {
    
    Scanner key = new Scanner(System.in);
    double desiredAvg, sixWeeksAvg1, sixWeeksAvg2, sixWeeksAvg3, gradeNeeded;
    
    public static void main(String[] args) 
    {
        GradeNeeded app = new GradeNeeded();
        app.getData();
        app.calculateGradeNeeded();
        app.printResults();
    }
    
    public void getData() {
        System.out.println("-----------------\n     getData    \n-----------------\n");
        System.out.println("Enter desired semester average -->  ");
        desiredAvg = key.nextDouble();
        System.out.println("1st six weeks average -->  ");
        sixWeeksAvg1 = key.nextDouble();
        System.out.println("2st six weeks average -->  ");
        sixWeeksAvg2 = key.nextDouble();
        System.out.println("3st six weeks average -->  ");
        sixWeeksAvg3 = key.nextDouble();
        
    }
    public void calculateGradeNeeded() {
        System.out.println("\n\n----------------------------\n    calculateGradeNeeded    \n----------------------------\n\n\n");
        gradeNeeded = (desiredAvg - (0.8 * (sixWeeksAvg1 + sixWeeksAvg2 + sixWeeksAvg3) / 3)) / 0.2;
    }
    public void printResults() {
        System.out.println("------------------\n   printResults    \n------------------\n");
        System.out.println("\n     RESULTS\n---------------\n\nSemester Goal: " + desiredAvg);
        System.out.println("Grade Needed: " + gradeNeeded + "\n\n");
    }
}
