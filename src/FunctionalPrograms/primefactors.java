package FunctionalPrograms;

import utility.util;

public class primefactors
{
	public static void main(String[] args)
	{
		System.out.println("Enter a positive integer number");
	    int number = util.getPositiveInt();

	    util.primeFactors(number);
	}
}
