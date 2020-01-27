import java.util.Scanner;

public class scanner {


	public static void main(String[] args) 
	{
		int a;
		
	  Scanner sc = new Scanner(System.in);
		
		System.out.print("enter numbers:");
		a=sc.nextInt();
		System.out.println("number is:"+a);
		String b;
		System.out.println("enter second string:");
		b=sc.next();
		System.out.println("entering string is:"+b+a);
		
		//sc.close();
		
				
	}

}
