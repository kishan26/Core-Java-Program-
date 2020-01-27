
public class constructor {
	
	int x;
	int d;
	int f;
	
	
	public constructor()
	{
	 x=50;
	 System.out.println(x);
	}
	
	public constructor(int p,int q)
	{
		d=p;
		f=q;
	
	}

	
	public static void main(String[] args)
	{
		constructor dd=new constructor(50,30);
		constructor gg=new constructor();
	  
		
		
	System.out.println(gg.x);
	System.out.println(dd.d+"  "+dd.f);
	}


}
