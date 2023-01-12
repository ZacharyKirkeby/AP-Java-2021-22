
public class twoD {

	public static void main(String[] args) {
		
		int[][] nums = new int[8][4];
		// TODO Auto-generated method stub
		
		
		
		for(int row = 0; row < nums.length; row++) {
			for(int col = 0; col < nums[0].length; col++) { //if jagged check rows instead of 0
				int r = (int)(Math.random() * 100 +1);
				nums[row][col] = r;
			}
		}
		print2D(nums);
		System.out.println(printMax(nums));	
		int[] sum = sums(nums);
		printArray(sum);
		int[] downSum = colSum(nums);
		System.out.println();
		printArray(downSum);
		
	}

	public static void print2D(int[][] nums ) {
		for(int row = 0; row < nums.length; row++) {
			for(int col = 0; col < nums[0].length; col++) {
				System.out.print(nums[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static int printMax(int[][] nums) {
		int max = 0;
		for(int row = 0;row < nums.length; row++) {
			for(int col = 0; col < nums[0].length; col++) {
				if(max < nums[row][col]) {
					max = nums[row][col];
				}
			}
		}
		
		
		
		
		return max;
	}
	
	
	public static int[] sums(int[][] nums) {
		int[] num = new int[nums.length];
		for(int row = 0; row < nums.length; row++) {
			int sum = 0;
			for(int col = 0; col < nums[0].length; col++) {
				sum+= nums[row][col];
			}
			num[row] = sum;
		}
		
		
		return num;
	}
	
	public static void printArray(int[] num) {
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ", ");
		}
	}
	
	
	
	public static int[] colSum(int[][] nums) {
		int[] num = new int[nums[0].length];
		int sum = 0;
		for(int i = 0; i < nums[0].length; i++) {

			for(int col = 0; col < nums.length; col++) {
			sum+= nums[col][i];
		}
			num[i] = sum;
			sum = 0;
		}
		
		return num;
		
	}
	
}
