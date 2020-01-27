interface bank
{
	void acholders();
	void balinfo();
}

interface employee1
{
	void details();
}

class sbi implements bank,employee1
{
	void baba()
	{
		System.out.println("kishan");
	}

	@Override
	public void acholders() {
		System.out.println("total ac holders are 1234567");
	}

	@Override
	public void balinfo() {
		System.out.println("balace is rs. 2345678987654");
	}

	@Override
	public void details() {
		System.out.println("total 123456 employee");
	}
	
}
class canara extends sbi implements bank 
{

	@Override
	public void acholders() {
System.out.println("4567890");		
	}

	@Override
	public void balinfo() {
System.out.println("2345678");		
	}
	
}
public class interfaceDemo {
public static void main(String[] args) {
	sbi s=new sbi();
	s.acholders();
	s.balinfo();
	s.details();
	s.baba();
	
	canara p=new canara();
	p.acholders();
	p.balinfo();
	p.details();
}
}
