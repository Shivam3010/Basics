package basics;

import java.util.Scanner;

public class LIFO_practice {
	
	public void getdata()
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 arrays");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=4;j>=0;j--)
		{
			System.out.println(a[j]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LIFO_practice ob=new LIFO_practice();
		ob.getdata();
		

	}

}
