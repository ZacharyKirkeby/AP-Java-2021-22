package inClass;

public class RecursionFun {
	
	public static void countdown(int num) {
		if (num <=0) {
			System.out.println("Done");
		} else {
			System.out.println(num);
			countdown(num-1);
		}
	}

	public static void main(String[] args) {
	
		countdown(10);

	}

}
