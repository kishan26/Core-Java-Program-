import java.util.Scanner;

class xyz
{
	
	String name;
	int number;

    xyz(int no,String names)
    {
    	name=names;
    	number=no;
    }
	
	void display()
	{
		System.out.println("singer number:"+number);
		System.out.println("singer name:"+name);
	}
}

public class cls {
	public static void main(String[] args) {
		int no;
		String names;
		Scanner sc=new Scanner(System.in);
		Scanner bm=new Scanner(System.in);
		System.out.println("enetr singer number:");
		
		no=sc.nextInt();
		System.out.println("enter name:");
		names=bm.nextLine();
		
		xyz b=new xyz(no,names);
		
		b.display();
	}

}
