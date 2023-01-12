package inClass;

public class MakeChange {
	
	public static int makeChange(int cash, int cost) {
		int d = cash - cost;
		if (d < 0) {
			System.out.println("not enough");
		} else if (d == 0) {
			System.out.println("no change");
		} else {
			double q = d/25;
			d = d%25;
			System.out.println(d); }
		System.out.println(d);	
		return 0;
			
			
			
		}
		
				
		
		
	

	public static void main(String[] args) {
		makeChange(5,4);
		

	}

}

