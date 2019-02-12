package FunctionalPrograms;

import utility.util;

public class gambler
{
	

	
	public static void main(String[] args)
	{
		System.out.println("Enter initial stake...!");
		int stake = util.getPositiveInt();
		System.out.println("Enter your goal...!");
		int goal = util.getPositiveInt();
		System.out.println("Enter No. of times you want to play...!");
		int trials = util.getPositiveInt();
		util.playGame(stake, goal, trials);
	}

}


