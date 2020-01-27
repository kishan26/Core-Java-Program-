import java.util.Scanner;

class display
{
	int areasq,arearec;
	
	void squre(int a)
	{
	
		areasq=a*a;
		System.out.println("squre is:"+areasq);
	}
	
	void rectangle(int hight,int breadth)
	{
		
		
		arearec=hight*breadth;
		System.out.println("rectangle is:"+arearec);
	}
	
}


public class asignment37 {
	public static void main(String[] args) {
		display mj=new display();
		mj.rectangle(5,5);
        mj.squre(5);
		
	}
	

}
