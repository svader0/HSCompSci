package Unit18;
import java.util.*;

public class SportsEvent
{
    private double[] scores = new double[8];
    private Scanner keyboard = new Scanner(System.in);

    public void readScores()
    {
        System.out.println("Enter eight contestant scores: ");

        for(int i = 0; i < 8; i++)
        {
            System.out.print("Judge " + (i + 1) + ": ");
            scores[i] = keyboard.nextDouble();
        }
    }

    public double lowest()
    {
        double lowest = Double.MAX_VALUE;
        for (double i : scores)
        {
            if (i < lowest)
            {
                lowest = i;
            }
        }
        return lowest;
    }
    public double highest()
    {
        double highest = Double.MIN_VALUE;
        for (double i : scores)
        {
            if (i > highest)
            {
                highest = i;
            }
        }
        return highest;
    }

    public double average()
    {
        double total = 0;
        double amount = 0;

        for (double i = 0; i < 8; i++)
        {
            if (i == lowest() || i == highest())
            {
                continue;
            }
            total += i;
            amount++;
        }

        return (total / amount);
    }

    /* This method prints a summary report which includes the original list of
     * scores, the average of the scores, the lowest score, and the highest
     * score.
     */
    public void printSummary()
    {
        System.out.println("                      Summary");
        System.out.println("-------------------------------------------------");
        System.out.print("Scores: ");
        for (double i : scores)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Lowest score: " + lowest());
        System.out.println("Highest score: " + highest());
        System.out.printf("Average score: %.1f", average());
    }

    public static void main(String[] args)
    {
        SportsEvent app = new SportsEvent();
        app.readScores();
        app.printSummary();
    }
}