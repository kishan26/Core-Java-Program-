class ractangle
{
	int areas,perimeters;
	
	 ractangle(int length,int breadth)
	{
		areas=length*breadth;
		System.out.println("area is:"+areas);
	
		perimeters=2*(length+breadth);
		System.out.println("perimeter is:"+perimeters);
	}
}

class sqr extends ractangle 
{

	sqr(int length)
	{
	
	    super(12,10);
		areas=length*length;
		System.out.println("area is:"+areas);
		perimeters=4*length;
		System.out.println("perimeter is:"+perimeters);
		
	 
	}

}


public class assignment40 {
	public static void main(String[] args) {
		sqr sc=new sqr(5);
		//sqr bc=new sqr(5);
		
	}

}
