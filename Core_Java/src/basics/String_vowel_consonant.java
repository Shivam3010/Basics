package basics;

import java.util.Scanner;

public class String_vowel_consonant {
	
	public void getdata() 
	{	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any name :- ");
		String name=sc.next();
		char[]a=name.toCharArray();
		for (int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
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
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String_vowel_consonant ob=new String_vowel_consonant();
		ob.getdata();

	}

}
