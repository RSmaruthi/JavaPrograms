package FunctionalPrograms;

import utility.util;

public class count3sum
{
	public static void main(String[] args)
	{
		System.out.println("Enter the numner(N) of integers...!");
		int num = util.getPositiveInt();
		
		System.out.println("Enter "+num+ " integers...!");
		int[] integers = new int[num];
		
		for (int i = 0; i < integers.length; i++)
		{
			integers[i] = util.getInt();
		}
		
		int no3Zero = util.count3intZero(integers);
		System.out.println("No. of distinct triplets = "+no3Zero);
	}
}

