package basics;

import java.util.Scanner;

public class Calander_month1 {
	
	public void getdata(String input) 
	{ 
		switch(input)
		{
		case "january":
		{
			System.out.println("Month has 31 days");
			break;
		}
		case "february":
		{
			{Scanner s=new Scanner(System.in);
			System.out.println("Please enter the year you wish to check days of :- ");	
			int a=s.nextInt();
			if(a%4==0)
			{
			System.out.println("Month has 29 days");break;
			}
			else
			{
				System.out.println("Month has 28 days");break;
			}
		}}
		case "march":
		{
			System.out.println("Month has 31 days");
			break;
		}
		case "april":
		{
			System.out.println("Month has 30 days");
			break;
		}
		case "may":
		{
			System.out.println("Month has 31 days");
			break;
		}
		case "june":
		{
			System.out.println("Month has 30 days");
			break;
		}
		case "july":
		{
			System.out.println("Month has 31 days");
			break;
		}
		case "august":
		{
			System.out.println("Month has 31 days");
			break;
		}
		case "september":
		{
			System.out.println("Month has 30 days");
			break;
		}
		case "october":
		{
			System.out.println("Month has 31 days");
			break;
		}
		case "november":
		{
			System.out.println("Month has 30 days");
			break;
		}
		case "december":
		{
			System.out.println("Month has 31 days");
			break;
		}
		}
		}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calander_month1 ob=new Calander_month1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any month");
		String month=sc.next();
		ob.getdata(month);
	
	
}
}
