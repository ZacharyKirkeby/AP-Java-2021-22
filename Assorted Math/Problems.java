package Ch7;

public class Problems {

	public static void main(String[] args) {
		System.out.println("Hello");
		pow(3.0,3);
		factorial(4);
		squareRoot(49.0);
		myexp(7.0,3);
		gauss(2,50);

	}
//factorial problem
	public static double pow(double base, int expo) {
		double ans = 1;
		
		while (expo>0) {
			ans= base * ans;
			expo--;
		}
		
		System.out.println(ans);
		return ans;
	}

	public static int factorial(int num) {
		int ans=1;
		while (num>0) {
			ans*=num;
			num--;
		}
		
		System.out.println(ans);
		return ans;
	}


	public static double squareRoot(double num) {
		//x1 =(x0 + a/x0) / 2 
		double x0 = num/2;
		double x1= (x0 + num/x0)/2;
		while(Math.abs(x1-x0)>0.0001){
			x0=x1;
			x1= (x0 + num/x0)/2;
			
		}
		System.out.println(x1);
		return x1;
		
	}
	
	
	 public static double myexp(double x, int n){
	      double ans = 1;
	      double p = 1;
	      double q = 1;
	      for (int i=1;i<n;i++){
	         ans += (p*=x)/(q*=i);
	      } 
	      System.out.println(ans);
	      return ans;
	     
	   }
	 public static void check(double x){
	      int i = 1;
	      System.out.println(x+"\t"+myexp(x, i)+"\t"+Math.exp(x));
	 }




	 public static double gauss(double x, int n){
	      double result = 1;
	      int a = 1;
	      double b = 1;
	      int bef = 1;
	      for (int i=1;i<n;i++){
	         result += (bef*=-1)*(a*=x*x)/(b*=i);
	      }
	      System.out.println(result);
	      return result;
	   }







}
