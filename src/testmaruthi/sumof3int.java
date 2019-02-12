package testmaruthi;

import java.util.Scanner;

public class sumof3int {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int i,j,k,sum=0,n;
				System.out.println("Enter a the size of array");
				Scanner sc = new Scanner(System.in);
			    n= sc.nextInt();
			    int [] a=new int[n];
			    System.out.println("Enter the array element"); 
			    for(i=0;i<n;i++)
			    a[i]=sc.nextInt();
				System.out.println("the sum of3 int is 0" );
						for(i=0;i<n;i++)
				{
					for(j=i+1;j<n;j++)
					{
						for(k=j+1;k<n;k++)
					{
						sum=a[i]+a[j]+a[k];
						if(sum==0)
						{
							System.out.println(a[i]+"+" +a[j]+"+"+a[k]+"="+"0");
						}
					}
						
					}
				}

	}

}
