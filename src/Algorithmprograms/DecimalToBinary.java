package Algorithmprograms;

import utility.util;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimal;
		do {
			System.out.println("Enter a positive number...!");
			decimal = util.getPositiveInt();
		}while(decimal <= 0);

		System.out.println("Decimal Number  : "+decimal);
		char[] result = util.toBinary(decimal);
		System.out.print("Binary Number  : ");
		for(int i = result.length -1; i>= 0;i--)
			System.out.print(result[i]);
	}
}