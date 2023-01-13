/* Write the class Radio
 * 
 * Instance variable for frequency (double freq)
 * 
 * void setStation(double station)
 * double getStation()
 * void changeStation(double amnt)
 * void nextStation() +0.2
 * void prevStation() -0.2
 */

public class Radio{

  private double frequency;

  public double getStation(){
    return frequency;
  }
  public void setStation(double f){
    frequency = f;
  }

  public void changeStation(double f){
    frequency += f;
  }
  public void nextStation(){
    frequency += 0.2;
  }
  public void prevStation(){
    frequency -= 0.2;
  }
  





 }