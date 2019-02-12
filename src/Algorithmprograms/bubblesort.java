package Algorithmprograms;

import utility.util;

public class bubblesort
{
	public static void main(String[] args)
	{
		int count = 0;
		int[] nums;
	    System.out.println("Enter the number of elemnts you want to have in your list");
	    count = util.getPositiveInt();
	    
	    System.out.println("\t Enter '" + count + "' integers.");
	    nums = new int[count];
		
	    for (int i = 0; i < nums.length; i++)
	    {
	    	nums[i] = util.getInt();
	    }
	    
	    System.out.println("Elements before sorting ...!");
	    util.printIntArray(nums);
	    
	    System.out.println("Elements after bubble sorting ...!");
	    nums = util.bubbleSort(nums);
	    
	    util.printIntArray(nums);
	}
}
