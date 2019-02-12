package Algorithmprograms;

import java.text.DecimalFormat;

import utility.util;

public class squareroot {

	public static void main(String[] args) 
	{
		double num;
		double sqrtVal;
		do {
			System.out.println("Enter a non- negative number...!");
			num = util.scanner.nextDouble();
		}while(num < 0);
		sqrtVal = util.sqrtNewtons(num);
		DecimalFormat df = new DecimalFormat(".###");
		System.out.println("Square root of "+num + " : "+df.format(sqrtVal));
	}

}