public class Snowflake{
private int points;
private int quantity;

public Snowflake(int point){
  points = point;
  quantity = 0;
}

public int getPoints(){
  return points;
}
public void increase(){
  quantity++;
}
public int getQuantity(){
  return quantity;
}
public void decrease(){
  quantity--;
}

}