import java.util.*;

public class CombinationLock extends Lock{
    private String combination;


    public CombinationLock () 
    {
        super();
        combination = "";
    }
    public CombinationLock(String combo) 
    {
        super();
        combination = combo;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }




    @Override
    public void open() 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the combination --> ");
        if (keyboard.nextLine() == combination) 
        {
            super.open();
        }
    }

    public String toString() 
    {
        String str = super.toString() + "\n" + "Combination = " + combination + "\n";
        return str;
    }
}
