import java.util.Scanner;

class parent
{
	int number;
	
	void number()
	{
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println("number is:"+number);
	}
}

class pchild extends parent
{
	String name;
	
	
		void names()
		{
			Scanner bc=new Scanner(System.in);
		    name=bc.next();
		    System.out.println("enter name:");	
		    System.out.println("name is:"+name);
		}
}

class subchild extends pchild
{
	void display()
	{
		System.out.println("display all:");
		System.out.println("number:"+number);
		System.out.println("name:"+name);
	
}
}

public class multylevel {
	public static void main(String[] args) {
		
		subchild p=new subchild();
		p.number();
		p.names();
		p.display();
		
	}

		
	}


