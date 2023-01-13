public class HarvardLawyer extends Lawyer{
  public double getSalary(){
    double pay = super.getSalary();
    return pay + pay*.2;
  }

  public int vacationDays(){
    int vaca = super.getVacation();
    return vaca+3;
  }

  public String forms(){
    String form ="";
    for(int i = 0; i < 4; i++){
      form+=super.getVacationForm();
    }
    return form;
  }




}