package testmaruthi;

import java.util.Scanner;
import java.util.*;

public class leaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		System.out.println("enter the year");
		Scanner sc =new Scanner(System.in);
		year=sc.nextInt();
		int b=Integer.toString(year).length();

		if(b>=4)
		{
		boolean leap = false;
        if(year % 4 == 0)
        	{
        	if( year % 100 == 0)
        		{
        		if ( year % 400 == 0)
			       leap = true;
			    else
			       leap = false;
			    }
			else
			    leap = true;
			}
        else
        	leap = false;
        if(leap)
            System.out.println(year + " is a leap year.");
        else
        	System.out.println(year + " is not a leap year.");
		}
		else
		System.out.println("plz enter the correct year");
		}
}

