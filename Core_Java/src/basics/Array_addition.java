package basics;

import java.util.Scanner;

public class Array_addition {
	
	public void getdata()
	{
		int a[]=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 numeric arrays :- ");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<=4;j++)
		{
			if(a[j]<=10)
			{
				System.out.println(a[j]+" Number is less than 10");
			}
			else if(a[j]>10&& a[j]<=50)
			{
				System.out.println(a[j]+" Number belongs between 10 to 50");
			}
			else
			{
				System.out.println(a[j]+" Number is greater than 50");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array_addition ob=new Array_addition();
		ob.getdata();
	}

}
