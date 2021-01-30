package Unit15;
import java.util.*;

public class Largest
{
    private int largest = 0;
    private Scanner keyboard = new Scanner(System.in);

    public int compare(int num1, int num2)
    {
        if (num1 > num2) {
            largest = num1;
        }
        return largest;
    }
    
    public void findLargest()
    {
        System.out.println("Yo, homedog, enter 10 numbers.");
        int i = 1;
        do {
            System.out.print("-->  ");
            largest = compare(keyboard.nextInt(), largest);
            i++;
        } 
        while (i <= 10);
    }

    public void printLargest()
    {
        System.out.println(largest);
    }

    public static void main(String[] args)
    {
        Largest app = new Largest();
        app.findLargest();
        app.printLargest();
    }
}