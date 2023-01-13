 public class Date {
	//1.  Write a class definition for Date, 
	//    an object type that contains three 
	//    integers: year, month, and day.
	private int year;
  private int month;
  private int day;
	
	//2.  This class should provide two constructors. 
	//    The first should take no parameters and initialize a 
	//        default date. 

  public Date(){
    this.year = 2000;
    this.month = 1;
    this.day = 1;
  }
	
	//3.  The second should take parameters named year, month and day, 
	//    and use them to initialize the instance variables.
	
	public Date(int a, int b, int c){
    this.year = a;
    this.month = b;
    this.day = c;
  }
	
	//setters
	

	//5.  Create a method isDate that verifies 
//					the year (>0), 
//					month (between 1 and 12) and 
//					day (between 1 and 30) 
	//      are valid.
	
	public void isDate(){
    if(this.year > 0){
      System.out.println("year is good");
    }
    if((this.month >= 1) && (this.month <= 12)){
      System.out.println("month is good");
    }
    if(this.day >= 1 && this.day <= 30){
    System.out.println("day is good");
    }
    
  }

	
}













