import java.util.ArrayList;

class Main{

  public static void main(String[] args){
    fillMe(100);
  }

public static ArrayList<Integer> fillMe (int size){
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			nums.add((int)(Math.random()*100+1));
		}
		return nums;
}
}