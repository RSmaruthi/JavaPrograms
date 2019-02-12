package testmaruthi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.management.InstanceNotFoundException;

import utility.util;

public class bss {
	public static int  recSearch(String[] words, String wordToFind)throws InstanceNotFoundException {
	    int start = 0;
	    int end = words.length - 1;
	    int mid = (start + end) /2;
	    if(end < start) {
	        return -1;
	    } else if (words[mid].equals(wordToFind)) {
	      
	        return mid;
	    } else if(words[mid].compareTo(wordToFind) < 0) {
	        String[] split = new String[mid - 1];
	        for(int i = 0; i < mid; i++) {
	            split[i] = words[i];
	        }
	        return recSearch(split,wordToFind);
	    } else if(words[mid].compareTo(wordToFind) > 0) {
	        String[] split = new String[mid + 1];
	        for(int i = 0; i < mid -1; i++) {
	            split[i] = words[i];
	        }
	        return recSearch(split,wordToFind);
	    }
	    return -1;
	    // throw new ItemNotFoundException();
	}
	
	public static void main(String[] args) throws InstanceNotFoundException {
		String path = "/home/admin1/Desktop/ma/maruthi/sample.txt";
		String[] words;
		String line= "";
		String key;
		int result;
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
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

			result =bss.recSearch(words, key);
			if(result > 0)
				System.out.println("Key '"+ key+"' found at position "+result);
			else
				System.out.println("Key '"+key+"' not found...!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
