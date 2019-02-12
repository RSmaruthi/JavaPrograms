package next;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import utility.util;

public class wordsearch
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String path= "/home/admin1/Desktop/ma/maruthi/sample.txt";
		String[] words;
		String line= " ";
		String key;
		int result;
	//	System.out.println("enter the path");
		//path=util.scanner.next();
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
			
			
			
			
			
			System.out.println("Words list  after sort:");
			Arrays.sort(words);
			
			util.printStringArray(words);
			
			
			do {
				System.out.println("Enter the key...!");
				key = util.getString();
				
			}while(key.trim().equals("") || key == null);

			result = util.binarySearch(words, key);
			
			
			if(result >= 0)
				
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


