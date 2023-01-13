class Main {
  public static void main(String[] args) {
        Summer adder = new Summer();
    System.out.println( adder.getSum() );

    adder.add(9);
    System.out.println( adder.getSum() );

    Summer s = new Summer(5);
    
    s.add(3);
    s.add(7);

    System.out.println( s.getSum() );
    
    System.out.println( s.toString() );
  }
}