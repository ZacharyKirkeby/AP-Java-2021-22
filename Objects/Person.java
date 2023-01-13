import java.util.Random;
public class Person{
  private String fName;
  private String lName;
  private int age;
  private int ID;

  public Person(){
    this.fName = "John";
    this.lName = "Doe";
    this.age = 65;
    this.ID = 111111;

  }

  public Person(String first, String last, int a, int i){
    this.fName = first;
    this.lName = last;
    this.age = a;
    this.ID = i;
  }
  public String toString(){
    return this.fName + " " + this.lName + " is " + this.age + " years old, workers ID: " + this.ID;
  }

  public boolean isEqual(Person other){
    if (this.ID == other.ID){
      return true;
    }else
      return false;
  }
  public void ageUp(){
    this.age+=1;
  }

  public String greeting(){
    return "hello " + this.fName;
  }
  public void changeName(String name ){
    this.fName = name;
  }
  

}