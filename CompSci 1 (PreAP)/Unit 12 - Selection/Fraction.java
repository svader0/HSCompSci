package Unit12;

import java.util.Scanner;

public class Fraction 
{
    // Instance Variables
    private final Scanner keyboard = new Scanner(System.in);
    private String problem; 
    private int num1;
    private int denom1;
    private String operator;
    private int num2;
    private int denom2;
    private int numAns;
    private int denomAns;  
    
    public void getData()
    {
        try{
            System.out.println("/*********************/");
            System.out.println("      getData");
            System.out.println("/*********************/\n");
            System.out.println("\n\nHey, Enter a fraction problem --> ");
            problem = keyboard.nextLine();
        }catch(Exception e) {
            System.out.println("ERROR: Use correct format.");
        
        }
    }
    public void extractData()
    {
        System.out.println("/*********************/");
        System.out.println("      extractData");
        System.out.println("/*********************/\n");
        
        
        num1 = Integer.parseInt(problem.substring(0, 1));
        denom1 = Integer.parseInt(problem.substring(2, 3));
        operator = problem.substring(4, 5);
        num2 = Integer.parseInt(problem.substring(6, 7));
        denom2 = Integer.parseInt(problem.substring(8, 9));
        System.out.println(num1 + "" + denom1 + "" + operator + "" + num2 + "" + denom2);
    }
    public void doArithmetic()
    {
        System.out.println("/*********************/");
        System.out.println("      doArithmetic");
        System.out.println("/*********************/\n");
        
        switch(operator) {
            case("+"):
                numAns = ((num1 * denom2) + (denom1 * num2));
                denomAns = (denom1 * denom2);
                break;
            case("-"):
                numAns = (num1 * denom2) - (denom1 * num2);
                denomAns = (denom1 * denom2);
                break;
            case("/"):
                numAns = (num1 * denom2);
                denomAns = (denom1 * num2);
                break;
            case("*"):
                numAns = (num1 * num2);
                denomAns = (denom1 * denom2);
                break;
        }
    }
    public void printResuts()
    {
        System.out.println("/*********************/");
        System.out.println("      printResults");
        System.out.println("/*********************/\n");
        
        problem = (numAns +  " / " + denomAns);
        System.out.println(problem);
    }
    public static void main(String[] args) 
    {
        Fraction app = new Fraction();
        app.getData();
        app.extractData();
        app.doArithmetic();
        app.printResuts();
    }
}