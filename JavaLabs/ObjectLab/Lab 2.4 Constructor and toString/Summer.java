/* Add a constructor to this class that takes 1 parameter
 * And uses that parameter to assign an initial value to the instanve variable
 * 
 * Add a toString method to this class that return a String in the format:
 *  "The total is [TOTAL]" where [TOTAL] is replaced by the value of the instance variable
 */
public class Summer
{
  private int total;
  
  public Summer(){
    total = 0;
  }

  public Summer(int num){
   total = num; 
  }

  public int getSum()
  {
    return total;
  }
  
  public void add(int other)
  {
    total += other;
  }

  public String toString(int tot){
    return "The total is " + tot + " where " + tot + " is replaced by the value of the instance variable";
  }

}