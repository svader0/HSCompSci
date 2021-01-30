package Unit8;

import java.util.Scanner;

public class LastLetter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string -->   ");
		String input = scan.nextLine();
		
		
		int inputLength = input.length();
		String lastLetter = input.substring((inputLength - 1), inputLength);
		
		System.out.println("The last letter is.. " + lastLetter + "!");
		
	}

}
