package Unit17;
import java.util.*;

public class Christmas
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        for(int i = 1; i <= 12; i++)       // go from 1st day to 12th day
        {

          if(i == 1)
            System.out.println("On the first day of Christmas my true love gave to me");
          if(i == 2)
            System.out.println("On the second day of Christmas my true love gave to me");
          if(i == 3)
            System.out.println("On the third day of Christmas my true love gave to me");
          if(i == 4)
            System.out.println("On the fourth day of Christmas my true love gave to me");
          if(i == 5)
            System.out.println("On the fifth day of Christmas my true love gave to me");
          if(i == 6)
            System.out.println("On the sixth day of Christmas my true love gave to me");
          if(i == 7)
            System.out.println("On the seventh day of Christmas my true love gave to me");
          if(i == 8)
            System.out.println("On the eighth day of Christmas my true love gave to me");
          if(i == 9)
            System.out.println("On the ninth day of Christmas my true love gave to me");
          if(i == 10)
            System.out.println("On the tenth day of Christmas my true love gave to me");
          if(i == 11)
            System.out.println("On the eleventh day of Christmas my true love gave to me");
          if(i == 12)
            System.out.println("On the twelfth day of Christmas my true love gave to me");


           for(int j = i; j <= 12; j--)   // go from current day down to 1st day
           {
             if(j == 1)
                System.out.println("a partridge in a pear tree.");
             if(j == 2)
                System.out.println("two turtledoves, and");
             if(j == 3)
                System.out.println("three French hens, ");
             if(j == 4)
                System.out.println("four calling birds, ");
             if(j == 5)
                System.out.println("five golden rings, ");
             if(j == 6)
                System.out.println("six geese a-laying, ");
             if(j == 7)
                System.out.println("seven swans a-swimming, ");
             if(j == 8)
                System.out.println("eight maids a-milking, ");
             if(j == 9)
                System.out.println("nine ladies waiting, ");
             if(j == 10)
                System.out.println("ten lords-a-leaping, ");
             if(j == 11)
                System.out.println("eleven pipers piping, ");
             if(j == 12)
                System.out.println("twelve drummers drumming, ");
           }
           String pause = keyboard.nextLine();  // pause : Press Enter to continue
        }
    }
}