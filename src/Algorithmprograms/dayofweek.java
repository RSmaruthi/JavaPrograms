package Algorithmprograms;

import utility.util;

public class dayofweek 
{
	public static void main(String[] args) 
	{	
		if(args.length == 0 || args.length < 3) 
		{
			System.out.println("Provide Month, Day, year as command-line arguments...!");
			return;
		}
		
		int month;
		int day;
		int year;
		int weekDay;
		
		month = Integer.parseInt(args[0]);
		day = Integer.parseInt(args[1]);
		year = Integer.parseInt(args[2]);
		weekDay = util.dayOfWeek(month, day, year);
		System.out.println("Given Date : "+month+":"+day+":"+year);
		System.out.println("Day of the given date : " + weekDay);
		switch(+weekDay)
		{
		case 0:System.out.println("Sunday");break;
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thrusday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		}
	}	
}

	
