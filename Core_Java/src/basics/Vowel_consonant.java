package basics;

import java.util.Scanner;

public class Vowel_consonant {
	
	
	public void get_details(char input)
	{
		if(input=='a'|input=='e'|input=='i'|input=='o'|input=='u')
		{
			System.out.println(input+" Alphabet is vowel");
		}
		else
		{
			System.out.print(input+" Alphabet is consonant");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vowel_consonant ob=new Vowel_consonant();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any alphabet :- ");
		char input=sc.next().charAt(0);
		ob.get_details(input);
	}

}
