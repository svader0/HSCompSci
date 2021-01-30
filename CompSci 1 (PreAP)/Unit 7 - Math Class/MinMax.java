package Unit7;
import java.util.*;

public class MinMax 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
		Scanner keyboard = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int min;
        int max;
        
        System.out.print("num1 -->  ");
        num1 = keyboard.nextInt();
        System.out.print("num2 -->  ");
        num2 = keyboard.nextInt();
        System.out.print("num3 -->  ");
        num3 = keyboard.nextInt();
                
        
        min = Math.min(Math.min(num1, num2), num3);
        max = Math.max(Math.max(num1, num2), num3);
        
        
        System.out.println("\n\n");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        
        
        
    }
}
