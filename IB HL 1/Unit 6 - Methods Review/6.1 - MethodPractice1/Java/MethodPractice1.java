import java.util.*;

public class MethodPractice1 {
    private Scanner keyboard = new Scanner(System.in);

    public String method1(int weight) {
        if (weight < 100) {
            return "small";
        } else if (weight >= 100 && weight <= 200) {
            return "medium";
        } else if (weight > 200) {
            return "large";
        }
        return "Hey, buster, you messed it up.";
        /*Only return if something goes wrong*/
    }

    /**
     * This method prints phrase 10 times.
    */

    public void method2(String phrase) {
        for (int x = 0; x < 10; x++) {
            System.out.println(phrase);
        }
    }

    public int method3() {
        int input = keyboard.nextInt();
        int count = 0;
        while (input != -1) {
            count ++;
            input = keyboard.nextInt();
        }
        return count;
    }

    public String method4(String str) {
        return (str.substring(0, 1) + str.substring(str.length() - 1, str.length())); // returns the concatenation of the first index of the string, and also the last index (length, length-1)
    }

    /**
     * This method returns a random number.
     *
     * @param upper the upper limit of the random number
     * @return a random number in range of 0 to upper-1
     */
    public int method5(int upper) {
        return (int)Math.round(Math.random()*upper);
    }

    public static void main(String[] args) {
        MethodPractice1 app = new MethodPractice1();

        System.out.println("******************");
        System.out.println("   Test Method1");
        System.out.println("******************");

        System.out.println("Weight is " + app.method1(150));
        System.out.println("Weight is " + app.method1(99));
        System.out.println("Weight is " + app.method1(200));
        System.out.println("Weight is " + app.method1(300));

        System.out.println("\n\n******************");
        System.out.println("   Test Method2");
        System.out.println("******************");
        app.method2("Computers are fun!");

        System.out.println("\n\n******************");
        System.out.println("   Test Method3");
        System.out.println("******************");
        System.out.println("\nCount = " + app.method3());

        System.out.println("\n\n******************");
        System.out.println("   Test Method4");
        System.out.println("******************");
        System.out.println("String = " + app.method4("red"));
        System.out.println("String = " + app.method4("green"));
        System.out.println("String = " + app.method4("blue"));

        System.out.println("\n\n******************");
        System.out.println("   Test Method5");
        System.out.println("******************");
        System.out.println("Random Number = " + app.method5(5));
        System.out.println("Random Number = " + app.method5(50));
        System.out.println("Random Number = " + app.method5(500));
        System.out.println();
    }
}
