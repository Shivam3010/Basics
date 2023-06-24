package basics;

import java.util.Scanner;

public class Marksheet_Project {
	
	public void get_details()
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Student name :- ");
	String name=sc.next();
	
	System.out.print("Enter student's father name :- ");
	String fname=sc.next();
	
	System.out.print("Collage name:- ");
	String collage=sc.next();
	
	System.out.print("Enter roll number:- ");
	int rollno=sc.nextInt();
	
	System.out.print("Enter Hindi marks - ");
	float marks1=sc.nextFloat();
	
	System.out.print("Enter English marks - ");
	float marks2=sc.nextFloat();
	
	System.out.print("Enter Maths marks - ");
	float marks3=sc.nextFloat();
	
	System.out.print("Enter Science marks - ");
	float marks4=sc.nextFloat();
	
	System.out.print("Enter Computer marks - ");
	float marks5=sc.nextFloat();
	
	float out=(marks1+marks2+marks3+marks4+marks5);
	float percent=(out*100)/500;
	
	System.out.println("*************MARKSHEET**************");
	System.out.println("Student name is -"+name);
	System.out.println("Student's father name is -"+fname);
	System.out.println("Collage name is -"+collage);
	System.out.println("Students roll number is -"+rollno);
	System.out.println("*********MARKS**********");
	System.out.println("hindi -"+marks1);
	System.out.println("English -"+marks2);
	System.out.println("Maths -"+marks3);
	System.out.println("Science -"+marks4);
	System.out.println("Computer -"+marks5);
	System.out.println("Total percentage is %"+percent);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marksheet_Project ob=new Marksheet_Project();
		ob.get_details();
				
		
	}

}
