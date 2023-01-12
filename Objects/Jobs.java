package jobs;

public class Jobs {

	//names, position, salery, isCurrent
	private String name;
	private String position;
	private double salary;
	private boolean isCurrent;
	
	
	public Jobs (String n, String p, double s, boolean is) {
		this.name = n;
		this.position = p;
		this.salary = s;
		this.isCurrent = is;
	}
	
	public void getPromoted(String promo, double sal) {
		this.position = promo;
		this.salary = sal;
	}
	
	public void getFired() {
		this.position = "unemployed";
		this.salary = 0;
		this.isCurrent = false;
	
	}
	
	public void increaseSalary(double sal) {
		this.salary += sal;
	}
	
	
	public String toString() {
		return this.name + " is a " + this.position + " and is paid " + this.salary + " per hour";
	}
	//get promoted, new job title/pay increase
	
	//getfired, no title, no salery
	
	//more money
	
	
	
	
	
}
