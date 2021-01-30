package Unit12;
import java.util.*;

public class RichterScale 
{
    
    public static double getNum() {
        Scanner keyboard = new Scanner(System.in);
        double num = 69;
        try {
            System.out.print("Enter num 1-8 ---->  ");
            num = keyboard.nextDouble();
        }
        catch (Exception e) {
            System.out.println("An error has occured.");
        }
        return num;
    }
    public static void main(String[] args) 
    {
        double num = getNum();
        if (num >= 8 && num <= 9.99) {
            System.out.println("Damage = Most structures fall");
        }
        if (num >= 7 && num <= 7.99) {
            System.out.println("Damage = Most buildings destroyed");
        }
        if (num >= 6 && num <= 6.99) {
            System.out.println("Damage = Many buildings considerably damaged; some collapse");
        }
        if (num >= 4.5 && num <= 5.999) {
            System.out.println("Damage = Damage to poorly constructed buildings");
        }
        if (num >= 3.5 && num <= 4.499) {
            System.out.println("Damage = Felt by many people, no destruction");
        }
        if (num >= 0 && num < 3.49) {
            System.out.println("Damage = Generally not felt by people");
        }
        if (num > 10 || num < 0){
            System.out.println("This number is not valid");
        }
        
    }
    
    
}
