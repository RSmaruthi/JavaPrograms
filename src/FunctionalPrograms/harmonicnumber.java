package FunctionalPrograms;

import utility.util;

public class harmonicnumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter a positive integer number");
		int number = util.getPositiveInt();
		
		double harmonicVal = util.getHarmonicNumber(number);
		System.out.print(number+"th Harmonic Value = ");
		
		System.out.printf("%.2f\n", harmonicVal);
	}

}
