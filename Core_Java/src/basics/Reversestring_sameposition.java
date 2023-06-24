package basics;

import java.util.Scanner;

public class Reversestring_sameposition {

	public void getdata(String input)
	{
		String out="";
		String[]word=input.split(" ");
		
		for(int i=0;i<=word.length-1;i++)
		{
			String data=word[i];
			char []c=data.toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				out=out+c[j];
			}
			out=out+" ";			
		}
		System.out.print(out);
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reversestring_sameposition ob=new Reversestring_sameposition();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any sentence you wish to reverse :-");
		String sentence=sc.nextLine();
		ob.getdata(sentence);
	}

}
