class Main {
  public static void main(String[] args) {
    Clock c = new Clock(3, 30);
    
    System.out.println( c );
    
    c.tick(15);
    System.out.println( c );
    
    c.tick(35);
    System.out.println( c );
  }
}