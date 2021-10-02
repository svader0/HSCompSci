import java.util.*;

public class Main
{
   private String[] test = {"(4+5)",
                            "(3 * (5 + 2))",
                            "(6 * 3) + (7 * 5))",
                            "((10/2 + 4) * (6 + 8) + (2 + 9))",
                            "25 / 5)",
                            "((6+8) * (5+2) *(9+9)"};

	public Main()
	{
            for(String exp : test)
            {
                if(check(exp))
                {
                        System.out.println("passed");
                }
                else
                {
                        System.out.println("failed");
                }
            }
	}

    /* performs test to determine if exp has the correct number and ordering of brackets
     * @param the expression to be evaluated
     * @return true if exp passes test; false otherwise

	 
     */
	public boolean check(String exp)
	{
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < exp.length(); i++) 
		{
			Character ch = exp.charAt(i);
			if (ch == '(') 
			{
				stack.push(ch);
			}
			if (ch == ')') 
			{
				if (stack.isEmpty()) 
				{
					return false;
				}
				else 
				{
					stack.pop();
				}
			}
		}
		if (stack.isEmpty()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
            Main app = new Main();
	}
}