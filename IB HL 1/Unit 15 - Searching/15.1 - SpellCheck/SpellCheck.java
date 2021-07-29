import java.util.*;
import java.io.*;

public class SpellCheck
{
    // constant
    public static final int LIST_SIZE = 150000;
        
	// instance variable
	private String[] wordList;   // list of words
    private int numWords = 0;   // logical size of wordList
	private String filePath = "IB HL 1\\Unit 15 - Searching\\15.1 - SpellCheck\\spellcheck.txt";
	
	// constructor
	public SpellCheck()
	{
	   wordList  = new String[LIST_SIZE];
	   readFile();
	   searchWords();	
	}
	
	// Performs a binary search on the wordlist looking for key.
	// If key is found, it returns true;  
	// otherwise it returns false
	public boolean binarySearch(String key)
	{
        int left = 0;
        int right = numWords;

        while(left <= right) 
        {
            int midpoint = ((right + left) / 2); //                   103960
			int result = wordList[midpoint].compareTo(key);
            if (result == 0)
            {
                return true;
            }
            else if (result < 0)
            {
                left = midpoint + 1;
            }
            else
            {
                right = midpoint - 1;
            }

        }
        return false;
	}
	
	// Interface used to check spelling of words
	public void searchWords()
	{
		Scanner keyboard = new Scanner(System.in);
		String ans="Y";
		while(ans.equalsIgnoreCase("Y"))
		{
			System.out.print("Enter word -->");
			String word = keyboard.nextLine();
			System.out.println();
			
			if(binarySearch(word) == true)
			   System.out.println(word + " is spelled correctly.");
			else
			{
			   System.out.println(word + " is spelled incorrectly!");
			}
			
			System.out.println();
			System.out.print("Enter another word[Y/N]? ");
			ans = keyboard.nextLine();
			System.out.println();
		}
        keyboard.close();
	}
	
	// Populates wordlist from a text file of words
        // Updates logical size of wordList
	public void readFile()
	{
		System.out.println("Reading wordlist ...");
		System.out.println();
		Scanner scan=null;
		try
		{
			scan = new Scanner(new File(filePath));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not found.");
		}
		
		while(scan.hasNextLine())
		{
			String str = scan.nextLine();
			wordList[numWords] = str;
                        numWords++;
		}			
	}
	
	public static void main(String[] args)
	{
		SpellCheck spellCheck = new SpellCheck();
	}
}