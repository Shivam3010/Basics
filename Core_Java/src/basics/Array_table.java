package basics;

import java.util.Scanner;

public class Array_table {

	public void getdata()
	{
		int[]a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 digits you wish the table of :- ");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for (int k=0;k<=4;k++) 
		{
			
		for(int j=1;j<=10;j++)
		{
			int z=a[k]*j;
			System.out.println(a[k]+"*"+j+"="+z);
		}
		System.out.println("*************************");
		}

	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_table ob=new Array_table();
		ob.getdata();

	}

}
