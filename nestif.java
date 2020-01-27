import java.util.Scanner;

public class nestif 
{

	
	public static void main(String[] args) 
    {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value of a:");
		a=sc.nextInt();
		System.out.print("enter value of b:");
		b=sc.nextInt();
		System.out.print("enter value of c:");
		c=sc.nextInt();
        System.out.println("nested if steatment:");
        
        
        if(a>b)
        {
        	if(a>c)
        	{
        		System.out.println("a is max:");
        	}
        	else
        	{
        		System.out.println("c is max:");
        	}
        }
        else
        {
        	if(b>c)
        	{
        		System.out.println("b is max:");
        	}
        	else
        	{
        		System.out.println("c is max:");
        	}
        }
    
   
    }
}
