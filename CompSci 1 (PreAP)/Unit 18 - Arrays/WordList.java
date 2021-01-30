package Unit18;

import java.util.*;

public class WordList
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String[] words = new String[10];
    for(int i = 0; i < 10; i++)
    {
      words[i] = keyboard.nextLine();
    }
    for(int i = 0; i < 10; i++) {
        System.out.println(words[i]);
    
    }
  }
}