package Unit14;
import java.util.*;

public class Averages
{
    // instance variables
    private int posCount = 0;
    private int negCount = 0;
    private int posSum = 0;
    private int negSum = 0;
    
    private int count = 0;
    

    /* This method generates a 100 random numbers and determines
     * if each number is positive or negative. If the number is
     * positive it increments posCount by one and increases posSum
     * by the value of the number. If the number is negative it
     * increments negCount by one and increases negSum by the
     * value of the number.
     */
    public void tallyAndSum()
    {
        int num;
        while (count < 100) {
            num = generateNumber();
            System.out.print(num + " ");
            if (num > 0) {
                posCount++;
                posSum = posSum + num;
            } else {
                negCount++;
                negSum = negSum + num;
            }
            count++;
            
        }
    }
	
    /* Calculates an average by dividing the sum by the count
     * @return the average
     * @param sum the sum that is to be averaged
     * @param count the count of the numbers to be averaged
     */
    public double average(int sum, int count)
    {
        return (sum / count);
    }

    /* This method prints a summary report displaying the count,
     * sum, and average of the positive and negative numbers.
     */
    public void printSummary()
    {
        System.out.println("\n\n\n    RESULTS\n===============\n");
        System.out.println("Positive Count: " + posCount);
        System.out.println("Positive Sum: " + posSum);
        System.out.println("Positive Average: " + average(posSum, posCount));
        System.out.println("\nNegative Count: " + negCount);
        System.out.println("Negative Sum: " + negSum);
        System.out.println("Positive Average: " + average(negSum, negCount));
        
        System.out.println("Total: " + count + "\n\n");
    }

    /* return a random number in the range -1000 to 1000
     */
    public int generateNumber()
    {
        return (int)(Math.random() * 2001) - 1000;
    }

    public static void main(String[] args)
    {
        Averages app = new Averages();
        app.tallyAndSum();
        app.printSummary();
    }
}