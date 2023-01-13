class Main {
  public static void main(String[] args) {
    // instantiate a few Student objects and call methods on them
  Student bob = new Student();
  bob.setName("bob");
  bob.getName();
  System.out.println(bob.getName());

  Student bart = new Student("bart");
  bart.setName("bart");
  bart.getName();
  System.out.println(bart.getName());
  bart.getGrade();
  System.out.println(bart.getGrade());

  Student bart2 = new Student("bart",10);
  bart2.setName("bart");
  System.out.println(bart2.getName());
  System.out.println(bart2.getGrade());



  Student lisa = new Student("Lisa",9);
  System.out.println(lisa.getName());
  System.out.println(lisa.getGrade());


  }
}