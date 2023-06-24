package basics;

import java.util.Scanner;

public class Calculatordemo {
	
	public int addition(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int subtraction(int a, int b)
	{
		int c=a-b;
		return c;
	}
	
	public int multiplication(int a, int b)
	{
		int c=a*b;
		return c;
	}
	
	public int division(int a, int b)
	{
		int c=a/b;
		return c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculatordemo ob=new Calculatordemo();
		Scanner sc=new Scanner (System.in);
		System.out.println("Please anter two digits :- ");
		int firstvalue=sc.nextInt();
		int secondvalue=sc.nextInt();
		int output = ob.division(firstvalue, secondvalue);
		System.out.println(output);
	
	}

}
