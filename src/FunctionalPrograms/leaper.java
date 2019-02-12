package FunctionalPrograms;

import java.util.Scanner;

import utility.util;

import java.util.*;

public class leaper
{
	public static int getyear()
	{
		int year = 0;
		boolean flag = false;
		
		System.out.println("Enter a 4-digits number...!");
		
		while(!flag)
		{
			year = util.scanner.nextInt();
			if(Integer.toString(year).length() < 4 || year <= 0)
				System.out.println("Enter a 4-dgit +ve number...!");
			else
				flag = true;
		}
		return year;
	}

	public static void main(String[] args)
	{
		int year = getyear();
		if(util.isLeapyear(year))
			System.out.println(year + " is a leap year");
		else
			System.out.println(year +" is not a leap year");
	}
}
	
	
