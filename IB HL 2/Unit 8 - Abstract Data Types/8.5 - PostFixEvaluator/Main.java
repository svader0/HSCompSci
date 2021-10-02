import java.util.*;
public class Main 
{
	private String[] test = {"4 5 +",
						   "3 4 2 * +",
						   "2 6 * 2 5 * +",
						   "7 4 + 8 - 3 *",
						   "2 3 + 4 5 * - 2 1 / +"
						   };
	public Main() 
	{
		for (String exp : test) 
		{
			System.out.println(exp + " = " + evaluate(exp));
		}
	}

	public int evaluate(String exp) 
	{
		Stack<String> stack = new Stack<>();
		String[] tokens = exp.split(" ");
		for (String token : tokens)
		{
			
			if (isOperator(token))
			{
				
				int num1 = Integer.parseInt(stack.pop());
				int num2 = Integer.parseInt(stack.pop());
				

				switch(token) 
				{
					case "+":
						stack.push(Integer.toString(num1 + num2));
						break;
					case "-":
						stack.push(Integer.toString(num1 - num2));
						break;
					case "*":
						stack.push(Integer.toString(num1 * num2));
						break;
					case "/":
						stack.push(Integer.toString(num1 / num2));
						break;
				}
			}
			else 
			{
				stack.push(token);
			}

		}
		return (Integer.parseInt(stack.pop()));
	}

	public boolean isOperator(String str)
	{
		if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		new Main();
	}
}