package testmaruthi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import utility.util;

public class bs1 {

	static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(arr[m]); 
  
            // Check if x is present at mid 
            if (res == 0) 
                return m; 
  
            // If x greater, ignore left half 
            if (res > 0) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String []args) 
    { 
        String path= "/home/admin1/Desktop/ma/maruthi/sample.txt";
        String[] words;
        String line= "";
        String key;
        try(BufferedReader br = new BufferedReader(new FileReader(path)))
        {
			String temp = null;
			while((temp = br.readLine())!= null)
			{
				line += temp;
			}
			words = line.split(",");
			Arrays.sort(words);
			System.out.println("Words list :");
			util.printStringArray(words);
			do {
				System.out.println("Enter the key...!");
				key = util.getString();
			}while(key.trim().equals("") || key == null);

        int result = binarySearch(words, key); 
  
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                              + "index " + result); 
	}
     catch (FileNotFoundException e)
        {
		e.printStackTrace();
	} catch (IOException e)
        {
		e.printStackTrace();
	}
    } 
} 


