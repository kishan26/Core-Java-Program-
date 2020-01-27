class employee
{
	private int id;
	private String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
public class Encapsulation {
public static void main(String[] args) {
	employee e=new employee();
	e.setId(1);
	e.setDept("management");
	System.out.println(e.getId());
	System.out.println(e.getDept());
}
}
