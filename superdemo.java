class Vehical
{
	int speed = 100;
	void ad()
	{
		System.out.println("bhanderi");
	}
	
	void km()
	{
		this.ad();//method calling using this
		System.out.println("kishan");
	}
}

class Bike extends Vehical
{
	int speed = 150;
	void display() 
	{
		super.km(); //super method:
		System.out.println("Vehical's Speed:" + super.speed);// super with variable:
		System.out.println("Bike speed" + speed);
	}
}

public class superdemo 
{
	public static void main(String[] args) 
	{
		Bike m = new Bike();
		m.display();
	}
}
