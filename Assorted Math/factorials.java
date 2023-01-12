package inClass;

public class factorials {
	
	public static int factorials(int num) {
		if (num == 0) {
			return 1;
			
		}else {
			return num * factorials(num-1);
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println( factorials(5) );
		

	}

}
