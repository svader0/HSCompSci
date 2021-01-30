package Unit18;
import java.util.*;

public class ChangeCase
{
    private String[] words = new String[50];  
    private int size = 0;                     
    private Scanner keyboard = new Scanner(System.in);

    public void readWords()
    {
        String str = "";
        while(!str.equalsIgnoreCase("stop"))
        {
            words[size] = str;
            size++;
            str = keyboard.nextLine();
        }
    }

    public void printWords()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(words[i] + " " + words[i].toUpperCase() + " " + words[i].toLowerCase());
        }
    }

    public static void main(String[] args)
    {
        ChangeCase app = new ChangeCase();
        app.readWords();
        app.printWords();
    }
}