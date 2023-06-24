package basics;

import java.util.Scanner;

public class String_Loop {
	
	public void getdata(String a) 
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(a+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_Loop ob=new String_Loop();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any name");
		String out=sc.next();
		ob.getdata(out);
		
		
	}

}
