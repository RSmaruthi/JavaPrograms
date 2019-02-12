package FunctionalPrograms;

import utility.util;

public class windchil
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try
		{
			double t = Double.parseDouble(args[0]);//temperature
			
			double v = Double.parseDouble(args[1]);//wind speed

			double windchill = util.getwindchill(t, v);
			
			System.out.printf("wind chill = %.2f",windchill);
		}
		
		
		catch(Exception e)
		{
			System.out.println("\nProvide temp value(1-50) and wind speed value (3-120)...!");
		}
	}

}


