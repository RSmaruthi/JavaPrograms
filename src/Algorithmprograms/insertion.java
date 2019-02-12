package Algorithmprograms;

import utility.util;

public class insertion
{
	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		
		String[] words;
		String line = "";
		String temp;
		System.out.println("Enter a few lines of words...!");
		
		do
		{
			temp = util.scanner.nextLine();
			line = line + temp;
		}while(temp.trim().equals("") + temp == null);

		
		words = line.split(" ");
		System.out.println("Before sorting ...!");
		util.printStringArray(words);
		
		words = util.insertionSortOfStrings(words);
		System.out.println("After sorting ...!");
		
		util.printStringArray(words);

	}
}
