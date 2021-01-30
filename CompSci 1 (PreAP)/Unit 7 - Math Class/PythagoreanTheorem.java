package Unit7;
import java.util.*;

public class PythagoreanTheorem 
{
	@SuppressWarnings("resource")
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        double a;
        double b;
        double c2;
        double c;
        
        System.out.print("a -->  ");
        a = keyboard.nextDouble();
        System.out.print("b -->  ");
        b = keyboard.nextDouble();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        c2 = (Math.pow(a, 2)) + (Math.pow(b, 2));
        c = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
        
        System.out.println("      Results : ");
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();
        System.out.println("c^2: " + c2);
        System.out.println("c: " + c + "\n\n");
        
    }
}
