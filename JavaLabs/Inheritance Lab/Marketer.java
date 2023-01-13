public class Marketer extends Employee{
  
  public double getSalary(){
    double salary = super.getSalary();
    return salary + 10000.0; 
  }

  public String advertise(){
    return "Act now, while supplies last!";
  }
  
}