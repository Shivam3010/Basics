package basics;

import java.util.Scanner;

public class Looping {
	
	public void getdata(int input)
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println(input+" * "+i+" = "+ i*input);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Looping ob=new Looping ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input you wish the table of");
		int out=sc.nextInt();
		ob.getdata(out);
	}

}
