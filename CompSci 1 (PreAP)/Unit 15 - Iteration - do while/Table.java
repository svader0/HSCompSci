package Unit15;
import java.util.*;

public class Table
{
    private Scanner keyboard = new Scanner(System.in);
    public int inputNumRows()
            
    {
        System.out.print("How many rows?? --> ");
        return(keyboard.nextInt());
    }
    public void displayTable(int rows)
    {
        System.out.println(" N  10*N   100*N   1000*N");
        System.out.println("----------------------------");
        int i = 1;
        do {
        System.out.println("  " + i + "  " + (i * 10) + "     " + (i * 100) + "     " + (i * 1000));
        i++;
        } while (i <= rows);
    }

    public static void main(String[] args)
    {
        Table app = new Table();
        app.displayTable(app.inputNumRows());
    }
}