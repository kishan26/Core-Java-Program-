
import java.util.Scanner;

class sing
{
	
	String name;
	int number;
	
	Scanner sc=new Scanner(System.in);
	Scanner bm=new Scanner(System.in);
	
   void singer()
   {
		System.out.println("enetr singer number:");
		
		number=sc.nextInt();
		System.out.println("enter name:");
		name=bm.nextLine();  
   }
	
	void display()
	{
		System.out.println("singer number:"+number);
		System.out.println("singer name:"+name);
	}
}

public class classes {
	public static void main(String[] args) {
		
		
		sing b=new sing();
		b.singer();
		b.display();
	}

}

