package WhileLoopHW;

public class whileLoophw {

	public static void main(String[] args) {
		int count = 1;
		while (count<=99) {
			System.out.println(count);
			count = count + 2;
		}

		
		int count2 = 300;
		while(count2 > 0) {
			System.out.println(count2);
			count2 = (count2)-3;
		}
		
		printLine(50);
		displayNumbers(26,56);
		tenOnALine(23);
		highLow(1,100);
	}
		public static void printLine(int x){
			int count =1;
			while (count<=x) {
				System.out.println(count);
				count = count +1;
				}
		
		
			
		}
		
		public static void highLow(int hi, int low) {
			while (low<=hi) {
				if(low%4==0 && low%5 == 1) {
					System.out.println(low);
					low = low+1;
				}else 
					low = low+1;
			}
		}
		
		
		
		
		
		public static void displayNumbers(int sta, int end) {
			while(sta<=end) {
				System.out.print(sta + " ");
				sta = sta + 1;
			}
		}
		
		
		public static void tenOnALine(int num) {
			int count = 1;
			int perline =0;
			while(count<=num) {
				if (perline >=10) {
					System.out.println("");
					perline = 0;
				}else {
					System.out.print(count +",");
					count = count + 1;
					perline = perline + 1;
				}
				
			}
		
			}
		}
