package Unit8;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter NOUN -->  ");
		String noun1 = keyboard.next();
		System.out.println("Enter type of VEHICLE -->  ");
		String vehicle = keyboard.next();
		System.out.println("Enter ADJECTIVE -->  ");
		String adj1 = keyboard.next();
		System.out.println("Enter ADJECTIVE -->  ");
		String adj2 = keyboard.next();
		System.out.println("Enter NOUN -->  ");
		String noun2 = keyboard.next();
		System.out.println("Enter NOUN -->  ");
		String noun3 = keyboard.next();
		System.out.println("Enter ADJECTIVE -->  ");
		String adj3 = keyboard.next();
		System.out.println("Enter \'ED\' VERB -->  ");
		String verb = keyboard.next();
		System.out.println("Enter NOUN -->  ");
		String noun4 = keyboard.next();
		System.out.println("Enter NOUN -->  ");
		String noun5 = keyboard.next();
		System.out.println("Enter NOUN -->  ");
		String noun6 = keyboard.next();
		System.out.println("Enter NOUN -->  ");
		String noun7 = keyboard.next();
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nGILLIGAN\'s ISLAND\n--------------------------\n");

		System.out.println("Just sit right back and you`ll hear a tale,");
		System.out.println("A tale of a fateful " + noun1 + ",");
		System.out.println("That started from this tropic port,");
		System.out.println("Aboard this tiny " + vehicle + ".");
		System.out.println();
		System.out.println("The mate was a " + adj1 + " sailor man,");
		System.out.println("The skipper " + adj2 +" and sure.");
		System.out.println("Five "+ noun2 + " set sail that day,");
		System.out.println("For a three hour " + noun3 + ", a three hour " + noun3 + ".");
		System.out.println();
		System.out.println("The weather started getting " + adj3 + ",");
		System.out.println("The tiny " + vehicle + " was " + verb + ",");
		System.out.println("If not for the "+noun4+" of the fearless crew,");
		System.out.println("The " + noun5 + " would be lost, the " + noun5 + " would be lost.");
		System.out.println();
		System.out.println("The "+ vehicle +" set ground on the shore of this uncharted desert isle,");
		System.out.println("With Gilligan, The Skipper too,");
		System.out.println("The millionaire and his " + noun6 + " , The movie " + noun7 + ","); 
		System.out.println("And The Rest, Here on Gilligan`s Isle.");
	}

}
