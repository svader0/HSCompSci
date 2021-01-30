package Unit8;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first name -->  ");
		String firstName = keyboard.next();
		System.out.println("Enter last name -->  ");
		String lastName = keyboard.next();
		
		System.out.println("\n\n" + lastName + ", " + firstName);
	}

}
