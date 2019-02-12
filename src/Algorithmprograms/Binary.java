package Algorithmprograms;

import utility.util;

public class Binary {

	public static void main(String[] args) {
		int decimal;
		do {
			System.out.println("Enter a positive number...!");
			decimal = util.getPositiveInt();
		}while(decimal <= 0);

		//convert to  binary
		System.out.println("Decimal Number  : "+decimal);
		char[] temp  = util.toBinary(decimal);
		String  binary = new String(temp);
		StringBuffer sb = new StringBuffer(binary);
		sb.reverse();
		binary = sb.toString();
		System.out.println("Binary equivalent of " +decimal+" : "+ binary);
		int swapped = util.swapNibbles(decimal);
		temp = util.toBinary(swapped);
		binary = new String(temp);	
		sb = new StringBuffer(binary);
		sb.reverse();
		binary = sb.toString();
		int toInt = Integer.parseInt(binary,2);
		System.out.println("After swapping nibble binary equivalent :"+binary);
		System.out.println("After swapping nibble decimal equivalent :"+toInt);
		boolean isPowerOf2 = util.isPowerTwo(toInt);
		if(isPowerOf2)
			System.out.println(toInt + " is  power 2");
		else
			System.out.println(toInt + " is  not a power 2");
	}

}