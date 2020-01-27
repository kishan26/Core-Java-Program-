package practice3;
import practice3.kishan;
abstract class perent
{
	abstract void messege();
	public perent()
	{
		System.out.println("in deafault const.. parent class");
	}
	
}

class subclass1 extends perent
{
	public subclass1()
	{
		super();
		System.out.println("parents:");
	}
	void messege()
    {
		System.out.println("this is first subclass");
    }
	
}

class subclass2 extends perent
{
	void messege()
	{
		System.out.println("this is second subclass:");
	}
}

public class abstractdemo {
	public static void main(String[] args) {
		subclass1 sc=new subclass1();
		sc.messege();
		subclass2 bb=new subclass2();
		bb.messege();
		subclass1 gg=new subclass1();
		
	}

}
