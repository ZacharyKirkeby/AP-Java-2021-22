package ch8;

public class HomecomingFriday {

	public static void main(String[] args) {
		int[] testScores = histogram(1000);
		printArray(testScores);
	}

	
	
	
	public static int[] histogram(int histo) {
		int[] nums = new int[histo];
		for (int i = 0; 1< nums.length; i++) {
			nums[i] = (int)(Math.random()*100+1);
		}
			
		
		return nums;
	}
	
	public static int[] histogram2(int[] histo) {
		int[] scoresHisto = new int[5];
		
		for (int i = 0; i < histo.length; i++) {
			if (histo[i] >= 90) {
				scoresHisto[0]++;
			}else if(histo[i] >= 80) {
				scoresHisto[1]++;
			}else if (histo[i]>= 70) {
				scoresHisto[2]++;
			}else if (histo[i]>= 60) {
				scoresHisto[3]++;
			}else if (histo[i]>= 50) {
				scoresHisto[4]++;
			}
		}
		
		
		
		return scoresHisto;

	}

public static void printArray(int[] nums) {
	System.out.print("{");
	for (int i = 0; i < nums.length; i++) {
		System.out.print(nums[i]+",");
	}
	System.out.println("}");
}  











} 
		
		

