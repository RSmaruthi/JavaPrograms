package utility;

	import java.io.OutputStreamWriter;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Scanner;
	public class util
	{
			
		public static Scanner scanner = new Scanner(System.in);
		
		
		
		//A library for reading in 2D arrays of integers
		//Doubles, or Booleans from standard input 

//	
		public static int getPositiveInt()
		{
			int n1 = scanner.nextInt();
			while(n1 <= 0) 
			{
				System.out.println("Enter a proper positive number...!");
				n1 = scanner.nextInt();
			}
			return n1;
		}
		
		
		
		//Read the standard input 
		//Insert the 2D Array
		public static void readArray(int[][] arr,int rows, int cols)
		{
			for (int i = 0; i < rows; i++)
			{
				for(int j = 0; j< cols;j++)
				{
					arr[i][j] = util.getInt();
				}
			 }
		}
		
		
		
		
		//Standard output
		//Standard 2D Array display
		
		
		public static void displayArray(int[][] arr,int row, int col)
		{
			try(PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out),true))
			{
				for (int i = 0; i < row; i++)
				{
					for(int j = 0; j< col;j++)
					{
						pw.write(arr[i][j] + "  ");
					}
					pw.println();
				}
				//end of the outer-loop
			 }
			//end of try-with resource
		}
		
		
		
		
		//Checking distinct cupones
		
		public static int distCoupon(int num)
		{
			int dcount = 0;
			int rCount = 0;
			boolean[] isDistinct = new boolean[num];
			while(dcount < num)
			{
				int random = (int)(Math.random()*num);
				rCount++;
				
				if(!isDistinct[random])
				{
					System.out.println("Random = "+random);
					isDistinct[random] = true;
					dcount++;
				}
			}
			return rCount;
		}
		
		
		
		
		
		
		//get the integer value  from keyboard..
		//return integer value  
			
		public static int getInt()
		{
			int n = scanner.nextInt();
			return n;
		}
		
		
		
		
		//checking the string is valid r not and length is >3
		
		public static String getstring()
		{
			String str = scanner.next();
			while(str.trim().equals("") || str == null)
			{
				System.out.println("Enter a valid string...!");
				str = scanner.next();
			}
			return str;
		}
		
		
		
		//the sum of 3 integer is equal to zero
		
		public static int count3intZero(int[] numbers)
		{
			int count = 0;
			HashSet<String> triplets = new HashSet<String>();
			for (int i = 0; i < numbers.length-2; i++)
			{
				for (int j = i+1; j < numbers.length-1; j++)
				{
					for (int k = j+1; k < numbers.length; k++)
					{
						if(numbers[i] + numbers[j] + numbers[k] == 0)
						{
							String temp = ""+numbers[i] + "@"+numbers[j] + "@" + numbers[k];
							if(isDistinctTriplet(triplets,temp))
							{
								count++;
								System.out.println(numbers[i] + " "+numbers[j] + " "+numbers[k]);
							}
						}
					}
				}
			}
			return count;
		}
		
		
		
		
		//and check is distincttriplet
		public static boolean isDistinctTriplet(HashSet<String> distincts, String str)
		{
			if(distincts.size() == 0)//first distinct string
				return distincts.add(str.toLowerCase());
			else
				return distincts.add(str.toLowerCase());
		}
		
		
		
		
		
		
		/* Take the input from user 
		//find the distance from x to y  
		*@Using math.pow square the input number and add both number
		*squareroot the number
		**/
		
		public static double Distance(double x, double y)
		{
			return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		}
		
		
		
		
		//Get the number of times trails 

		public static int gettrials()
		{
			int trials = 0;
			boolean flag = false;
			while(!flag)
			{
				System.out.println("Enter number of times the coin to be flipped...!");
				trials = util.scanner.nextInt();
				if(trials <= 0)
					System.out.println("Enter a positive number...!");
				else
					flag = true;
			}
			return trials;
		}
		

		
		
		//finding  the persentage of heads present int trails
		
		public static double percentageofheads(int trials)
		{
			int heads = 0;
			for(int i = 0; i < trials; i++)
			{
				if(Math.random() >= 0.5)
					heads++;
			}
			if(heads == 0)
				return 0;
			return (heads*1.0)/trials*100;
		}

		
		//checking the no goals is done in the stoke and trails in the goal
		//print the persentage of win and loss the gain
		
		public static void playGame(int stake, int goal, int trials)
		{
			int wins = 0;
			int bets = 0;
			for(int i = 1; i <= trials ; i++) 
			{
				int cash = stake;
			
				while( cash > 0 && cash < goal) 
				{
					bets++;
					if(Math.random() >= 0.5)
						cash++;
					else
						cash--;		   
				}
				if(cash == goal)
					wins++;
			}
			System.out.println("Total no. of bets made  = "+bets);
			System.out.println("Total no. of wins = "+ wins);
			double winPercentage = (wins*100.0)/trials;
			System.out.println("Win % = "+winPercentage);
			System.out.println("Loss % = "+(100-winPercentage));
		}

		
		
		
		

		// reads a input in positive integer and harmonic number
		//checking harmonic
		
		public static double getHarmonicNumber(int n)
		{
			double harmonic = 0;
			for (int i = 1; i <= n; i++)
			{
				harmonic += 1.0 / i;
			}
			return harmonic;
		}
		
		
		
		
		//checking leaper
		/*
		0 * to read the 4-digit year
		 * @return
		 */
		
		public static boolean isLeapyear(int year) 
		{
			if  ((year % 4 == 0) && (year % 100 != 0)) 
				return true;
			if  (year % 400 == 0) 
				return true;
			else
			return false;
		}
		
		
		
		
		//display the power of 2
		
		public static void powerOfTwo(int y)
		{
			for(int i=0;i<=y;i++)
			{
				System.out.println("2^"+i+"="+(int)Math.pow(2, i));
			}
		}
		
		
	/*	
		
		//print the table of power of 2
		//positive int
		
		public static int getpositiveint()
		{
			int n = scanner.nextInt();
			while(n <= 0)
			{
				System.out.println("Enter a proper positive number...!");
				n = scanner.nextInt();
			}
			return n;
		}
		
		*/
		
		
		//checking the input integer is between 0  r 31 
		public static int check(int n)
		{
			if(n==0 || n>31)
			{
				System.out.println("Enter a valid intiger...! bitween 0 to 31");
				 n=scanner.nextInt();
				 return check(n);	
			}
			else
				return n;
		}
		
		
	
		//it can use to print the power of 2 table 
		
		public static void printtable(double num)
		{
			System.out.println("the power of 2 table is:");
			for (int i = 1; i <= num; i++)
			{
				System.out.println("2^"+i+ " = "+(int)Math.pow(2, i));
			}
		}
		
		//checking binary ele in guess
		
		
		public static void guess(int[] arr, int l ,int r) 
		{
			int mid;
			char ans;
			if(l == r)
			{
				System.out.println("Your number is : " + arr[l]);
				return ;
			}
			else
			{
				mid = (l+r)/2;
				System.out.println("Is your number 'smaller' compared to "+arr[mid]);
				System.out.println("Enter 'y/n'...!");
				ans = util.scanner.next().toLowerCase().charAt(0);
				if(ans == 'y')
					guess(arr,l,mid-1);
				else
					guess(arr,mid+1,r);
			}
		}
		
		
		
		//prime factors..
		// checking the prime number and factor of the numbers
		
		
		public static void primeFactors(int number)
		{
			// print the number of 2s that divide n 
			while (number%2 == 0) 
			{ 
				System.out.println(2);
				number = number/2; 
			} 

			// number must be odd at this point.
			for (int i = 3; i <= Math.sqrt(number); i = i+2) 
			{ 
				while (number%i == 0) 
				{ 
					System.out.println(i);
					number = number/i; 
				} 
			} 
			// This condition is to handle the case when number is a prime number greater than 2 
			if (number > 2) 
				System.out.println(number);
		}
		
		
		
		
		//Get the double value and return the value to the main program
		
		public static double getDouble()
		{
			return scanner.nextDouble();
		}
		
		
		
		
		// calculating the quadraticroots in given inputs
		
		public static double[] quadraticRoots(double a, double b, double c)
		{
			double[] roots = new double[2];
			
			if(a == 0.0)
			{
				System.out.println("can't find the quadritc roots for an equation of degree less than 2...!");
				return roots = null;
			}
			
			double delta = b*b-4*a*c;
			roots[0] = (-b+Math.sqrt(delta))/(2*a);
			roots[1] = (-b-Math.sqrt(delta))/(2*a);
			
			return roots;
		}
		
		
		
		
		
		
		//convert ing milsec to sec
		//second to min
		//min to hour
		// hour to min
		
		public static void printTime(long time)
		{
			int millisec = (int)time % 1000;
		
			time =  time / 1000;
			
			int secs = (int)time % 60;
			
			int mins = ((int)time) /60; 
			
			int hours = mins/60;
			
			mins = mins%60;

			System.out.println("\t Elpased Time : "+hours+":"+mins+":"+secs +":"+ millisec);
		}
		
		
		
			
		//Get the  string from input
		//check the input is Null and Remove the space of a givin String
		
		public static String getString()
		{
			String str = scanner.next();
			while(str.trim().equals("") || str == null)
			{
				System.out.println("Enter a valid string...!");
				str = scanner.next();
			}
			return str;
		}
			
		
		
		
		// string permutation using itiration
		public static String[] stringIterative(String inputStr)
		{
			List<String> result = new ArrayList<>();
			char[] chars = inputStr.toCharArray();
			result.add(new String("" + chars[0]));
			for(int j=1; j<chars.length; j++)
			{
				char c = chars[j];//b
				int cur_size = result.size();
				//creating new permutations by combining char 'c' with each of the existing permutations
				
				for(int i=cur_size-1; i>=0; i--)
				{
					String str = result.remove(i);//a
					for(int l=0; l<=str.length(); l++)
					{
						result.add(str.substring(0,l) + c + str.substring(l));
					}
				}
			}
			String[] permutations = result.toArray(new String[result.size()]);
			return permutations;
		}

		
		
		
		
		// Display the String in array
		public static void displayStringArray(String[] str)
		{
			for (int i = 0; i < str.length; i++) 
			{
				System.out.println(str[i]);
			}
		}

		
		
		
		//String to calculate permutation for RECURSION
		public static void stringRecursion(String str, int stIndex, int enIndex)
		{
			if (stIndex == enIndex)
				System.out.println(str);
			else
			{
				for (int i = stIndex; i <= enIndex; i++)
				{
					str = swap(str,stIndex,i);
					stringRecursion(str, stIndex+1, enIndex);
					str = swap(str,stIndex,i);
				}
			} 
		} 	

		
		
		
		//SWAP the Character in position of i,j...
		public static String swap(String str, int i, int j)
		{
			char temp;
			char[] charArray = str.toCharArray();
			temp = charArray[i] ;
			charArray[i] = charArray[j];
			charArray[j] = temp;
			return String.valueOf(charArray); 
		} 
		
		
		//calculating the windchill
		//using the give equation..wind =35.74+0.6215*temp+(0.4275*temp-37.75)* (velocity)^0.a6
		
		public static double getwindchill(double t, double v)
		{
			
			// TODO Auto-generated method stub
			double windChill = 0.0;
			windChill = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
			return windChill;
			
		}
			
		
		
		
			
		//Algorithm Programs
			
			
			

		
			
		//check two strings are anagram are not
		//converting Uppercase to Lowercase
		//Each characters can be Sorted
		//Both the strings Are Equal Return TRUE else FALSE
		
		public static boolean checkAnagram(String str1, String str2)
		{
			if(str1.length() != str2.length())
				return false;
			str1 = toLowerCase(str1);
			str2 = toLowerCase(str2);
			str1 = stringSort(str1);
			str2 = stringSort(str2);
			if(str1.equals(str2))
				return true;
			else
				return false;
		}
			
		
		
		
		//conver string Upper to Lower
			
		public static String toLowerCase(String str)
		{
			char aChar;
			String lower = "";
			for (int i = 0; i< str.length(); i++)
			{				
				aChar = str.charAt(i);
				if (65 <= aChar && aChar<=90)
				{
					aChar = (char)( (aChar + 32) );
					lower = lower + aChar;
				}
				else
					lower = lower + aChar;
			}
			return lower;
		}
		
		
		
		
		//swaping the order of characters
		public static String stringSort(String str)
		{
			char[] chars = new char[str.length()];
			for(int i =0; i< str.length() ; i++) 
			{
				chars[i] = str.charAt(i);
			}
			for(int i = 1; i < chars.length ; i++) 
			{
				for(int j = i; j > 0 ; j--) 
				{
					if(chars[j-1] > chars[j])
					{
						//Swap the two elemets
						char temp = chars[j-1];
						chars[j-1] = chars[j];
						chars[j] = temp;
					}
				}
			}//end of outer loop
			return new String(chars);
		}
		
		//to binary search
		
		public static char[] toBinary(int decimal)
		{
			String binaryDigits = "";
			while(decimal > 0)
			{
				binaryDigits += decimal % 2;
				decimal = decimal / 2 ;
			}
			return binaryDigits.toCharArray();
		}

		//swap 
		
		public static int swapNibbles(int decimal) 
		{ 
			return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4); 
		} 

		
		
		
		
		
		///check entered number is power of two
		
		public static boolean isPowerTwo(int num) 
		{
			return (int)(Math.ceil((Math.log(num) / Math.log(2)))) ==  
					(int)(Math.floor(((Math.log(num) / Math.log(2))))); 
		}	

		
		
		
		
		//bubble sort
		public static int[] bubbleSort(int[] A)
		{
			int n = A.length;
			int temp = 0;
			for(int i = 0; i < n; i++)
			{
				for(int j=1; j < (n-i); j++)
				{	//number of comaparisions in each pass is n-i
					if(A[j-1] > A[j])
					{
						temp = A[j-1];
						A[j-1] = A[j];
						A[j] = temp;
					}
				}
			}
			return A;
		}

			
			
		
		
		//printing the array in bubble sort
		public static void printIntArray(int[] A)
		{
			for (int i : A)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		//find the DaysOfWeeks
		//display the what day is it's
		
		
		public static int dayOfWeek(int m, int d, int y) 
		{			
			int y0=y-(14-m)/12;;
			int x = y0+(y0/4)-y0/100+y0/400;
			int m0 = m+12*((14-m)/12)-2;
			int d0 = (d+x+31*m0/12)%7;
			return d0;
		}	

		
		
		//Print String will be inserted
			
		public static void printStringArray(String[] A)
		{
			for (String i : A) 
			{
				System.out.print("\t"+i);
			}
			System.out.println();
		}
		
		
		//merge sort..
		
		public static String[] mergeSort(String[] list) {
			String [] sorted = new String[list.length];
			if (list.length == 1) {
				sorted = list;
			} else {
				int mid = list.length/2;
				String[] left = null; 
				String[] right = null;
				if ((list.length % 2) == 0) {
					left = new String[list.length/2];
					right = new String[list.length/2];
				} else { 
					left = new String[list.length/2];
					right = new String[(list.length/2)+1];
				}
				int x=0;
				int y=0;
				for ( ; x < mid; x++) {
					left[x] = list[x];
				}
				for ( ; x < list.length; x++) {
					right[y++] = list[x];
				}
				left = mergeSort(left);
				right = mergeSort(right);
				sorted = mergeArray(left,right);
			}
			return sorted;
		}
		
		
		
		//merge array function to use to mrge the the array
		
		public static String[] mergeArray(String[] left, String[] right) {
			String[] merged = new String[left.length+right.length];
			int lIndex = 0;
			int rIndex = 0;
			int mIndex = 0;
			int comp = 0;
			while (lIndex < left.length || rIndex < right.length) {
				if (lIndex == left.length) {
					merged[mIndex++] = right[rIndex++];
				} else if (rIndex == right.length) {
					merged[mIndex++] = left[lIndex++];
				} else {  
					comp = left[lIndex].compareTo(right[rIndex]);
					if (comp > 0) {
						merged[mIndex++] = right[rIndex++];
					} else if (comp < 0) {
						merged[mIndex++] = left[lIndex++];
					} else { 
						merged[mIndex++] = left[lIndex++];
					}
				}   
			}
			return merged;
		}
		
		
		
		//monthly payment function to calculate the payment
		
		
		public static double monthlyPayment( double p , double y , double r )
		{
			double n = (12 * y);
			r = r / (12*100);
			double power = Math.pow((1+r), -n);
			double payment = ((p*r)/ (1 - power));
			return payment;
		}
		
		
		
		
			
		//Insertion sort from inserted Array
		//  swap each array
		public static String[] insertionSortOfStrings(String[] A)
		{
			for(int i = 1; i < A.length ; i++)
			{
				for(int j = i; j > 0 ; j--)
				{
					if(A[j-1].compareTo(A[j]) > 0)
					{	//Swap the two elemets
						String temp = A[j-1];
						A[j-1] = A[j];
						A[j] = temp;
					}
				}
			}//end of outer loop
			return A;
		}
		
		
		
		
		//checking prime number
		//check prime
		public static boolean isPrime(int num)
		{
			for(int i = 2 ; i <= num/2 ; i++) 
			{
				if(num % i == 0)
					return false;
			}
			return true;
		}
		
		
		
		// anagram of prime numbers
		public static HashMap<String,String> anagramsOfNumbers(ArrayList<Integer> nums)
		{
			HashMap<String,String> primeAnagrams = new HashMap<String,String>();
			boolean anagram = false;
			for(int i = 0 ;i < nums.size() - 1; i++) 
			{
				for(int j= i+1; j < nums.size(); j++) 
				{
					Integer p1 = nums.get(i);
					Integer p2 = nums.get(j);
					anagram = util.checkAnagram(p1.toString(), p2.toString());
					if(anagram) 
					{
						if(primeAnagrams.containsKey(p1.toString()))
						{
							String oldValue = primeAnagrams.get(p1.toString());
							primeAnagrams.put(p1.toString(), oldValue+","+p2.toString());
						}
						else
							primeAnagrams.put(p1.toString(), p2.toString());
					}//end of anagram condition
				}
			}//end of i loop
			return primeAnagrams;
		}
			
		
		
		
		//check polindroms no anagram
		public static ArrayList<Integer> palindromesOfNumbers(ArrayList<Integer> nums)
		{
			ArrayList<Integer> allPalindromes = new ArrayList<Integer>();
			boolean palindrome = false;
			Integer temp;
			for(int i = 0 ;i < nums.size() - 1; i++) 
			{
				temp = nums.get(i);
				palindrome = util.checkPalindrome(temp.toString());
				if(palindrome) 
				{
					allPalindromes.add(temp);
				}
			}//end of i loop
			return allPalindromes;
		}
			
			
		
		
		// checking polindrom r not
		public static boolean checkPalindrome(String str1)
		{
			String temp = new StringBuilder(str1).reverse().toString();//reversed of str2
			
			if(str1.trim().toLowerCase().equals(temp))
			return true;
		
			return false;
		}


		
		
		//square root of a given number
		
		public static double sqrtNewtons(double c)
		{
			double epsilon = 1e-15;
			double t = c;			
			while(Math.abs(t - c/t) > epsilon*t)
			{
				t=(c/t + t)/2.0;
			}
			return t;
		}

		
		
		
		
	

		
		//convertion temparature 
		
		
		public static double temperaturConversion(double temperature,int isFahrenheit) {
			double result;
			if(isFahrenheit == 1)
				//fahrenheit to celsius
				result = ((temperature-32) * 5)/9 ;
			else
				//celsius to fahrenheit
				result = (temperature *9/5+32);
			return result;
		}
		
		//binary search in given string
		
			 
		public static int binarySearch(String[] names, String key)
		    {
			int l=0,r=names.length-1;
			while(l<=r)
			{
				int pos=l+(r-l)/2;
				int res=key.compareTo(names[pos]);
				if(res==0)
				return pos;
				if(res>0)
					l=pos+1;
				else
					r=pos-1;
			}
					   
		    return -1;
		}
		    
		 
}
