package basics;

import java.util.Scanner;

public class Array_secondmax {
	
	
	public void getdata()
	{
	int[]c=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 5 integar:- ");
	for (int i=0;i<=4;i++)
	{
		c[i]=sc.nextInt();
	}
	int max =0;
	int secondmax=0;
	for(int k=0;k<=4;k++)
	{
		if(c[k]>max)
		{
			secondmax=max;
			max=c[k];
		}
		else if(secondmax>c[k])
		{
			secondmax=c[k];
		}
	}
	System.out.println("second max number is "+secondmax);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array_secondmax ob=new Array_secondmax();
		ob.getdata();
	}

}
