public class Lawyer extends Employee{
  public double getSalary(){
    double pay = super.getSalary();
    return pay + 20000.0;
  }

  public String getVacationForm(){
    return "pink";
  }

public int getVacation(){
  int vacation = 5;
  return vacation;
}

  
}