package FunctionalPrograms;

import utility.util;

public class array2D {

	public static void main(String[] args) 
	{
				System.out.println("Enter number of rows in (M)...! ");
			    int rows = util.getPositiveInt();
			    
			    System.out.println("Enter number of columns in (N)...!");
			    int cols = util.getPositiveInt();
			    
			    System.out.println("Enter" +(rows*cols)+" Two-D array elements");
			    int[][] IntArray = new int[rows][cols];
			    
			    
			    util.readArray(IntArray, rows, cols);
			    System.out.println("2-D Array elemnts are : ");
			    
			    
			    util.displayArray(IntArray,rows,cols);
		}
}
