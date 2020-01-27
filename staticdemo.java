class band
{

	static int number=70;
	
	 static int bang()  //static method:
	{
		return number;
	}
	
  static  //static block:
  {
	System.out.println("wellcome:");  
  }
  
  public band()
  {
	  number++;
  }
  
}


public class staticdemo {
public static void main(String[] args) {
	band c=new band();
    System.out.println("total number:"+band.bang());//static calling=> class.method();
}
}


//note
// constructer calling is => constructername(); <==defaulat:
//                           constructername(int,int) <== peramiterize constructer: