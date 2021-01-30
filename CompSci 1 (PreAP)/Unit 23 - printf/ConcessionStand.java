package Unit23;
import java.util.*;

public class ConcessionStand
{
    Scanner keyboard = new Scanner(System.in);
    
    private int burgers = 0;
    private int hotdogs = 0;
    private int chips = 0;
    private int candy = 0;
    private int drinks = 0;

    private double burgersTotal = 0;
    private double hotdogsTotal = 0;
    private double chipsTotal = 0;
    private double candyTotal = 0;
    private double drinksTotal = 0;
    private double grandTotal = 0;

    /* This method prompts the user to enter in the number of 
     * items sold for each food type.
     */
    public void enterPurchases()
    {
        System.out.print("\nBurgers --> ");
        burgers = keyboard.nextInt();
        System.out.print("\nHotdogs --> ");
        hotdogs = keyboard.nextInt();
        System.out.print("\nChips --> ");
        chips = keyboard.nextInt();
        System.out.print("\nCandy --> ");
        candy = keyboard.nextInt();
        System.out.print("\nDrinks --> ");
        drinks = keyboard.nextInt();
    }
	
    /* This method calculates the total amount purchased for
     * each food type. It also calculates the total cost of
     * all the food purchase.
     */
    public void calculateTotals()
    {
        burgersTotal = burgers * 2.00;
        hotdogsTotal = hotdogs * 1.50;
        chipsTotal = chips * .50;
        candyTotal = candy * 1.00;
        drinksTotal = drinks * 1.00;
        grandTotal = burgersTotal + hotdogsTotal + chipsTotal + candyTotal + drinksTotal;
    }

    /* This method prints a receipt showing the totals for
     * food type purchased along with the total cost of all
     * the food.
     */
    public void printReceipt()
    {
        System.out.println("        Totals");
        System.out.println("-------------------");
        System.out.printf("%-15s%.2f%n%-15s%.2f%n%-15s%.2f%n%-15s%.2f%n%-15s%.2f%n", "Burgers: ", burgersTotal, "Hot dogs: ", hotdogsTotal, "Chips: ", chipsTotal, "Candy: ", candyTotal, "Drinks: ", drinksTotal);
        System.out.println("-------------------");
        System.out.printf("%15s%n", grandTotal);
    }

    public static void main(String[] args)
    {
        ConcessionStand app = new ConcessionStand();
        app.enterPurchases();
        app.calculateTotals();
        app.printReceipt();
    }
}