import java.util.Scanner;

public class steatments
{
	public int n; //instance variable:
	public static Scanner sc;
	
	public char stest()
	{
		sc = new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		return 0;
		
	}
	public static void main(String[] args)
	{

	}
}
