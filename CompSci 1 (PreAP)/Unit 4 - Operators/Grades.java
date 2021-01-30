package Unit4;

import java.util.*;

public class Grades 
{
    public static void main(String[] args) 
    {
        double dailyAvg = 88.0;
        double quizAvg = 74.0;
        double testAvg = 95.0;
        double sixWeeksAvg = 0.0;
        int roundedAvg = 0;
        
        sixWeeksAvg = ((dailyAvg) + (quizAvg) + (testAvg)) / 3;
        
        sixWeeksAvg += 0.5;
        roundedAvg = (int)sixWeeksAvg;
        
        
        System.out.println("Daily Average = " + dailyAvg);
        System.out.println("Quiz Average = " + quizAvg);
        System.out.println("Test Average = " + testAvg);
        System.out.println("-------------");
        System.out.println("Six weeks avg = " + sixWeeksAvg);
        System.out.println("Rounded average = " + roundedAvg);
        
    }
}
