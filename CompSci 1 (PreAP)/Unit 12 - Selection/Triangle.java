package Unit12;
import java.util.*;

public class Triangle 
{
    double side1;
    double side2;
    double side3;
    
    public Triangle () {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter side 1 --> ");
        side1 = keyboard.nextDouble();
        System.out.print("Enter side 2 --> ");
        side2 = keyboard.nextDouble();
        System.out.print("Enter side 3 --> ");
        side3 = keyboard.nextDouble();
        System.out.println( "\n" + getType(side1, side2, side3));
    }
    
    public String getType(double side1, double side2, double side3) {
        if (side1 == side2) {
            if (side2 == side3) {
                return("This triangle is equilateral.");
            }
            if (side2 != side3) {
                return("This triangle is isosceles.");
            }
        }
        if (side1 != side2) {
            if (side2 != side3) {
                return("This triangle is scalene.");
            }
            if (side2 == side3) {
                return("This triangle is isosceles.");
            }
        } 
        return null;
    }
    public static void main(String[] args) 
    {
        new Triangle(); 
    }
}
