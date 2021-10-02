import java.util.*;

class Main {
	public static void printQueue(Deque<Integer> queue)
	{
   		System.out.println("Current List");
   		for(Integer n : queue)
   		{
   			System.out.print(n + " ");
   		}
   		System.out.println();
   		System.out.println();
}

	public static void main(String[] args) 
	{
		boolean exit = false;
		Scanner keyboard = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<>();
		while (exit == false)
		{
			System.out.println("Enter Task  A)dd,  D)elete,  E)xit");
			System.out.print("--> ");
			String in = keyboard.next().toUpperCase();
			switch(in)
			{
				case "A":
					System.out.print("\nNum to add --> ");
					queue.add(keyboard.nextInt());
					break;
				case "D":
					queue.remove();
					break;
				case "E":
					exit = true;
					break;
			}
			printQueue(queue);

		}
		keyboard.close();
	}
}