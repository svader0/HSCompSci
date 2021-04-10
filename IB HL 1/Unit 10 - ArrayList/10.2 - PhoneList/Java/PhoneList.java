import java.util.*;

public class PhoneList {
    private ArrayList<Contact> phoneList = new ArrayList<Contact>();

    public void getContactInfo() {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            String name;
            String number;
            System.out.print("Enter a name --> ");
            name = keyboard.nextLine();
            System.out.print("Enter a phone number --> ");
            number = keyboard.nextLine();
            phoneList.add(new Contact(name, number));

            System.out.print("\n\nContinue? [Y/N] --> ");
            if (keyboard.nextLine().toLowerCase().equals("n")) {
                break;
            }
        }
        keyboard.close();
    }

    public void printContactInfo() {
        for (Contact i : phoneList) {
            System.out.printf("%-10s %-10s\n", i.getName(), i.getPhone());
        }
    }

    public static void main(String[] args) {
        PhoneList app = new PhoneList();
        app.getContactInfo();
        app.printContactInfo();
    }
}