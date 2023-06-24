package basics;

import java.util.Scanner;

public class Array_Primenumber {
	
	
	public void getdata()
	{	
		int[]a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter any 5 numbers :- ");
		for(int j=0;j<=4;j++)
		{
			a[j]=sc.nextInt();
		}
		for(int i=0;i<=4;i++)
		
		if (a[i]==0|a[i]==1)
		{
			System.out.println(a[i] +" is not a prime number");
		}
		else 
		{
			int f=0;
			for(int k=2;k<a[i];k++)
			{	 
			
				if(a[i]%k==0)
				{	
					f=1;
					System.out.println(a[i]+" is not a prime number");
					break;
				}
			}
			if(f==0)
			{
				System.out.println(a[i]+" is a prime number");
			}
		}
}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array_Primenumber ob=new Array_Primenumber();
		ob.getdata();
	}

}
