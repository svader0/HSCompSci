package Unit16;
import java.util.*;

public class VerticalString 
{
public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a word --> ");
        String word = keyboard.nextLine();
        for(int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i, i+1));
        }}}
