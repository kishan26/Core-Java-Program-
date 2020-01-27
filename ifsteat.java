import java.util.Scanner;

public class ifsteat {
	public static void main(String[] args) 
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		number=sc.nextInt();
		
		if (number%2==0)
		{
		System.out.println("even");	
		} 
		else
		{
         System.out.println("odd");
		}
	}

}
