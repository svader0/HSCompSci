package Unit10;

import java.util.Scanner;

public class Help {
	// Variables
	double extraPoints = 0;
	double s1Avg, s2Avg, s3Avg, s4Avg, s5Avg, s6Avg, s7Avg, s8Avg, s9Avg, s10Avg;
	double leslieAvg;
	
	Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Help help = new Help();
		help.getAverages();
		help.calculateResults();
		help.printResults();

	}
	public void getAverages() {
		System.out.println("\n===============\nGet Averages\n===============\n");
		
		System.out.println("Leslie's Average -->  ");
		
		leslieAvg = keyboard.nextDouble();
		
		System.out.println("Student 1 Avg -->  ");
		s1Avg = keyboard.nextDouble();
		System.out.println("Student 2 Avg -->  ");
		s2Avg = keyboard.nextDouble();
		System.out.println("Student 3 Avg -->  ");
		s3Avg = keyboard.nextDouble();
		System.out.println("Student 4 Avg -->  ");
		s4Avg = keyboard.nextDouble();
		System.out.println("Student 5 Avg -->  ");
		s5Avg = keyboard.nextDouble();
		System.out.println("Student 6 Avg -->  ");
		s6Avg = keyboard.nextDouble();
		System.out.println("Student 7 Avg -->  ");
		s7Avg = keyboard.nextDouble();
		System.out.println("Student 8 Avg -->  ");
		s8Avg = keyboard.nextDouble();
		System.out.println("Student 9 Avg -->  ");
		s9Avg = keyboard.nextDouble();
		System.out.println("Student 10 Avg -->  ");
		s10Avg = keyboard.nextDouble();
		
	}
	public void calculateResults() {
		System.out.println("\n===============\nCalculate Results\n===============\n");
		extraPoints = extraPoints + (s1Avg - Math.floor(s1Avg));
		extraPoints = extraPoints + (s2Avg - Math.floor(s2Avg));
		extraPoints = extraPoints + (s3Avg - Math.floor(s3Avg));
		extraPoints = extraPoints + (s4Avg - Math.floor(s4Avg));
		extraPoints = extraPoints + (s5Avg - Math.floor(s5Avg));
		extraPoints = extraPoints + (s6Avg - Math.floor(s6Avg));
		extraPoints = extraPoints + (s7Avg - Math.floor(s7Avg));
		extraPoints = extraPoints + (s8Avg - Math.floor(s8Avg));
		extraPoints = extraPoints + (s9Avg - Math.floor(s9Avg));
		extraPoints = extraPoints + (s10Avg - Math.floor(s10Avg));
		
		leslieAvg += extraPoints;
		System.out.println("\nDone.\n");
		
	}
	public void printResults() {
		System.out.println("\n===============\nPrint Results\n===============\n");
		System.out.println("New Points = " + extraPoints);
		System.out.println("Leslie's Total = " + leslieAvg);
		
	}
	

}
