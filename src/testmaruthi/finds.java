package testmaruthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class finds 
{
	public static int binarySearch(String[] a, String x) 
	{
	    int low = 0;
	    int high = a.length - 1;
	    int mid;

	    while (low <= high) {
	        mid = (low + high) / 2;

	        if (a[mid].compareTo(x) < 0) {
	            low = mid + 1;
	        } else if (a[mid].compareTo(x) > 0) {
	            high = mid - 1;
	        } else {
	            return mid;
	        }
	    }

	    return -1;
	}

	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
/*
	    FileReader file = new FileReader("/home/admin1/Desktop/ma/maruthi/sample.txt");*/
	    String filename = new String("/home/admin1/Desktop/ma/maruthi/sample.txt");
	    String[] numArray;
	    try (Scanner in = new Scanner(new File(filename))) {
	        int count = in.nextInt();

	        numArray = new String[count];

	        for (int i = 0; in.hasNextInt() && count != -1 && i < count; i++) {
	            numArray[i] = in.nextLine();
	        }

	        for (int i = 0; i < count; i++) //printing all the elements
	        {
	            System.out.println(numArray[i]);
	        }

	        String searchItem = "The";

	        System.out.println("The position of the String is:");
	        binarySearch(numArray, searchItem);

	    } catch (final FileNotFoundException e) {
	        System.out.println("That file was not found. Program terminating...");
	        e.printStackTrace();

	    }

	}

}
