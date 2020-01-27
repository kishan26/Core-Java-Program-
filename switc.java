import java.util.Scanner;

public class switc {
	public static void main(String[] args)
	{
		
	int choice;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter choice: between 1 t0 7");
	choice=sc.nextInt();
	
	switch(choice)
	{
	  case 1:
	  {
		System.out.println("sunday");
	  }
	  break;
	  case 2:
	  {
		  System.out.println("monday");
	  }
	  break;
	  case 3:
	  {
		  System.out.println("tuseday");
	  }
	  break;
	  case 4:
	  {
		  System.out.println("wednesday");
	  }
	  break;
	  case 5:
	  {
		  System.out.println("thursday");
	  }
	  break;
	  case 6:
	  {
		  System.out.println("friday");
	  }
	  break;
	  case 7:
	  {
		  System.out.println("saturday");
	  }
	  break;
	  default:
	  {
		  System.out.println("number is wrong:");
	  }
	}
   	
	}

}
