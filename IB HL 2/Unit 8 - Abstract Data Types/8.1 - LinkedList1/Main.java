import java.util.*;

public class Main {
	public Main() // constructor
	{
		System.out.println("\nLinkedList1");
		System.out.println("-----------");
		linkedList1();
		System.out.println("\nLinkedList2");
		System.out.println("-----------");
		linkedList2();
		System.out.println("\nLinkedList3");
		System.out.println("-----------");
		linkedList3();
	}

	public void linkedList1() 
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(0, 5);
		list.add(2, 15);
		System.out.printf("first = %4d\nlast  = %4d\n", list.getFirst(), list.getLast());
	}

	public void linkedList2()
   {
	   LinkedList<String> list = new LinkedList<>();
	   list.addFirst("elephant");
	   list.addLast("lion");
	   list.addFirst("cheetah");
	   list.addLast("chimpanzee");
	   list.addFirst("giraffe");
	   System.out.printf("first = %10s\nlast  = %10s\n", list.getFirst(), list.getLast());
	   Iterator<String> iter = list.iterator();
	   while(iter.hasNext()) 
	   {
		   System.out.print(iter.next() + " ");
	   }
	   System.out.println("first = " + list.element());
   }

	public void linkedList3() 
	{
		LinkedList<Position>list = new LinkedList<>();
		list.addLast(new Position(1,1));
		list.addLast(new Position(2,2));
		list.addLast(new Position(3,3));
		list.addFirst(new Position(0,0));
		Position loc = list.getFirst();
		loc.setX(100);
		loc.setY(100);
		while (!list.isEmpty()) 
		{
			System.out.print(list.pop() + " ");
		}
	}

	public static void main(String[] args) {
		Main app = new Main();
	}
}