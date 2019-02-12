package testmaruthi;

import java.util.Scanner;

import utility.util;

class Utility
{
    static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}
    public class ma
    {
        public static void main(String[] args)
        {
            System.out.println("Enter your mobile number");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            while(Utility.numberOrNot(input) || (input.length() == 10))
            {
            	System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
            	input = sc.next();
            }
                       	 System.out.println("Good!!! You have entered valid mobile number");
            
        }
    }