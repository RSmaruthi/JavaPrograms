package testmaruthi;

import java.util.Scanner;

import utility.util;
public class power2 {
	static String  num;
	public static int checknumber(String input)
    {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number=");
	      num= sc.next();
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
        	System.out.println("plz enter the integer number");
            return checknumber(num);
        }
        int res = Integer.parseInt(num);	
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int i,sum=1;
			      
			      int ch=checknumber(num);
			  	int result = Integer.parseInt(num);			
			  	System.out.println(result);
			      if(ch==0)
			    	  {
			           if(result<31)
			      {	
			    	  for(i=1;i<=result;i++)
			      {
			    	  sum=sum*2;
			      }
			      System.out.println("2^"+num+"="+sum);		    	  
			      }		    	 
			    	  }		      
			  else
			      System.out.println("Enter a  valid number=");     
	}

}
