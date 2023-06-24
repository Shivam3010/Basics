package basics;

import java.util.Scanner;

public class Array_addition2 {
	
	
	public void getdata()
	{
		int sum=0;
		int[]a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 numbers you wish to sum :- ");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int j=0;j<=4;j++)
		{
			sum=sum+a[j];
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array_addition2 ob=new Array_addition2();
		ob.getdata();
	}

}
