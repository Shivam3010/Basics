package basics;

import java.util.Scanner;

public class Array_Minimum {
	
	public void getdetails()
	{	
		int[]a=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 integar :- ");
		int min=0;
		for (int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(int j=0;j<=4;j++)
		{
		int z=a[j];
		if(z>0)
		{
			min=z;
		}
		System.out.println(z);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array_Minimum ob=new Array_Minimum();
		ob.getdetails();
		
	}

}
