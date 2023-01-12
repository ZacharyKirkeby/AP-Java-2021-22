package ch8;

public class Eightbookproblems {

	public static void main(String[] args) {
		int[] nums = fillArray(100);
		double[] nums2 = fillArrayD(10);
		powArray(nums2,5);
		histogram(nums,100);
		indexOfMax(nums);
		sieve(5);
		areFactors(5, nums);
		maxInRange(nums, 2,98);
	}

	
	public static int[] fillArray(int n) {
		int[] randomNums = new int[n];
		
		for (int i = 0; i < randomNums.length; i++) {
			randomNums[i] = (int)(Math.random()*100+1);
		}
		
		
		return randomNums;
		
	}
	
	
	public static double[] fillArrayD(int n) {
		double[] randomNums = new double[n];
		
		for (int i = 0; i < randomNums.length; i++) {
			randomNums[i] = (int)(Math.random()*100+1);
		}
		
		
		return randomNums;
		
	}
	
	
	
	
	
	
	public static double[] powArray(double[] array, double power){
	      double[] a = new double[array.length];
	      for (int i=0;i<array.length;i++){
	         a[i] = Math.pow(array[i],power);
	      }
	      return a;
	   }
	   
	   public static int[] histogram(int[] array, int count){
	      int[] counter = new int[count];
	      for (int element:array){
	         counter[element]++;
	      }
	      return counter;
	   }
	   
	   
	   
	   public static int indexOfMax(int[] numbers){
		      int index = 0;
		      for (int i=1;i<numbers.length;i++){
		         if (numbers[i] > numbers[index]){
		            index = i;
		         }
		      }
		      return index;
		   }
	   
	   public static boolean[] sieve(int n){
		      boolean[] result = new boolean[n];
		      for (int i=2;i<n;i++)
		         result[i] = true;
		      for (int number=2;number<=(int)Math.sqrt(n);number++){
		         if (result[number] == true){
		            for (int indexInSeries = number*number;indexInSeries < n;indexInSeries += number){
		               result[indexInSeries] = false;
		            }
		         }
		      }
		      return result;
		   }
	   
	   public static boolean areFactors(int n, int[] factors){
		      for (int factor:factors){
		         if (n % factor != 0)
		            return false;
		      }
		      return true;
		   }
	   
	   
	   
	   
	   public static int maxInRange(int[] integers, int lowIndex, int highIndex){
		      if (lowIndex == highIndex){
		         return integers[lowIndex];
		      }
		      int mid = (lowIndex + highIndex) / 2;
		      return Math.max(maxInRange(integers,lowIndex,mid),maxInRange(integers,(mid + 1),highIndex));
		   }

		   public static int max(int[] integers){
		      return maxInRange(integers, 0, integers.length - 1);
		   }
	   
		  
		  
	   
}
	
	