import java.util.*;

class Main 
{

	public static void main(String[] args) 
	{

		LinkedList<Integer> list = new LinkedList<>();
		Iterator iter = list.iterator();

		for (int i = 0; i < 25; i++) 
		{
			iter = list.iterator();
			Integer num = (int) Math.floor(Math.random() * 25);
			int f = 0;
			while (iter.hasNext()) 
			{
				if ((int)iter.next() < num) 
				{
					f++;
				}
			}
            list.add(f, num);
            
		}

		iter = list.iterator();
		while (iter.hasNext()) 
		{
			System.out.print(iter.next() + " ");
		}
	}

}