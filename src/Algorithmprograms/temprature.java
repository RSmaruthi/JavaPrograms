package Algorithmprograms;

import java.text.DecimalFormat;

import utility.util;

public class temprature 
{
	public static void main(String [] args)
	{
		int type;
		double temperature;
		do
		{
			System.out.println("Enter your temperature type");
			System.out.println("1 for Fahrenheit");
			System.out.println("2 for Celsius");
			type = util.getPositiveInt();
		}while(type > 2 || type < 1);
	
		System.out.println("Enter the temperature...!");
		temperature = util.scanner.nextDouble();
		temperature = util.temperaturConversion(temperature, type);
	
		DecimalFormat df = new DecimalFormat(".##");
	
		if(type == 1)
			System.out.println("Temperature in Celsius = "+df.format(temperature));
		else
			System.out.println("Temperature in Fahrenheit = "+df.format(temperature));
	}

}
