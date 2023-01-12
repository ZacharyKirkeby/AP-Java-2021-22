package homework;

public class ackerman {
	public static void main(String[] args) {
		System.out.println(Ack(2, 3));
	}
	public static int Ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if (m > 0 && n == 0) {
		return Ack(m - 1, 1);
		} else if (m > 0 && n > 0) {
			return Ack(m - 1, Ack(m, n - 1)); 
		}else {
			return 1;
		}
	}
}
	