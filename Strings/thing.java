
public class thing {

	public static void main(String[] args) {
		int[] in = {888, 501, 151, 140, 111};
		//paliTester(in);
		for(int i = 0; i < 15; i++) {
			System.out.println(randTester());
		}
		
	}
	
	
	
	
	
	public static void paliTester(int[] input) {
		for(int i = 0; i < input.length; i++) {
			int test =+ input[i] + Pali(input[i]);
			test =+ test + Pali(test);
			test =+ Pali(test);
			System.out.println(isPali(test));			
		}
	}
	
	public static boolean isPali(int num) {
		return (num/100 == num%10);
	}
	
	public static int Pali(int num) {
		int n = num%10;
		num = num/10;
	    n = n*10 + num%10;
	    num = num/10;
		n= n*10 + num%10;
		return n;
		
		
	}
	
	
	
	
	
	
	public static int randTester() {
		return (int) (Math.random()*80+20);
	}

}
