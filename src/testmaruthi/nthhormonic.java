package testmaruthi;

import java.util.Scanner;

public class nthhormonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int i,n;
				float sum = 0;
				System.out.println("enter the nth hormonic number");
				Scanner sc = new Scanner(System.in); 
				n=sc.nextInt();
				for(i=1;i<=n;i++)
				{
						sum=sum+(float)1/i;
				}
				System.out.println("nth hormonic sum:"+sum);

	}

}
