package FunctionalPrograms;

import utility.util;

public class coupannumber
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int coupons = 0;
	       System.out.println("Enter no. of distinct coupon needed...!");
	       coupons = util.getPositiveInt();
	       
	       
	       int totalRandoms = util.distCoupon(coupons);
	       System.out.println("totalRandoms = "+totalRandoms);
	}

}
