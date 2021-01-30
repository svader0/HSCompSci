package Unit15;
import java.util.*;

public class Digits
{
    public int getDigitCount(int num)
    {
        int count = 0;
        do {
            num = num / 10;
            count++;
        } while (num > 0);
        return count;
    }
    
    public void printDigits(int num)
    {
        int digit;
        do {
            digit = num % 10;
            num = num / 10;
            System.out.println(digit);
        } while (num > 0);
    }

    public void manager()
    {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter number -->");
        number = keyboard.nextInt();

        System.out.println();
        System.out.println("Digit Count = " + getDigitCount(number));
        System.out.println();
        System.out.println("Digits");
        System.out.println("------");
        printDigits(number);
    }

    public static void main(String[] args)
    {
        Digits app = new Digits();
        app.manager();
    }
}