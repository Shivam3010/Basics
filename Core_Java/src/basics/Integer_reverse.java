package basics;

import java.util.Scanner;

public class Integer_reverse {

	public void getdata()
	{	
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :- ");
		int a=sc.nextInt();
		for(;a>0;)
		{
			i=a%10;
			a=a/10;
			System.out.print(i);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer_reverse ob=new Integer_reverse();
		ob.getdata();
	}

}
