package design;

public class EmployeeMicro  extends EmployeeInfo{
    public EmployeeMicro(){

    }
    public static void bethIsraelInfo(){

    }

    public void calculateEmployeeYearlyBonus(double salary, int performance){
        double yearlyBonus = 0;
        if(performance ==5){
            yearlyBonus = salary*.1*12;
        }
        else if(performance == 4){
            yearlyBonus = salary*.07*12;
        }
        System.out.println("you ae getting bonus based on your proformance");

    }
}
