package Unit6;
import java.util.*;

public class Powers 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter integer --> ");
        int num = keyboard.nextInt();
        
        
        System.out.println("\n\nThe Square = " + num * num);
        System.out.println("The Cube = " + num * num * num);
        System.out.println("The Fouth ^ = " + num * num * num * num);
        System.out.println("The Fifth ^ = " + num * num * num * num * num);
        System.out.println("The Sixth ^ = " + num * num * num * num * num * num);
        System.out.println("The Seventh ^ = " + num * num * num * num * num * num * num);
        
    }
}
