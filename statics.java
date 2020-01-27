public class statics
{
	static int p=23;
	
public static void x()
{
System.out.println("bhanderi");
System.out.println(p);
}

public static void y()
{
	System.out.println("kishan");
	System.out.println(p);
	//System.out.println(p);
}
static
{
	System.out.println("in static block");
}
public void p1()
{
	System.out.println("kishan");
}

public static void main(String[] args)
{  
  statics.x();	
  statics.y();
}

	
}
