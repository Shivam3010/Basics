package basics;

import java.util.Scanner;

public class Reverse_string {
	
	public void getdetails ()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any name you wish to reverse :- ");
		String input=sc.next();
		String out="";
		char a[]=input.toCharArray();
		for(int i=a.length-1;i>=0;i--)
				{
					out=out+a[i];
				}
		if(out.equals(input))
		{
			System.out.println("Word is palindrome");
		}
		else
		{
			System.out.println("Word is not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse_string ob=new Reverse_string();
		ob.getdetails();
		
	}

}
