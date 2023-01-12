package wizardcube;

public class Wizards {

	private String name;
	private String house;
	private int year;
	private String job;
	private String pet;
	private int bloodStatus;
	
	
	
	public Wizards(String n, int blood) {
		this.house = sortingHat();
		this.job = "student";
		this.name = n;
		this.bloodStatus = blood;
	}
	
	private String sortingHat() {
		String[] houses = {"G","R","S","H"};
		int r = (int)Math.random()+3;
		this.setYear(1);
		return houses[r];
	}
	public void setYear(int y) {
		this.year = y;
	}
	
	public void setPet(String p) {
		this.pet = p;
	}
	
	public String toString() {
		return this.name + ", " + this.house;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
