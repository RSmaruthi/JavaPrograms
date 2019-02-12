package FunctionalPrograms;

import utility.util;

public class distance
{
	public static void main(String[] args)
	{
		if(args.length < 2)
			{
				System.out.println("enter 2 inputs");
			}
		else
			{
				double x;
				double y;
				try {
						x = Double.parseDouble(args[0]);
						y = Double.parseDouble(args[1]);
						double distance = util.Distance(x, y);
						System.out.print("distance from (" + x + ", " + y + ") to (0, 0) = ");
						System.out.printf("%.2f",+distance);
					}
				catch(NumberFormatException e)
					{
						System.out.println("Enter two numbers as inputs " + e.getMessage());
					}
			}
	}
}