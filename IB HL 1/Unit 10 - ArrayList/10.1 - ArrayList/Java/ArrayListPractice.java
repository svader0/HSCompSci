
import java.util.*; // needed for ArrayList

public class ArrayListPractice {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Method 1");
        System.out.println("--------");
        System.out.println();
        Method1();
        System.out.println();
        System.out.println("Method 2");
        System.out.println("--------");
        System.out.println();
        Method2();
    }

    public static void Method1() {
        // create arraylist and add nums
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10) {
            arr.add(i);
        }

        // print two times with regular and enhanced for loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println();
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void Method2() {
        ArrayList<String> arr = new ArrayList<String>();
        String textBuffer = "";
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Add text (\"exit\" to cancel)--> ");
            textBuffer = keyboard.next();
            if (textBuffer.equals("exit")) {
                break;
            } else {
                arr.add(textBuffer);
            }
        }

        keyboard.close();
        System.out.println();

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println();
        for (String i : arr) {
            System.out.println(i);
        }
    }
}