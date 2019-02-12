package Algorithmprograms;

import utility.util;

public class anagram
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter two strings to be checked for anagram ...!");
		String str1 = util.getString();
		
		String str2 = util.getString();
		
		boolean isAnagaram = util.checkAnagram(str1, str2);
		if(isAnagaram)
			System.out.println("'"+str1+"' and '" + str2+ "' are anagram...!");
		else
			System.out.println("'"+str1+"' and '" + str2+ "' are n't anagram ...!");
	}
}
