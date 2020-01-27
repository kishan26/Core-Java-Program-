import java.util.Scanner;

class perents
{
 String name;
 void names()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter any name:");
	 name=sc.nextLine();
	 System.out.println("name is:"+name);
 }
}

class child extends perents
{
	int number;
	void display()
	{
		Scanner bc=new Scanner(System.in);
		System.out.println("enter number");
		number=bc.nextInt();
		System.out.println("number is:"+number);
		
	}
}

public class singleinherit {
	public static void main(String[] args) {
child b=new child();
b.names();
b.display();
	}

}
