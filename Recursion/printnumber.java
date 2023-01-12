package inClass;

public class printnumber {
	
	public static int smallestOfThree (int a, int b, int c) {
		return Math.min(a, Math.min(b,c));
	}
		
			
	public static void printDigits(int num) {
		if ( num < 10) {
			System.out.println(num);
		}
		else {
			System.out.println(num%10); //move to bottom to flip order
			printDigits(num/10);
		    //System.out.println(num%10); //recursion last = unpacks backward
		}
	}


	public static void main(String[] args) {
		printDigits(12345);

	}

}
