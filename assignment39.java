import java.util.Scanner;

class member
{
	
	String name,address;
	int age,ph_number,salary=600;
	void printsalary()
	{
		System.out.println("salary is:"+salary);
	}
}

class emp extends member 
{
	
    String specialize,department;
     Scanner sc=new Scanner(System.in);
     void print()
     {
    	 System.out.println("enter specialize:");
    	 specialize=sc.next();
    	 System.out.println("specialize is:"+specialize);
    	 System.out.println("enter department:");
    	 department=sc.next();
    	 System.out.println("department is:"+department);
     }
    
   
}

class manager extends member
{
	Scanner bc=new Scanner(System.in);
	String department,specialize;
	
	void prints()
    {
   	 System.out.println("enter specialize:");
   	 specialize=bc.next();
   	 System.out.println("specialize is:"+specialize);
   	 System.out.println("enter department:");
   	 department=bc.next();
   	 System.out.println("department is:"+department);
    }	
}

public class assignment39 {
public static void main(String[] args) {
	emp s=new emp();
	manager p=new manager();
	s.printsalary();
	s.print();
	p.prints();
	
	manager b=new manager();
	
	}
}
