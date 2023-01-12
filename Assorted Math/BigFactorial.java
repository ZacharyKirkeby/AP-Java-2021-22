package objectIntro;
import java.math.BigInteger;
public class BigFactorial {
	
	

	
	public static BigInteger factorials(BigInteger num) {
		
		
		BigInteger big = num;
		if (big == BigInteger.valueOf(0)) {
			return BigInteger.valueOf(1);
			
		}else {
			return big.multiply(factorials(big.subtract(BigInteger.valueOf(1))));
		}
		
		
	}

	public static void main(String[] args) {
		BigInteger num = BigInteger.valueOf(100);
		System.out.println(factorials(num));
		

	}



}
