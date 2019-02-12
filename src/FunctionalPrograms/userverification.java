package FunctionalPrograms;

import utility.util;
import java.util.Scanner;
import utility.util;

public class userverification
{
	public static String getname()
	{
		String input = null;
		boolean flag = false;
		while(!flag)
		{
			System.out.println("Enter your name...!");
			input = util.scanner.next().trim().toUpperCase();
			if(input.equals("")||input == null)
				System.out.println("Plz enter a valid name ...!");
			else if(input.length()< 3)
				System.out.println("Plz enter name of min 3 chars length...!");
			else
				flag = true;
		}
		return input;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String temp = "Hello <<UserName>>, How are you?";
		String name = getname();
	
		temp  = temp.replace("<<UserName>>", name);
		System.out.println(temp);
	}

}
