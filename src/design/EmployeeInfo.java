package design;

import java.util.Scanner;

public class EmployeeInfo extends exAbstract implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private int empID;
	private String empName;
	private double monthlySalary;
	private String dptName;
	private char sex;
	private boolean usCitizen;
	private int performance;
	private String  getDepartment;
	public EmployeeInfo(){}
	public EmployeeInfo(int empID,String empName,String dptName){
		this.empID = empID;
		this.empName = empName;
		this.dptName = dptName;
		System.out.println("Macy's store manger  ID: "+ empID+"Name: "+empName+"Primary departmetn " +dptName);
		}
		public EmployeeInfo(int empID,String empName,String dptName ,double monthlySalary,char sex,boolean usCitizen,int performance){
		this.empID=empID;
		this.empName = empName;
		this.dptName = dptName;
		this.monthlySalary =monthlySalary;
		this.sex= sex;
		this.usCitizen = usCitizen;
		this.performance = performance;
		System.out.println("Macy's store manger  ID: "+ empID+"Name: "+empName+"Primary departmetn " +dptName+"Salary :"+monthlySalary+"SEX :"+sex+"Citizenship :"+usCitizen+"Performance: "+performance);

		}
		public int getEmpID(){
		return empID;
		}
		public void setEmpID(int empID){
		this.empID = empID;
		}
        public String getEmpName(){
		return empName;
		}
		public void setEmpName(String empName){
		this.empName = empName;
		}
		public String getDptName(){
		return dptName;
		}
		public void setDptName(String dptName){
		this.dptName = dptName;
		}
		public double getMonthlySalary(){
		return monthlySalary;
		}
		public void setMonthlySalary(double monthlySalary){
		this.monthlySalary=monthlySalary;
		}
		public char getSex(){
		return sex;
		}
		public void setSex(char sex){
		this.sex = sex;
		}
		public boolean isUsCitizenusCitizen(){
		return usCitizen;
		}
		public void setUsCitizen(boolean usCitizen){
		this.usCitizen = usCitizen;
		}
		public int getPerformance(){
		return performance;
		}
		public void setCompanyName(int performance){
		this.performance= performance;
		}
		public String getDepartment(String getDepartment){
		return getDepartment;
		}
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	@Override
	public void hospitalDescription() {

	}

	@Override
	public void setPerformance(int i) {

	}

	@Override
	public void setDepartment(String medicine) {

	}

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		
	}
	public static void
    public EmployeeInfo(String name, int employeeId){
		
	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;
		return total;
	}
	public double calculateEmployeeBonus(double salary,int performance){
		this.monthlySalary = salary;
		this.performance = performance;
		double yearlyBonus =0;
		if(performance ==5){
			yearlyBonus = salary+.2*12;
		}
		else if(performance ==4){
			yearlyBonus =salary +.1*12;
		}
		else if(performance ==3){
			yearlyBonus =salary+.08*12;
		}
		else if(performance ==2){
			yearlyBonus =0;
			System.out.println("We are waiting for board decision to fire yu");
		}
		return yearlyBonus;

	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
        String startYear = convertedJoiningDate.substring(convertedJoiningDate.length()-4,convertedJoiningDate.length());
        String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length()-4,convertedTodaysDate.length());
        int start = Integer.parseInt(startYear);
        int current = Integer.parseInt(currentYear);
        int numberOfYears = current-start;
        if(numberOfYears >=5){
        	//total = (int) (salary* .25);
		}
        else if(numberOfYears ==4){
        	//total = (int)(salary*.2);
		}
        System.out.println(total);
        //implement numbers of year from above two dates
		//Calculate pension

		return total;
	}

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public String employeeName() {
		return null;
	}

	@Override
	public void assignDepartment() {

	}

	@Override
	public int calculateSalary() {
		return 0;
	}

	@Override
	public void benefitLayout() {

	}

	@Override
	public double calculateEmployeeYearlyBonus(double monthlySalary, int performance) {
		return 0;
	}

	@Override
	public int calculateEmployeeMonthlyPension(int monthlySalary) {
		return 0;
	}

	//@Override
	public void hardExam() {

	}
	public void healthInsurance(){
		System.out.println("");
	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
