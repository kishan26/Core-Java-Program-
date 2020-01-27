import java.util.Scanner;

public class assignmentarray {
	public static void main(String[] args) {
		int a[]=new int[5],i,dd;
		for(i=0;i<=4;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter ayyay a[i]:");
			a[i]=sc.nextInt();
		}
	dd=a[0];	
	
	for(i=0;i<=4;i++)
	{
		if(a[i]>dd)
		{
			dd=a[i];
		}	
	}
	System.out.println("max value is:"+dd);
	
	for(i=0;i<=4;i++)
	{
		if(a[i]<dd)
		{
			dd=a[i];
		}	
	}
	System.out.println("min value is:"+dd);
		
		
	}

}
