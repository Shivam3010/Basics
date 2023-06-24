package basics;

import java.util.Scanner;

public class Array_occurance {

	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name :- ");
		String name=sc.next();
		Scanner y=new Scanner(System.in);
		System.out.println("Enter any alphabet you wish to search the occurance of :- ");
		char z=y.next().charAt(0);
		int k=0;
		char[]a=name.toCharArray();
		for(int i=0;i<=a.length-1;i++)
		{
			if (a[i]==z) 
			{
				k=k+1;
			}
		}
			System.out.println("Occurance of the alphabet is :- "+k);
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array_occurance ob=new Array_occurance();
		ob.getdata();
	}

}
