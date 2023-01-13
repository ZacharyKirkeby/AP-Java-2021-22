class Main {
  public static void main(String[] args) {
    SnowStorm minnesota = new SnowStorm();
    minnesota.addSnowflake(2);
    minnesota.addSnowflake(2);
    minnesota.addSnowflake(2);
    minnesota.removeSnowflake();
    minnesota.flakeCount();
    minnesota.addSnowflake(3);
    
    
   minnesota.flakeCount();


  }
}