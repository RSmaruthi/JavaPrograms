package Algorithmprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import utility.util;

public class primenumber
{
	
	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		System.out.println("Enter the range of prime numbers required (0 - N and N > 2)...!");
		int range = util.getPositiveInt();

		// finding all the prime numbers in the given range
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);//2 is the first prime number
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
	}
}


