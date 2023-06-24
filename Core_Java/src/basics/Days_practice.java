package basics;

import java.util.Scanner;

public class Days_practice {
	
	public void getdata()
	{	
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any day :- ");
		String out=sc.next();
		
		if(out.equals("sunday"))
		{
			System.out.println(out+" is the 1st day of the week");
		}
		else if(out.equals("monday"))
		{
			System.out.println(out+" is the 2nd day of the week");
		}
		else if(out.equals("tuesday"))
		{
			System.out.println(out+" is the 3rd day of the week");
		}
		else if(out.equals("wednesday"))
		{
			System.out.println(out+" is the 4th day of the week");
		}
		else if(out.equals("thrusday"))
		{
			System.out.println(out+" is the 5th day of the week");
		}
		else if(out.equals("friday"))
		{
			System.out.println(out+" is the 6th day of the week");
		}
		else if(out.equals("saturday"))
		{
			System.out.println(out+" is the 7th day of the week");
		}
		else
		{
			System.out.println("Wrong choice");
		}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Days_practice ob=new Days_practice();
		ob.getdata();
		
	}

}
