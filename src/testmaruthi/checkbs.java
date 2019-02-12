package testmaruthi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import utility.util;

public class checkbs {
	
	 
		public static int binarySearchOfString(String[] names, String key)
		    {
			for(int i=0;i<names.length;i++)
			{
			for(int j=0;j<key.length();j++)
				{
				char[] ch=key.toCharArray();
					if(names[i]==key)
					{
						return 1;
						
					}
					else return -1;
				}
			}
				return -1;
		}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String path; //= "/home/admin1/Desktop/ma/maruthi/sample.txt";
		String[] words;
		String line= " ";
		String key;
		int result;
		System.out.println("enter the path");
		path=util.scanner.next();
		try(BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String temp = null;
			while((temp = br.readLine())!= null)
			{
				line += temp;
			}
			words = line.split(",");
			
			System.out.println("Words list before sort:");
			util.printStringArray(words);
		
			
			//Arrays.sort(words);
			System.out.println("Words list  after sort:");
			
		//	words=util.mergeSort(words);
			
			words = util.insertionSortOfStrings(words);
		//	util.printStringArray(words);
			Arrays.sort(words);
			util.printStringArray(words);
			
			
			do {
				System.out.println("Enter the key...!");
				key = util.getString();
				
			}while(key.trim().equals("") || key == null);

			result = binarySearchOfString(words, key);
			
			
			if(result > 0)
				
				System.out.println("Key '"+ key+"' found  at position "+result);
			else
				System.out.println("Key '"+key+"'not found...!");
					} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


	
		
