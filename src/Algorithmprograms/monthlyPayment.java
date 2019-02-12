package Algorithmprograms;

import utility.util;

public class monthlyPayment {

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("Provide Prinicipal amouint(P),Year(Y) and interest rate (R) "
					+ "as command-line arguments...!");
			return;
		}
		Double p;
		Double y;
		Double r;
		Double payment;

		p = Double.parseDouble(args[0]);
		y = Double.parseDouble(args[1]);
		r = Double.parseDouble(args[2]);
		payment = util.monthlyPayment(p, y, r);
		System.out.println("Given Data : p = "+p+"\ty = "+y+"\t r ="+r);
		System.out.printf("Monthly Payment : %.2f", payment);
	}

}