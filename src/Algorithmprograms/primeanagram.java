 package Algorithmprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import utility.util;

public class primeanagram
{
	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		System.out.println("Enter the range of prime numbers required (0 - N and N > 2)...!");
		int range = util.getPositiveInt();
		
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);										//2 is the first prime number

		for(int i = 3; i<= range ; i = i+2)
		{
			if(util.isPrime(i))
			primes.add(i);
		}

		//printing all the prime numbers
		
		System.out.println("*****Prime numbers in the range of 0 - "+range + " are :******");
		for (Integer p : primes)
		{
			System.out.println(p);
		}

		//finding the prime numbers which are anagram
		
			
		HashMap<String,String> primeAnagrams = util.anagramsOfNumbers(primes);
		System.out.println("*******Prime numbers which are anagrams of each other are : *******");
		for(Map.Entry<String, String> entry : primeAnagrams.entrySet())
		{
			System.out.print(entry.getKey() +"\t");
			//append the value to key 
			String[] vals = entry.getValue().split(",");
			for(String s : vals)
			{
				System.out.print(Integer.parseInt(s) + "\t");
			 }
			System.out.println();
		}

		//finding the prime numbers which are palindrome
		ArrayList<Integer> primePalindromes = util.palindromesOfNumbers(primes);
		System.out.println("*******Prime numbers which are Palindromes are : *******");
		for(Integer i : primePalindromes)
		{
			System.out.println(i);
		}
	}
}
