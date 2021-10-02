/*
	PROGRAM WRITTEN BY SAMMY V ON 10/1/2021
	AT 10:25 AM
*/
import java.util.*;

class Palindrome {

	public boolean checkPalindrome(String input) 
	{
		Stack<Character> stack = new Stack<>();
		LinkedList<Character> queue = new LinkedList<>();
		for (int i = 0; i<input.length(); i++) 
		{
			stack.add(input.charAt(i));
			queue.add(input.charAt(i));
		}

		for (int i = 0; i<input.length(); i++) 
		{
			
			if (stack.pop() != queue.pop())
			{
				return false;
			}
		}
		return true;
	}

	Palindrome() 
	{
		boolean exit = false;
		String input = "";
		Scanner keyboard = new Scanner(System.in);
		while (exit == false)
		{
			System.out.print("\nPalindrome Checker :)\n(type exit to exit)\nEnter word to check -> ");
			input = keyboard.nextLine();
			if (input.equals("exit"))
				exit = true;
			else 
			{
				System.out.println("\n\n" + input + " " + 
				(checkPalindrome(input)? 
					"is a palindrome" : "is not a palindrome"
				));
			}
		}
		keyboard.close();
	}

	public static void main(String[] args) 
	{
		new Palindrome();
	}
}