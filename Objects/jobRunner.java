package jobs;

//import objectIntro.animals.dog;

public class jobRunner {

	public static void main(String[] args) {
		Jobs Bob = new Jobs("Bob","dishwasher",12.99,true);
		Jobs Bob2 = new Jobs("Bob2","dishwasher",12.99,true);
		Jobs Bob3 = new Jobs("Bob3","dishwasher",12.99,true);
		Jobs Bob4 = new Jobs("Bob4","dishwasher",12.99,true);
		Jobs Bob5 = new Jobs("Bob5","dishwasher",12.99,true);
		Jobs Bob6 = new Jobs("Bob6","dishwasher",12.99,true);
		
		Bob6.getPromoted("Chief Dishwasher",14.99);
		Bob5.getFired();
		Bob3.getFired();
		Bob.getPromoted("Union Leader",29.17);
		Bob4.increaseSalary(.33);
		System.out.println(Bob);
		System.out.println(Bob2);
		System.out.println(Bob3);
		System.out.println(Bob4);
		System.out.println(Bob5);
		System.out.println(Bob6);
		
		

	}

}
