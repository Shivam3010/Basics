import java.util.Scanner;

public class Reverse_string_new {
	
	
	public void getdata()
	{
		String out=""
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any name");
		String s=sc.next();
		char[]i=s.toCharArray();
		for(i=i.length-1; i<=0;i--)
      	{
      		out=out+j;
      	}
		System.out.println(out);
		
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_string_new ob=new Reverse_string_new();
		ob.getdata();
		

	}

}
