package Unit15;
import java.util.*;

public class dowhilePractice 
{
    dowhilePractice () {
        
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 20 + 1);
        
        i = 1;
        System.out.println("\n");
        do {
            System.out.print(i + " ");
            i = i + 2;
        } while (i < 50 + 1);
        
        i = 0;
        System.out.println("\n");
        do {
            System.out.print(i + " ");
            i = i + 10;
        } while (i <= 200 + 1);
        
        i = 97;
        System.out.println("\n");
        do {
            System.out.print((char)i + " ");
            i++;
        } while (i <= 121 + 1);
    }
    
    public static void main(String[] args) 
    {
        dowhilePractice app = new dowhilePractice();
    }
}
