package utility;

import utility.util;

public class getvalidint
{
	
	public static int getvalidint()
	{
		int r;
		do
		{
			System.out.println("Enter the input valid +ve integer");
			r= util.scanner.nextInt();//getvalidint();
		}while(r<0);
		return r;
	}
	public static void main(String [] arg)
	{
		int n=getvalidint();
		System.out.println(n);
	}
}

