package objectIntro.animals;

public class dog {
//fields
	private String breed;
	private String name;
	private String gender;
	private int age;
	
	//constructors
	public dog (String b, String n, String g, int a) {
		this.breed = b;
		this.name = n;
		this.gender = g;
		this.age = a;
	}
	//getters
	public String toString() {
		return "  " + this.breed +", " + this.name + ", " + this.gender + ", "  + " ";
	}
	public int getAge() {
		return this.age;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public String getName() {
		return this.name;
	}
	public String getGender() {
		return this.gender;
	}
	
	
	public String bark( ) {
		return "woof woof";
	}
	
	public String fancyBark(String s) {
		return s + " " + s + "  ";
	}
	//setters
	
	public void setAge(int a) {
		this.age+= this.age + a;//increases by any num
	}
	
	public void birthday() {
		this.age++; //increases by one
	}
	
	public void setGender() {
		this.gender = "fixed";
	}
	
	
	
}
