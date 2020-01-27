class bag
{
	
 public int number;
 public String name;
 


public void bags()
 {
	 number=50;
	 name="fastrack";
	 System.out.println(number);
	 System.out.println(name);
 }
 
 public void bags(int nums,String names)
 {
	System.out.println("nums is"+nums);
	System.out.println("names is"+names);
 }
 
}


public class methodoverloading {
	public static void main(String[] args) {
		
		bag c=new bag();
		c.bags();
		c.bags(12,"kishan");
		
		
	}
}
