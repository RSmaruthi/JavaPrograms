package FunctionalPrograms;
import utility.util;
import java.util.Scanner;

import utility.util;

public class flipcoin
{
	public static void main(String[] args)
	{
		int trials = util.gettrials();
				
		double headsPercentage = util.percentageofheads(trials);
		
		double tailsPercentage = 100-headsPercentage;
		
		System.out.print("% of Heads = ");
		System.out.printf("%.2f\n", headsPercentage);
		
		System.out.print("% of Tails = ");
		System.out.printf("%.2f\n", tailsPercentage);
	}
}