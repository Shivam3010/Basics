package basics;

import java.util.Scanner;

public class Calculator_switch {
	
	public int getdata(int input,int a, int b)
	{
		
    switch (input)
    {
		case 1:
	{
		int c=a+b;
		return c;
	}
	case 2:
	{
		int c=a-b;
		return c;
	}
	case 3:
	{
		int c=a*b;
		return c;
	}
	case 4:
	{
		int c=a/b;
		return c;
	}
    
    }
	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator_switch ob=new Calculator_switch();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1 to add, 2 to subtract, 3 to multiply and 4 to divide :- ");
		int calc=sc.nextInt();
		System.out.print("Enter two numbers you wish to calculate on:- " );
		int first=sc.nextInt();
		int second=sc.nextInt();
		int out1=ob.getdata(calc, first, second);
		System.out.println("Answer is" +out1);
	}

}
