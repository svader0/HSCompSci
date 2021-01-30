package Unit6;


import java.util.Scanner;

public class Rectangle 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Length:\n");
        int length = keyboard.nextInt();
        System.out.print("Enter the Width:\n");
        int width = keyboard.nextInt();
        System.out.println("\nPerimeter = " + ((width * 2) + (length * 2)));
        System.out.println("Area = " + (width * length));
        
        
    }
}
