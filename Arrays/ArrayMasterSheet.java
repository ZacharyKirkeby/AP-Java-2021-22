import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
   /*
Test Cases:

    printArray(fillRandom(10,0,100));
    printArrayList(fillRandomList(10,0,10));
    int[] nums = fillRandom(10,0,100);
    ArrayList<Integer> nums2 = fillRandomList(10,0,100);
   System.out.print(isIncreasing(fillRandom(10,0,100)));
   System.out.print(isIncreasingList(fillRandomList(10,0,100)));
  
  int[] mintester = new int[]{6,5,4,3,2,1,6};
  System.out.println(findMinIndex(mintester));

  ArrayList<Integer> minTester = new ArrayList<Integer>();
  for(int i = 0; i < 8; i++){
    minTester.add(i);
  }
  System.out.println(findMinIndex(minTester));

  System.out.println(findMinInRange(mintester, 1, 6));

*/
printArray(fillRandom(10,10,100));


  }
  public static int[] fillRandom(int s, int l, int h){
    int[] nums = new int[s];
    for(int i = 0; i < nums.length; i++){
      nums[i] = l + (int)(Math.random()* (h - l));
    }
    return nums;
  }

  public static void printArray(int[] nums){
    for(int i = 0; i < nums.length; i++){
      System.out.print(nums[i] + ", ");
    }
  }
public static ArrayList<Integer> fillRandomList(int s, int l, int h){
    ArrayList<Integer> nums = new ArrayList<>();
    for(int i = 0; i < s; i++){
      nums.add((int)(Math.random()* h + l));
    }
    return nums;
  }

  public static void printArrayList(ArrayList<Integer> nums){
    for(int i = 0; i < nums.size(); i++){
      System.out.print(nums.get(i));
    }
  }

  public static boolean isIncreasing(int[] nums){
  for(int i = 0; i < nums.length; i ++){
    if(nums[i] < nums[i+1]){
      return false;
      }
      }
  return true;
  }

  public static boolean isIncreasingList(ArrayList<Integer> nums){
  for(int i = 0; i < nums.size(); i ++){
    if(nums.get(i) < nums.get(i+1)){
      return false;
      }
      }
  return true;
  }

public static void swap(int[] nums, int i, int j){
  int first = nums[i];
  int second = nums[j];
  nums[i] = second;
  nums[j] = first;
}

public static void sort(int[] nums){
  while(isSorted(nums)!= true){
    for(int i = 0; i < nums.length; i++){
      int first = nums[i];
      int last = nums[i+1];
      if(first < last){
        nums[i] = last;
        nums[i+1] = first;
      }
    }
  }
}
public static int[] sorter(int[] nums){
  while(isSorted(nums)!= true){
    for(int i = 0; i < nums.length; i++){
      int first = nums[i];
      int last = nums[i+1];
      if(first < last){
        nums[i] = last;
        nums[i+1] = first;
      }
    }
  }
  return nums;
}

public static boolean isSorted(int[] nums){
  for(int i = 0; i < nums.length; i ++){
    int first = nums[i];
    int last = nums[i+1];
    if(first < last){
      return false;
    }
  }
  return true;
}

public static boolean isSorted(ArrayList<Integer> nums){
  for(int i = 0; i < nums.size(); i ++){
    int first = nums.get(i);
    int last = nums.get(i+1);
    if(first < last){
      return false;
    }
  }
  return true;
}

public static void sortList(ArrayList<Integer> nums){
  while(isSorted(nums)!= true){
    for(int i = 0; i < nums.size(); i++){
      int first = nums.get(i);
      int last = nums.get(i+1);
      if(first < last){
        nums.remove(i+1);
        nums.add(i,last);
      }
    }
  }
}


public static ArrayList<Integer> sorterList(ArrayList<Integer> nums){
  while(isSorted(nums)!= true){
    for(int i = 0; i < nums.size(); i++){
      int first = nums.get(i);
      int last = nums.get(i+1);
      if(first < last){
        nums.remove(i+1);
        nums.add(i,last);
      }
    }
  }
  return nums;
}

public static int findMinVal(int[] nums){
  int lowest = 0;
  if(isSorted(nums) == true){
    lowest = nums[nums.length-1];
  }else
    nums = sorter(nums);
  lowest = nums[nums.length-1];
  return lowest;
 
}

public static int findMinVal(ArrayList<Integer> nums){
  int lowest = 0;
  if(isSorted(nums) == true){
    lowest = nums.get(nums.size()-1);
  }else
    nums = sorterList(nums);
  lowest = nums.get(nums.size()-1);
  return lowest;
 
}

public static int findMinIndex(int[] nums){
  int min = nums[0];
  int minIndex = 0;
  for(int i = 0; i < nums.length; i++){
    if(min > nums[i]){
      min = nums[i];
      minIndex = i;
    }
  }
  return minIndex;
}

public static int findMinIndex(ArrayList<Integer> nums){
  int min = nums.get(0);
  int minIndex = 0;
  for(int i = 0; i < nums.size(); i++){
    if(min > nums.get(i)){
      min = nums.get(i);
      minIndex = i;
    }
  }
  return minIndex;
}


public static int findMinInRange(int[] nums, int s, int e){
  int min = nums[s];
  for(int i = s; i <= e; i++){
    if(min > nums[i]){
      min = nums[i];
  }
  
}
return min;
}

public static int findMinInRange(ArrayList<Integer> nums, int s, int e){
  int min = nums.get(s);
  for(int i = s; i <= e; i++){
    if(min > nums.get(i)){
      min = nums.get(i);
  }
  
}
return min;
}






}
/*

completed

int[] fillRandom(int size, int low, int high)
ArrayList<Integer> fillRandom(int size, int low, int high)
boolean isIncreasing(int[] nums)
boolean isIncreasing(ArrayList<Integer> nums)
void sort(int[] nums)
void sort(ArrayList<Integer> nums)
int findMinValue(int[] nums)
int findMinValue(ArrayList<Integer> nums)
void swap(int[] nums, int i, int j)
int findMinIndex(int[] nums)
int findMinIndex(ArrayList<Integer> nums)
int findMinInRange(int[] nums, int a, int b)
int findMinInRange(ArrayList<Integer> nums, int a, int b)

*/