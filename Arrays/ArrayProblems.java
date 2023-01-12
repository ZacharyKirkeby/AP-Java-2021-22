package arraypractice;

public class Arrayproblems {

	public static void main(String[] args) {
		int[] nums = fillArray(10);
		fillArray(10);
		printArray(nums);
		System.out.println("max = " + findMax(nums));
		System.out.println("min = " + findMin(nums));
		System.out.println("max is found at " + maxIndex(nums));
		System.out.println("min is found at " + minIndex(nums));
	}

	
	public static int[] fillArray(int n) {
		int[] randomNums = new int[n];
		
		for (int i = 0; i < randomNums.length; i++) {
			randomNums[i] = (int)(Math.random()*100+1);
		}
		
		
		return randomNums;
		
	}
	
	
	public static void printArray(int[] nums) {
		System.out.print("{");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println("}");
	}  
	
	
	
	public static int findMax (int[] nums) {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(nums[i],max);
		}
		
		return max;
	}
	
	public static int findMin(int[] nums) {
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			min = Math.min(nums[i],min);
		}
		return min;
	}
	public static int maxIndex(int[] nums) {
		int maxIndex = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[maxIndex]) {
				maxIndex = i;
			}
		}
		
		return maxIndex;
		}
	public static int minIndex(int[] nums) {
		int minIndex = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[minIndex]) {
				minIndex = i;
			}
		}
		
		return minIndex;
		}	
		
	}
