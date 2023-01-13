import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    System.out.println(alphaDistance("ABCD","AAAA"));
    System.out.println(alphaDistance("AAAA","ABCD"));
    //the tests are impossible to run at the same time.
  }
  public static String alphaDistance(String a, String b){
    int diff = 0;
    String solution = "\"Distances: ";
    ArrayList<Integer> nums = new ArrayList<>();
    for (int i = 0; i < a.length(); i++){
      if (b.charAt(i) >= a.charAt(i)){
        nums.add(b.charAt(i) - a.charAt(i));
      }else if(b.charAt(i) < a.charAt(i)){
        nums.add((b.charAt(i) + 26) - a.charAt(i));
      }
      
     
    }
   


    
    return solution + nums.toString() + "\"";
  }
}

 

