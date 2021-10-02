/*
Write a program that creates a linked list from an unknown number of strings,
then creates a second list containing a copy of the first list, but in reverse order. 
Output should consist of the original list and the reversed list. 
The input of strings should continue until the sentinel value -1 is entered by the user.
*/

import java.util.*;

class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		LinkedList<String>list = new LinkedList<>();
		String input;
		System.out.print("> ");
		input = keyboard.nextLine();

    	while (!input.equals("-1")) 
		{
			list.add(input);
			System.out.print("> ");
			input = keyboard.nextLine();
		}
		keyboard.close();

		Iterator iter1 = list.iterator();
		while (iter1.hasNext()) 
		{
			System.out.print(iter1.next() + " ");
		}

		LinkedList<String>revList = new LinkedList<>();
		for (int i = list.size() - 1; i >= 0; i--) 
		{
			revList.add(list.get(i));
		}

		System.out.print("\n\n");
		Iterator iter2 = revList.iterator();
		while (iter2.hasNext()) 
		{
			System.out.print(iter2.next() + " ");
		}
	}
}