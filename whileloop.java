import java.util.Scanner;

public class whileloop 
{
	public static void main(String[] args) 
	{
		int i,n;
		i=1;
		System.out.println("enter n:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}
