import java.util.ArrayList;
public class SnowStorm{
  private ArrayList<Snowflake> storm;

  public SnowStorm(){
    storm = new ArrayList<Snowflake>();
    
  }
  
  public void addSnowflake(int p){
   boolean in = false;
    if(storm.size() == 0){
      storm.add(new Snowflake(p));
    }
    for(Snowflake s: storm){
      if (s.getPoints() == p){
        s.increase();
        in = true;
      }
    }
    if(in == false){
      storm.add(new Snowflake(p));
    }
  }

  public void removeSnowflake(){
    for(Snowflake s:storm){
      if (s.getQuantity() > 1){
        s.decrease();
      }else if(s.getQuantity() == 0){
        storm.remove(s);
    }
    }
  }

  public void flakeCount(){ 
    for(Snowflake s:storm){
      System.out.println(s.getPoints() + "\t" + s.getQuantity());
    }

  }

}