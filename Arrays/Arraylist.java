package arraylistclasswork;
import java.util.ArrayList;
public class Arraylist {
	
	
	
	
	
	public static ArrayList<Integer> fillMe (int size){
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			nums.add((int)(Math.random()*100+1));
		}
		return nums;
	}
	public static void removeOdds(ArrayList<Integer>numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i)%2==0) {
				numbers.remove(i);
				i--;
			}
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> nums = fillMe(100);
		System.out.println(nums.toString());
		removeOdds(nums);
		 ArrayList<Integer> list = new ArrayList<>();
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);
		 list.add(5);
		 list.add(6);
		    System.out.println(mirror(list));
		

	}
	
	
	

	public static ArrayList<Integer> mirror(ArrayList<Integer> mr) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> flist = new ArrayList<>();
		int size = mr.size() /2;
	    System.out.println(size);
	    
	    for(int i = 0; i < size; i++) {
	    	list1.add(mr.get(i));
	    }
	    
	    for(int i = size; i <= mr.size()-1; i++) {
	    	list2.add(mr.get(i));
	    }
	    for(int i = list1.size()-1; i >= 0; i-- ) {
	    	list1.add(mr.get(i));
	    }
	    
	    for(int i = list2.size()-1; i >= 0; i-- ) {
	    	list2.add(mr.size()-i);
	    }
	    
	    for(int i = 0; i < list1.size(); i++) {
	    	flist.add(list1.get(i));
	    }
	    for(int i = 0; i < list2.size(); i++) {
	    	flist.add(list2.get(i));
	    }
	    
	    return flist;
	}

}
