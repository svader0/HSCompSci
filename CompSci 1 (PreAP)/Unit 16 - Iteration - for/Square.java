package Unit16;
import java.util.*;

public class Square
{
    Scanner keyboard = new Scanner(System.in);
    private String word = "";   
    
    public void readString()
    {
        System.out.println("E N T E R   A   W O R D   --> ");  
        word = keyboard.nextLine();
    }
	
    public String getSpace(int length)
    {
        length-=2;
        int i = 0;
        String o = "";
        do {
            o = o + " ";
            i++;
        } while (i < length);
        return o;
    }
	

    public void printSquare()
    {
        String spaces = getSpace(word.length());
        System.out.println("\n\n" + word);
        int o = word.length();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i, i+1) + spaces + word.substring(o - 1, o));
            o--;
        }
        System.out.println(word);
        
    }

    public static void main(String[] args)
    {
        Square app = new Square();
        app.readString();
        app.printSquare();
    }
}
