import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> nums = new ArrayList<>();
    nums.add(2);
    nums.add(2);
    nums.add(74);
    nums.add(2);
    nums.add(12);
    nums.add(0);
    nums.add(-3);
    nums.add(-5);
    System.out.println(appendPosSum(nums));
	}
	//create your method below
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
    ArrayList<Integer> nums2 = new ArrayList<>();
    for (int i = 0; i < nums.size(); i++){
      if (nums.get(i) > 0){
        nums2.add(nums.get(i));
      }
    }
    int sum = 0;
    for (int i = 0; i < nums2.size(); i++){
      sum+=nums2.get(i);
      }
    System.out.println(sum);
    return nums2;
  }
}