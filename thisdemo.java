class wrong
{
	void ab()
	{
		System.out.println("ktm ktm");
	}
	
	void sings()
	{
	  System.out.println("kishan");
	}
}

class right extends wrong
{
	void db()
	{
		super.ab();
		super.sings();
	}
}

public class thisdemo 
{
	public static void main(String[] args) 
	{
		right p=new right();
		p.db();
	}
}