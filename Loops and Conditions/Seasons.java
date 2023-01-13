class Main {

  public static String seasons(int month, int day) {
    if ((month == 12 && day >= 21) || (month <=2) || (month == 3 && day <=20)){
      return "winter"; }
      else if ((month == 3 && day >= 21) || (month == 4) || (month == 5 && day <=20)){
        return "spring";
      }
      else if ((month == 5 && day >= 21) || (month == 6 || month == 7 ) || (month == 8 && day <=20)){
        return "summer";}
      
      else if ((month == 8 && day >= 21) || (month == 9 || month == 10 || month == 11 || month == 12 && day <=20)){}
        return "fall";}
  





  
  public static void main(String[] args) {
    System.out.println(seasons (1,5) + "=winter");
    System.out.println(seasons (3,25)+ "=spring");
    System.out.println(seasons (6,22)+ "=summer");
    System.out.println(seasons (12,20)+ "=fall");

    
  }
}