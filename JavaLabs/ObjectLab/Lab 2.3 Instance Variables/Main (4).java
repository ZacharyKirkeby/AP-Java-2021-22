class Main {
  public static void main(String[] args) {
        Radio r = new Radio();
    System.out.println(r.getStation()); // should be 0.0
    
    r.setStation(95.5);
    System.out.println(r.getStation()); // should be 95.5
    
    r.changeStation(1.4);
    System.out.println(r.getStation()); // should be 96.9
    
    r.nextStation();
    System.out.println(r.getStation()); // should be 97.1
    
    r.nextStation();
    System.out.println(r.getStation()); // should be 97.3
    
    r.prevStation();
    r.prevStation();
    r.prevStation();
    System.out.println(r.getStation()); // should be 96.7
  }
}