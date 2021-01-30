import java.util.*;

public class MethodPractice2
{
    private Scanner keyboard = new Scanner(System.in);

    private void greeting(String name, int iterations) {
        for (int i = 0; i<iterations; i++) {
            System.out.println(name + ", have a nice day!");
        }
    }

    private void range(int startingNum, int endingNum) {
        for (int i = startingNum; i <= endingNum; i++) {
            System.out.println(i);
        }
    }

    private boolean compare(String m_string) {
        return m_string.substring(0, 1).equals(m_string.substring(m_string.length()-1, m_string.length()));
    }

    private String reverse(String m_string) {
        String reverse = "";
        for (int i = m_string.length() - 1; i >= 0 ; i--) {
            reverse = reverse + m_string.charAt(i);
        }
        return reverse;
    }

    private int numOccurrences (String word, String letter) {
        int count = 0;
        for (int i = 1; i < word.length() + 1; i++) {
            if (word.substring(i - 1, i).equals(letter)) {
                count ++;
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        MethodPractice2 app = new MethodPractice2();

        System.out.println("******************");
        System.out.println("   Test greeting");
        System.out.println("******************");
        app.greeting("Kendall", 6);

        System.out.println("\n\n******************");
        System.out.println("   Test range");
        System.out.println("******************");
        app.range(10, 15);

        System.out.println("\n\n******************");
        System.out.println("   Test compare");
        System.out.println("******************");
        System.out.println(app.compare("demand"));
        System.out.println(app.compare("football"));
        System.out.println(app.compare("bulb"));

        System.out.println("\n\n******************");
        System.out.println("   Test reverse");
        System.out.println("******************");
        System.out.println(app.reverse("ball"));
        System.out.println(app.reverse("courage"));
        System.out.println(app.reverse("hamburger"));

        System.out.println("\n\n******************");
        System.out.println("   Test numOccurrences");
        System.out.println("******************");
        System.out.println(app.numOccurrences("MISSISSIPPI", "I"));
        System.out.println(app.numOccurrences("AUTOMOBILE", "O"));
        System.out.println(app.numOccurrences("TEXAS", "R"));
        System.out.println();
    }
}
