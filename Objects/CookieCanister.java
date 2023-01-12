public class CookieCanister{

private int capacity;
private int maxCapacity;
private boolean openClosed;
private String type;

public CookieCanister(int maxCap, String flavor){
  capacity = 0;
  maxCapacity = maxCap;
  openClosed = false;
  type = flavor;
}

public void open(){
  openClosed = true;
}
public void close(){
  openClosed = false;
}
public void dispense(int quan){
  if(quan > capacity){
    capacity = 0;
  }else
    capacity = capacity - quan;
}
public void add(int quan){
  if(quan > maxCapacity){
    capacity = maxCapacity;
  }else
    capacity = capacity + quan;
}
public void fillCap(){
  capacity = maxCapacity;
}
public void whatType(){
  System.out.println(type);
}
public void whatCap(){
  System.out.println(capacity);
}
public void whatMaxCap(){
  System.out.println(maxCapacity);
}
public void isOpen(){
  System.out.println(openClosed);
}
public void cookieStats(){
  System.out.println("There are " + capacity + "of the " + type + " with a max amount of " + maxCapacity + "  and the jar is open is " + openClosed);
}



}