import java.util.Scanner;

public class assigment31 {
	
public static void main(String[] args) {
	int a,b,c;
	int sum;
	System.out.println("enter the numbers:");
	System.out.println("enter value of a:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("enter value of b:");
	b=sc.nextInt();
	System.out.println("enter value of c:");
	c=sc.nextInt();
	
	sum=a+b;
	System.out.println("sum="+sum);
	if(sum==c)
	{
		System.out.println("c and sum is equel");
	}else
	{
		System.out.println("sum and c is not equel");
	}
}	
	
}
