import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> nums = new ArrayList<>();
    nums.add(2);
    nums.add(4);
	}
	//create your method below
	public static void timesTwo(ArrayList<Integer> nums){
    for (int i = 0; i < nums.size(); i++){
      nums.set(i,nums.get(i)*2);
    }
    System.out.println(nums.toString());
  }
}