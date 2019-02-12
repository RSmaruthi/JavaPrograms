package testmaruthi;

import java.util.Scanner;

import utility.util;

public class primefactor {
	public static int r;
	
	
	public static void main(String[] args) {
		do {
			System.out.println("Enter the input 0-31...!");
			r= util.getPositiveInt();
		}while(r>0 && r>=31);
		 for(int i = 2; i< r; i++)
			      {
			         while(r%i == 0)
			         {
			            System.out.print(i+" ");
			            r= r/i;
			         }

			      }
			      if(r>2) {
			          System.out.print(r+" ");
			       }
				}

}
