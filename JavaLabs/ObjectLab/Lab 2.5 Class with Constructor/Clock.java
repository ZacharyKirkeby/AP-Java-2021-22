/* Write the Clock class
 * 
 * This class should have 2 instance variables to represent the time:
 *   hour
 *   minute
 * 
 * The constructor should take 2 parameters, which are used to initialize the instance variables
 * 
 * The toString method should return a string in the following format:
 *   "The time is HH:SS" Where HH and SS are replaced with the values of the appropriate instance variables
 
 * tick
 * parameter: numMinutes
 * returns nothing
 * Increments the number of minutes on the clock
 * If necessary, changes the number of hours appropriately
 */
 public class Clock{

private int mins;
private int hours;

public Clock(int h, int m){
  mins = m;
  hours = h;
}

public String toString(){
  return "It is " + hours + ":" + mins;
}

public void tick(int v){
  mins+=v;
  if(mins > 60){
    mins = 0;
    hours+=1;
  }else if(hours>12){
    hours = 1;
  }
}




 }