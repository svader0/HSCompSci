package Unit8;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		
		// Variables
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		
		// User Input
		System.out.print("Enter a word -->  ");
		String input = keyboard.next();
		
		// Find values
		
		int firstAIndex = input.indexOf("a");
		
		// Print
		System.out.print("\n\nRESULT\n=====================\n");
		System.out.print(input.substring(0, firstAIndex) + "*" + input.substring((firstAIndex + 1), input.length()));
		
	}

}
