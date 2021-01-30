package Unit8;

import java.util.Scanner;

public class Acronym {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 3 words -->  ");
		String word1 = keyboard.next();
		String word2 = keyboard.next();
		String word3 = keyboard.next();
		
		
		System.out.println("\n\nNew word = " + word1.substring(0, 1).toUpperCase() + word2.substring(0, 1).toUpperCase() + word3.substring(0, 1).toUpperCase());
	}

}
