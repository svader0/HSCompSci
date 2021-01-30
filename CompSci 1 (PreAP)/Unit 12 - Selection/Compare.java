package Unit12;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        try {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Number 1 --> ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter Number 2 --> ");
        int num2 = keyboard.nextInt();
        System.out.println("\n\n");
        
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        }
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2 + ".");
        }
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2 + ".");
        }
        } catch (Exception e) {
            System.out.println("\nAn error occured.");
        }
    }
    
}
