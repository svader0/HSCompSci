import java.util.*;

public class Main {

	private Dance dance;
	private Scanner scan;


	public Main() {
		dance = new Dance();
		scan = new Scanner(System.in);
	}

	public static void clearScr() {
		for (int i = 0; i < 50; i++) {
			System.out.println('\n');
		}
	}

	public void mainMenu() {
		int ans = 0;

		do {
			
			
			System.out.println("======================");
			System.out.println("      Main Menu");
			System.out.println("======================");
			System.out.println("1. Buy a Ticket");
			System.out.println("2. Print Summary Report");
			System.out.println("3. Exit");
			System.out.println();
			System.out.print("Selection --> ");
			ans = scan.nextInt();
			System.out.println();

			if (ans == 1) {
				buyTicket();
			} else if (ans == 2) {
				printSummary();
			}

		} while (ans != 3);

	}

	public void buyTicket() {
		int code;

		clearScr();
		System.out.println("======================");
		System.out.println("      Buy Ticket");
		System.out.println("======================");
		System.out.println("1. Gold Pass");
		System.out.println("2. Silver Pass");
		System.out.println("3. Bronze Pass");
		System.out.println("4. No Pass");
		System.out.println();
		System.out.print("Selection --> ");
		code = scan.nextInt();
		dance.buyTicket(code);
		clearScr();

	}

	public void printSummary() {
		clearScr();
		System.out.println("======================");
		System.out.println("   Summary Report");
		System.out.println("======================");
		System.out.printf("Total Attendance = %d%n",dance.getAttendance());
		System.out.printf("Ticket Sales = $%.2f%n", dance.getTicketSales()); // print ticket sales with 0.00 precision
		System.out.println();
		System.out.println();

	}

	public static void main(String[] args) {
		Main app = new Main();
		app.mainMenu();
	}
}