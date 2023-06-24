package basics;

import java.util.Scanner;

public class Vishalmegamart {
	
	public void get_details()
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter name :-");
	String name=sc.next();
	
	System.out.print("Enter mobile number :-");
	long mob=sc.nextLong();
	
	System.out.print("Enter product name :-");
	String prod=sc.next();
	
	System.out.print("Enter product price :-");
	int price=sc.nextInt();
	
	System.out.println("**********VISHAL MEGA MART***********");
	System.out.println("Customer name :- "+name);
	System.out.println("Customer's mobile number :- "+mob);
	System.out.println("Purchased product :- "+prod);
	System.out.println("Product price :- "+price);
	if(price<=1000)
	{	
		int gst1=(price*5)/100;
		int price1=price+gst1;
		System.out.print("Total price including 5% GST is "+ price1);
	}
	else if(price>1000 && price<=2000)
	{	
		int gst2=(price*10)/100;
		int price2=price+gst2;
		System.out.println("Total price including 10% GST is "+ price2);
	}
	else
	{	int gst3=(price*18)/100;
		int price3=price+gst3;
		System.out.println("Total price including 18% GST is "+ price3);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vishalmegamart ob=new Vishalmegamart();
		ob.get_details();
	
		
	}

}
