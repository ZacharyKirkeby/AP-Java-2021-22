package objectIntro.animals;

public class runner {

	public static void main(String[] args) {
		dog Clifford = new dog("Labrador","Clifford","Male",5); 
		System.out.println(Clifford);
		System.out.println(Clifford.getAge());	
		System.out.println(Clifford.getBreed());
		Clifford.birthday();
		System.out.println(Clifford.getAge());
		System.out.println(Clifford.bark());
		System.out.println(Clifford.fancyBark("HELLO")); 
		Clifford.setGender();
		Clifford.getGender();
		

	}

}
