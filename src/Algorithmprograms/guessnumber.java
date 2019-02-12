package Algorithmprograms;

import utility.util;

public class guessnumber 
{
	public static void main(String[] args) {
	int num = 0;
	if(args.length  < 1) 
	{
		System.out.println("Provide a number(2^n) as command line argument...!");
		return;
	}
	num = Integer.parseInt(args[0]);
	
	
	int[] arr = new int[num];
	for(int i =0; i < num ; i++) 
	{
		 arr[i] = i;
	}
	System.out.println("Think a number in the range : 0 to "+(num-1));
	char choice;
	do 
	{
		System.out.println("Have you assumed a number...?");
		System.out.println("Enter your answer as 'y/n'");
		choice = util.scanner.next().toLowerCase().charAt(0);
	}while(choice!='y');
	
	util.guess(arr, 0, num-1);
}

	
	
}
