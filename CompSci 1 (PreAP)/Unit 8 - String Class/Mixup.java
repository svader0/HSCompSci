package Unit8;

import java.util.Scanner;

public class Mixup {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a word -->  ");
		String input = keyboard.nextLine();
		
		
		String firstHalf = input.substring(0, (input.length() / 2));
		String secondHalf = input.substring((input.length() / 2), input.length());
		
		
		System.out.println("\nRESULT\n=====================\n");
		System.out.println(secondHalf + firstHalf);
	
	}

}
