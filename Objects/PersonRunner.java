class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Person Zach = new Person("Zach", "Kirkeby",16,123456);
    System.out.println(Zach.toString());
    Zach.ageUp();
    System.out.println(Zach.toString());
    Person zach = new Person("Zach", "Kirkeby",16,123456);
    System.out.println(Zach.equals(zach));
  }
}