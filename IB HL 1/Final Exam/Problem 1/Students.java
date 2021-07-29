import java.util.Scanner;

public class Students 
{
    // instance variables
    private StudentInfo[] studentArray = new StudentInfo[10]; // an array of student information
    private int numStudents = 0; // logical size of array
    private Scanner keyboard = new Scanner(System.in);

    public void getInfo() 
    {
        
        while(true) 
        {
            String input = "";
            System.out.print("\nSubmit a student? [Y/N] --> ");
            input = keyboard.nextLine();

            if (input.equalsIgnoreCase("n")) { break; } // exit condition

            String last, first, id, address, phone;

            System.out.print("\nLast Name --> ");
            last = keyboard.nextLine();
            System.out.print("\nFirst Name --> ");
            first = keyboard.nextLine();
            System.out.print("\nID --> ");
            id = keyboard.nextLine();
            System.out.print("\nAddress --> ");
            address = keyboard.nextLine();
            System.out.print("\nPhone --> ");
            phone = keyboard.nextLine();


            studentArray[numStudents] = new StudentInfo(last, first, id, address, phone);
            numStudents++;

            
        }
    }

    public void printInfo() 
    {
        for (int i = 0; i < numStudents; i++)
        {
            System.out.println(studentArray[i]);
            System.out.println();
        }
    }
    // constructors and other methods not shown
}