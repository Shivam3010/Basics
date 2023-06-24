import java.util.Scanner;

public class new_reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		string out="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name :- ");
		String name=sc.next();
		char[]c=name.toCharArray();
		for(int i=c.length-1;i>=0,i--)
		{
			out=out+i[c];
		}
		System.out.println(out);
		
	}

}
