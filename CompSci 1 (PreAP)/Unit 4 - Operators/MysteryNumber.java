package Unit4;
import java.util.*;

public class MysteryNumber 
{
    public static void main(String[] args) 
    {
        int mystery = 100;
        mystery += 50;
        mystery -= 1;
        mystery *= 3;
        mystery += 1;
        mystery /= 2;
        mystery += 15;
        mystery -= 6;
        mystery += 1;
        mystery -= 5;
        mystery = mystery % 10;
        mystery *= 100;
        mystery += 12;
        mystery -= 1;
        
        System.out.println("The mystery number is ...  " + mystery + "!");
    }
}
