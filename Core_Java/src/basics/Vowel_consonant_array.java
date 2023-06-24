package basics;

import java.util.Scanner;

public class Vowel_consonant_array {
	
	public void getdata()
	{
		char a[]=new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 alphabets :- ");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		for(int j=0;j<=4;j++)
		{
			if(a[j]=='a'| a[j]=='e'| a[j]=='i'| a[j]=='o'|a[j]=='u')
			{
				System.out.println(a[j]+" alphabet is vowel");
			}
			else
			{
				System.out.println(a[j]+ " alphabet is consonant");
				
			}
		}
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vowel_consonant_array ob=new Vowel_consonant_array();
		ob.getdata();
	}

}
