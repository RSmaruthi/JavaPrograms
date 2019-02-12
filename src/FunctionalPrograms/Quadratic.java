package FunctionalPrograms;

import utility.util;

public class Quadratic
{
	public static void main(String[] args)
		{
			System.out.println("Enter 3 inputs for 'a' , 'b', and 'c'...!" );
			double a = util.getDouble();
			double b = util.getDouble();
			double c = util.getDouble();
			
			System.out.println("Roots of "+a+"x*x + "+b+"x +"+c);
			double[] roots = util.quadraticRoots(a, b, c);
			if(roots != null)
			{
				for(double root : roots)
				{
					System.out.println(root);
				}
			}
		}
}