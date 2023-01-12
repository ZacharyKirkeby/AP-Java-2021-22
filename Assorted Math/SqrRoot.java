package Ch7;

public class SqrRoot {

	public static void main(String[] args) {
		squareRoot(9);
	}
	public static double squareRoot(double num) {
		//x1 =(x0 + a/x0) / 2 
		double x = num - 3;
		double ans;
		while(num>0) {
			ans = (x + num/x)/2;
			x = ans;
			System.out.println(x);
			
		}

		return num;
		
	}
}
