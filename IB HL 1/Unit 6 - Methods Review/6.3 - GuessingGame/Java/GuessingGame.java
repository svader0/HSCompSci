import java.util.*;

public class GuessingGame
{
    private int number;      // the random number
    private int myGuess;     // current guess
    private int numGuesses;  // number of guesses

    private final Scanner keyboard = new Scanner(System.in);

    public void generateNumber()
    {
        Random rand = new Random();
        number = Math.round(rand.nextInt(100 + 1));
    }

    public void makeGuess()
    {
        System.out.print("Make a guess --> ");
        myGuess = keyboard.nextInt();
        numGuesses++;
    }

    public boolean winner()
    {
        if (myGuess > number) {
            System.out.println("Too high, try again!");
            return false;
        }
        else if (myGuess < number) {
            System.out.println("Too low, try again!");
            return false;
        }
        else {
            return true;
        }

    }

    public void playGame()
    {
        generateNumber();
        do {
            makeGuess();
        } while (!winner());
        System.out.println("Number of guesses : " + numGuesses);
    }

    public static void main (String[] args)
    {
        GuessingGame app = new GuessingGame();
        app.playGame();
    }
}