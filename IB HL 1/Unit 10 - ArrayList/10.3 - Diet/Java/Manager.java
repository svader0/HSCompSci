import java.util.Scanner;

public class Manager {
    private Diet diet;
    private Scanner keyboard = new Scanner(System.in);

    Manager() {
        diet = new Diet();
    }

    void mainMenu() {
        System.out.println("\n=========================");
        System.out.println("         Main Menu       ");
        System.out.println("=========================\n");
        System.out.println("1. Add Record");
        System.out.println("2. View Record");
        System.out.println("3. View All Records");
        System.out.println("4. Exit\n\n");
        System.out.print("Selection: ");
        switch (keyboard.nextInt()) {
        case 1:
            addRecord();
        case 2:
            viewRecord();
        case 3:
            viewAllRecords();
        case 4:
            System.exit(0);
        }
    }

    void addRecord() {
        System.out.println("\n=========================");
        System.out.println("         Main Menu       ");
        System.out.println("=========================\n");
        System.out.print("Enter date --> ");
        keyboard.nextLine();
        String dateIn = keyboard.nextLine();
        System.out.print("Enter weight --> ");
        int weightIn = keyboard.nextInt();
        diet.addEntry(new Entry(dateIn, weightIn));
        keyboard.nextLine();
        mainMenu();
    }

    void viewRecord() {
        System.out.println("\n=========================");
        System.out.println("         View Record       ");
        System.out.println("=========================\n");
        System.out.print("\n\nEnter date --> ");
        keyboard.nextLine();
        Entry result = diet.getEntry(keyboard.nextLine());
        System.out.println("\n\n" + result.toString());
        mainMenu();
    }

    void viewAllRecords() {
        System.out.println("\n=========================");
        System.out.println("      View All Records     ");
        System.out.println("=========================\n");
        diet.viewList();
        keyboard.nextLine();
        mainMenu();
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.mainMenu();
    }
}
