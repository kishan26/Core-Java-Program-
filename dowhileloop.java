import java.util.Scanner;

public class dowhileloop
{
public static void main(String[] args) 
{
int sum=0,i=0,n;

Scanner sc=new Scanner(System.in);
System.out.println("enter any number:");
n=sc.nextInt();
do
{
	sum=sum+i;
i++;	
}while(i<=n);

System.out.println(sum);	

}	

}
