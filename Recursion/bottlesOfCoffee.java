package inClass;

public class bottlesOfCoffee {
	public static void coffeeCount(int count) {
		if (count == 0) {
			System.out.println("I guess im never sleeping again");
		} else {
			System.out.println(count + " bottles of coffee on the wall. \n");
			System.out.println(count + " bottles of coffee on the wall,");
			System.out.println(count + " bottles of coffee,");
			System.out.println("Take one down, pass it around,");
			coffeeCount(count-1);
			
		}
	}
	public static void main(String[]args) {
		coffeeCount(99);
	}

}
