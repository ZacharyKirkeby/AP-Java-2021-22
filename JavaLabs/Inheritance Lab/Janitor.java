public class Janitor extends Employee{

  public int getHours(){
    int hours = super.getHours();
    return hours * 2;
  }

  public double getSalary(){
    double pay = super.getSalary();
    return pay - 10000.0;
  }

  public int getVacation(){
    int days = super.getVacationDays();
    return days/2;
  }

  public String clean(){
    return "Workin' for the man.";
  }
  
}