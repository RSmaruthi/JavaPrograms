package FunctionalPrograms;

import utility.util;

public class stringpermutation
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string...!");
		String input = util.getString();
		
		System.out.printf("Permutations of %s by iterative...!", input);

		String[] iterative = util.stringIterative(input);
		System.out.printf("\nNumber of permuations : %d\n",iterative.length);
		util.displayStringArray(iterative);
		
		System.out.printf("Permutations of %s by recursive...!\n", input);
		util.stringRecursion(input,0,input.length()-1);
	}

}
