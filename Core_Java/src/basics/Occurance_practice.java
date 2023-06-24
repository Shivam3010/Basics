package basics;

import java.util.Scanner;

public class Occurance_practice {
	
	public void getdata(String input)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name :- ");
		String name=sc.next();
		System.out.println("Enter any alphabet you wish to search occurance of :-");
		String z=sc.next();
		
		int totalcount=name.length();
		int totalcountwithoutchar =name.replace(z,"").length();
		int count= totalcount-totalcountwithoutchar;
		System.out.println(count);
		}
		
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Occurance_practice ob=new Occurance_practice();
		ob.getdata(null);
	}

}
