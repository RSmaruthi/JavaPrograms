package Algorithmprograms;

import utility.util;

public class mergesort {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String[] words;
		String temp;
		String line = "";
		do {
			System.out.println("enter few line of text...!");
			temp = util.scanner.nextLine();
			line = line + temp;
		}while(temp.trim().equals("") || temp == null);
		words = line.split(" ");
		System.out.println("Before sorting ...!");
		util.printStringArray(words);
		words = util.mergeSort(words);
		System.out.println("After sorting ...!");
		util.printStringArray(words);
	}
    
}

